package com.example.admin.f_traveller;

import android.annotation.TargetApi;
import android.app.Activity;
import android.app.DatePickerDialog;
import android.app.Dialog;
import android.content.Intent;
import android.icu.util.Calendar;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.DatePicker;
import android.widget.ImageView;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

public class BookingActivity extends Activity implements AdapterView.OnItemSelectedListener {

    Spinner spinnerDialog, spinnerDropdown;
    ArrayAdapter adapter;

    Button btn, breturn;
    CheckBox cBreturn;
    int year_x, month_x, day_x;
    static final int DIALOG_ID=0;

    @TargetApi(Build.VERSION_CODES.N)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.activity_booking);

        showDialogOnButtonClick();

        final Calendar cal = Calendar.getInstance();

        year_x = cal.get(Calendar.YEAR);
        month_x = cal.get(Calendar.MONTH);
        day_x = cal.get(Calendar.DAY_OF_MONTH);




        final TextView Booking =(TextView)findViewById(R.id.tVbooking);
        final TextView tVfrom =(TextView)findViewById(R.id.tVfrom);
        final ImageView imline11 =(ImageView)findViewById(R.id.imline11);
        imline11.setImageResource(R.drawable.line);
        final TextView tVto =(TextView)findViewById(R.id.tVto);
        final ImageView imline12 =(ImageView)findViewById(R.id.imline12);
        imline12.setImageResource(R.drawable.line);
        final TextView tVdate =(TextView)findViewById(R.id.tVdate);
        final TextView tVreturn =(TextView)findViewById(R.id.tVreturn);
        final TextView date =(TextView)findViewById(R.id.date);




        adapter = ArrayAdapter.createFromResource(this, R.array.spinner_options, android.R.layout.simple_spinner_item);
        spinnerDialog=(Spinner)findViewById(R.id.spFrom);
        spinnerDialog.setAdapter(adapter);
        spinnerDialog.setOnItemSelectedListener(BookingActivity.this);

        spinnerDropdown=(Spinner)findViewById(R.id.spTo);
        spinnerDropdown.setAdapter(adapter);
        spinnerDropdown.setOnItemSelectedListener(BookingActivity.this);

        final Button bsearch =(Button)findViewById(R.id.bsearch);

        bsearch.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent s = new Intent(BookingActivity.this, BusesActivity.class);
                startActivity(s);
            }
        });

    }

    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
        TextView spinnerDialogText = (TextView) view;

        Toast.makeText(this, "You Selected " + spinnerDialogText.getText(), Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onNothingSelected(AdapterView<?> parent) {

    }

    public void showDialogOnButtonClick() {

        btn = (Button) findViewById(R.id.button);

        cBreturn =(CheckBox)findViewById(R.id.cBreturn);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showDialog(DIALOG_ID);
            }
        });
        cBreturn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showDialog(DIALOG_ID);
            }
        });

    }

    @Override
    protected Dialog onCreateDialog(int id){
        if(id==DIALOG_ID)
            return new DatePickerDialog(this, dpickerListener,year_x, month_x, day_x);
        return null;
    }
    private DatePickerDialog.OnDateSetListener dpickerListener = new DatePickerDialog.OnDateSetListener() {
        @Override
        public void onDateSet(DatePicker view,int dayOfMonth, int month, int year ) {

            year_x = year;
            month_x = month + 1;
            day_x = dayOfMonth;


            Toast.makeText(BookingActivity.this, year_x + "/"+ month_x + "/" + day_x , Toast.LENGTH_SHORT).show();
        }
    };

}

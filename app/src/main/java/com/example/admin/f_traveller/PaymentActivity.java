package com.example.admin.f_traveller;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

public class PaymentActivity extends Activity implements AdapterView.OnItemSelectedListener {
    Spinner  Dropdown;
    ArrayAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.activity_payment);


        final TextView tvpayment =(TextView)findViewById(R.id.tVpayment);
        final TextView tvamount =(TextView)findViewById(R.id.tvamount);
        final TextView tvmode =(TextView)findViewById(R.id.tvmode);

        final ImageView imlinep =(ImageView)findViewById(R.id.imlinep);
        imlinep.setImageResource(R.drawable.line);

        final ImageView imMpesa =(ImageView)findViewById(R.id.imMpesa);
        imMpesa.setImageResource(R.drawable.mpesa);
        final ImageView imAirtel =(ImageView)findViewById(R.id.imAirtel);
        imAirtel.setImageResource(R.drawable.airtel);
        final ImageView imequity =(ImageView)findViewById(R.id.imequity);
        imequity.setImageResource(R.drawable.equitel);
        final ImageView imkcb =(ImageView)findViewById(R.id.imkcb);
        imkcb.setImageResource(R.drawable.kcb);

        adapter = ArrayAdapter.createFromResource(this, R.array.spinner_amount, android.R.layout.simple_spinner_item);
        Dropdown=(Spinner)findViewById(R.id.sppayment);
        Dropdown.setAdapter(adapter);
        Dropdown.setOnItemSelectedListener(PaymentActivity.this);




        final Button bcomplete =(Button)findViewById(R.id.bcomplete);

        bcomplete.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(PaymentActivity.this, TicketActivity.class);
                startActivity(intent);
            }
        });


    }

    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
        TextView spinnerDropdownText = (TextView) view;

        Toast.makeText(this, "You Selected " + spinnerDropdownText.getText(), Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onNothingSelected(AdapterView<?> parent) {

    }
}

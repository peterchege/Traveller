package com.example.admin.f_traveller;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

public class BusesActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.activity_buses);

        final TextView tVbuses =(TextView)findViewById(R.id.tVbuses);
        final TextView tVlocation =(TextView)findViewById(R.id.tVlocation);
        final TextView tVbookeddates =(TextView)findViewById(R.id.tVbookeddate);
        final ImageView imline13 =(ImageView)findViewById(R.id.imline13);
        imline13.setImageResource(R.drawable.line);
        final LinearLayout linearLayout_modern = (LinearLayout) findViewById(R.id.linearLayout_modern);
        final LinearLayout linearLayout_mashpoa = (LinearLayout) findViewById(R.id.linearLayout_mashpoa);
        final LinearLayout linearLayout_Easycoach = (LinearLayout) findViewById(R.id.linearLayout_Easycoach);
        final LinearLayout linearLayout_Guardian = (LinearLayout) findViewById(R.id.linearLayout_Guardian);
        final LinearLayout linearLayout_Tahmeed = (LinearLayout) findViewById(R.id.linearLayout_Tahmeed);

        linearLayout_modern.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent b = new Intent(BusesActivity.this, SeatsActivity.class);
                startActivity(b);
            }
        });

        linearLayout_mashpoa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent b = new Intent(BusesActivity.this, SeatsActivity.class);
                startActivity(b);
            }
        });

        linearLayout_Guardian.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent b = new Intent(BusesActivity.this, SeatsActivity.class);
                startActivity(b);
            }
        });

        linearLayout_Tahmeed.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent b = new Intent(BusesActivity.this, SeatsActivity.class);
                startActivity(b);
            }
        });


    }
}

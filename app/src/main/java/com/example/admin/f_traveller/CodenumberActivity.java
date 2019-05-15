package com.example.admin.f_traveller;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

public class CodenumberActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.activity_codenumber);

        final EditText eTn1 =(EditText)findViewById(R.id.eTn1);
        final EditText eTn2 =(EditText)findViewById(R.id.eTn2);
        final EditText eTn3 =(EditText)findViewById(R.id.eTn3);
        final EditText eTn4 =(EditText)findViewById(R.id.eTn4);

        final ImageView imline3 =(ImageView)findViewById(R.id.imline3);
        imline3.setImageResource(R.drawable.line);

        final ImageView ivperson =(ImageView)findViewById(R.id.ivperson);
        ivperson.setImageResource(R.drawable.number);

        final TextView tvcode =(TextView) findViewById(R.id.tvcode);
        final TextView tvresend =(TextView)findViewById(R.id.tvresend);
        final Button Bcodeno = (Button)findViewById(R.id.Bcodeno);

        eTn1.setOnKeyListener(new View.OnKeyListener() {

            @Override
            public boolean onKey(View v, int keyCode, KeyEvent event) {
                // TODO Auto-generated method stub
                if (eTn1.getText().length() == 1)
                    eTn2.requestFocus();
                return false;
            }
        });

        eTn2.setOnKeyListener(new View.OnKeyListener() {

            @Override
            public boolean onKey(View v, int keyCode, KeyEvent event) {
                // TODO Auto-generated method stub
                if (eTn2.getText().length() == 1)
                    eTn3.requestFocus();
                return false;
            }
        });

        eTn3.setOnKeyListener(new View.OnKeyListener() {

            @Override
            public boolean onKey(View v, int keyCode, KeyEvent event) {
                // TODO Auto-generated method stub
                if (eTn3.getText().length() == 1)
                    eTn4.requestFocus();
                return false;
            }
        });

        Bcodeno.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent click = new Intent(CodenumberActivity.this, RegistrationActivity.class);
                startActivity(click);
            }
        });

    }
}

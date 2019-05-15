package com.example.admin.f_traveller;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

public class RegistrationActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.activity_registration);

        final TextView tvdetail =(TextView)findViewById(R.id.tvdetail);
        final EditText etfirstname =(EditText)findViewById(R.id.etfirstname);
        final ImageView imline5 =(ImageView)findViewById(R.id.imline5);
        imline5.setImageResource(R.drawable.line);
        final EditText etlastname =(EditText)findViewById(R.id.etlastname);
        final ImageView imline6 =(ImageView)findViewById(R.id.imline6);
        imline6.setImageResource(R.drawable.line);
        final EditText eTidno =(EditText)findViewById(R.id.eTidno);
        final ImageView imline7 =(ImageView)findViewById(R.id.imline7);
        imline7.setImageResource(R.drawable.line);
        final EditText eTemail =(EditText)findViewById(R.id.eTemail);
        final ImageView imline8 =(ImageView)findViewById(R.id.imline8);
        imline8.setImageResource(R.drawable.line);
        final EditText eTpassword =(EditText)findViewById(R.id.eTpassword);
        final ImageView imline9 =(ImageView)findViewById(R.id.imline9);
        imline9.setImageResource(R.drawable.line);
        final EditText eTconfirm =(EditText)findViewById(R.id.eTconfirm);
        final ImageView imline10 =(ImageView)findViewById(R.id.imline10);
        imline10.setImageResource(R.drawable.line);

        final Button bregister=(Button)findViewById(R.id.bregister);
        bregister.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
             /*   final String firstname = etfirstname.getText().toString();
                final String lastname = etlastname.getText().toString();
                final int  idno = Integer.parseInt(eTidno.getText().toString());
                final String email = eTemail.getText().toString();
                final String password = eTpassword.getText().toString();
                Response.Listener<String> responseListener = new Response.Listener<String>() {
                    @Override
                    public void onResponse(String response) {

                        try {
                            JSONObject jsonObject = new JSONObject(response);
                            boolean success = jsonObject.getBoolean("success");
                            if (success){*/
                                Intent r = new Intent(RegistrationActivity.this, BookingActivity.class);
                                startActivity(r);

                       /*     } else {
                                AlertDialog.Builder builder = new AlertDialog.Builder(RegistrationActivity.this);
                                builder.setMessage("Register Failed")
                                        .setNegativeButton("Retry", null)
                                        .create()
                                        .show();
                            }

                        } catch (JSONException e) {
                            e.printStackTrace();
                        }

                    }
                };
                RegisterRequest registerRequest = new RegisterRequest(firstname, lastname, idno, email, password, responseListener);
                RequestQueue queue = Volley.newRequestQueue(RegistrationActivity.this);
                queue.add(registerRequest);

           */ }
        });
    }
}

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

public class SignupActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.activity_signup);

        final ImageView iVkenya =(ImageView)findViewById(R.id.iVkenya);
        iVkenya.setImageResource(R.drawable.kenya);
        final TextView tVcountry =(TextView)findViewById(R.id.tVcountry);
        final ImageView imline1 =(ImageView)findViewById(R.id.imline1);
        imline1.setImageResource(R.drawable.line);
        final ImageView imline2 =(ImageView)findViewById(R.id.imline2);
        imline2.setImageResource(R.drawable.line);

        final EditText eTphonenumber=(EditText)findViewById(R.id.eTphonenumber);
        final Button bNext =(Button)findViewById(R.id.bNext);

        bNext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
             /*  final int phone_number = Integer.parseInt(eTphonenumber.getText().toString());

              Response.Listener<String> responseListener = new Response.Listener<String>() {
                    @Override
                    public void onResponse(String response) {

                        try {
                            JSONObject jsonObject = new JSONObject(response);
                            boolean success = jsonObject.getBoolean("success");
                            if (success){*/
                                Intent n = new Intent(SignupActivity.this, CodenumberActivity.class);
                                SignupActivity.this.startActivity(n);

                        /*   } else {
                                AlertDialog.Builder builder = new AlertDialog.Builder(SignupActivity.this);
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
                SignupRequest signupRequest = new SignupRequest(phone_number, responseListener);
                RequestQueue queue = Volley.newRequestQueue(SignupActivity.this);
                queue.add(signupRequest);

           */ }
        });
    }
}

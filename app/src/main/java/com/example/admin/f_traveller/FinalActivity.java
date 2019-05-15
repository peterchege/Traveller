package com.example.admin.f_traveller;

import android.app.Activity;
import android.os.Bundle;
import android.view.Window;
import android.widget.ImageView;
import android.widget.TextView;

public class FinalActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.activity_final);

        final TextView tvThank =(TextView)findViewById(R.id.tvThank);
        final ImageView imlinet=(ImageView)findViewById(R.id.imlinet);
        imlinet.setImageResource(R.drawable.line);
        final TextView tvTxt =(TextView)findViewById(R.id.tvTxt);

    }
}

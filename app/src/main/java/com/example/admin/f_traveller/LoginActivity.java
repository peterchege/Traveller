package com.example.admin.f_traveller;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.view.View;
import android.view.Window;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;

public class LoginActivity extends Activity {

    FloatingActionButton fab_plus, fab_twitter, fab_facebook;
    Animation Fabopen, Fabcloze, FabRclockwise, FabRanticlockwise;
    boolean isOpen = false;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.activity_login);

        fab_plus=(FloatingActionButton)findViewById(R.id.fab_plus);
        fab_twitter=(FloatingActionButton)findViewById(R.id.fab_twitter);
        fab_twitter.setImageResource(R.drawable.ic_action_twiter1);

        fab_facebook=(FloatingActionButton)findViewById(R.id.fab_facebook);
        fab_facebook.setImageResource(R.drawable.ic_action_facebook1);

        Fabopen= AnimationUtils.loadAnimation(getApplicationContext(),R.anim.fab_open);
        Fabcloze= AnimationUtils.loadAnimation(getApplicationContext(),R.anim.fab_close);
        FabRclockwise= AnimationUtils.loadAnimation(getApplicationContext(),R.anim.rotate_clockwise);
        FabRanticlockwise= AnimationUtils.loadAnimation(getApplicationContext(),R.anim.rotate_anticlockwise);

        fab_plus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(isOpen){
                    fab_facebook.startAnimation(Fabcloze);
                    fab_twitter.startAnimation(Fabcloze);
                    fab_plus.startAnimation(FabRanticlockwise);
                    fab_twitter.setClickable(false);
                    fab_facebook.setClickable(false);
                    isOpen = false;

                }
                else {
                        fab_facebook.startAnimation(Fabopen);
                        fab_twitter.startAnimation(Fabopen);
                        fab_plus.startAnimation(FabRclockwise);
                        fab_twitter.setClickable(true);
                        fab_facebook.setClickable(true);
                        isOpen = true;



                }
            }
        });



        final Button bSignup =(Button)findViewById(R.id.bSignup);
        final Button bLogin =(Button)findViewById(R.id.bLogin);

        bSignup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(LoginActivity.this,SignupActivity.class);
                LoginActivity.this.startActivity(intent);
            }
        });

        bLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent l = new Intent(LoginActivity.this,BookingActivity.class);
                LoginActivity.this.startActivity(l);
            }
        });
    }
}

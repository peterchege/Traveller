package com.example.admin.f_traveller;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

public class SeatsActivity extends Activity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.activity_seats);

        final ImageView Imavailable = (ImageView) findViewById(R.id.Imavailable);
        Imavailable.setImageResource(R.drawable.availableseat);
        final ImageView ImBooked = (ImageView) findViewById(R.id.ImBooked);
        ImBooked.setImageResource(R.drawable.bookedseat);
        final ImageView imselected = (ImageView) findViewById(R.id.imselected);
        imselected.setImageResource(R.drawable.selectedseat);
        final ImageView Imseatline = (ImageView) findViewById(R.id.Imseatline);
        Imseatline.setImageResource(R.drawable.line);

        final ImageButton iBs1 = (ImageButton) findViewById(R.id.iBs1);
        iBs1.setBackgroundResource(R.drawable.seat_booked);

        iBs1.setOnClickListener(new View.OnClickListener() {

            public void onClick(View button) {
                //Set the button's appearance
                iBs1.setSelected(!button.isSelected());

                if (button.isSelected()) {
                    //Handle selected state change
                } else {
                    //Handle de-select state change
                }

            }

        });



        final ImageView im2 =(ImageView) findViewById(R.id.im2);
        im2.setBackgroundResource(R.drawable.seat_booked);


        im2.setOnClickListener(new View.OnClickListener() {

            public void onClick(View button) {
                //Set the button's appearance
                im2.setSelected(!button.isSelected());

                if (button.isSelected()) {
                    //Handle selected state change
                } else {
                    //Handle de-select state change
                }

            }

        });

        final ImageView im3 =(ImageView)findViewById(R.id.im3);
        im3.setBackgroundResource(R.drawable.seat_booked);

        im3.setOnClickListener(new View.OnClickListener() {

            public void onClick(View button) {
                //Set the button's appearance
                im3.setSelected(!button.isSelected());

                if (button.isSelected()) {
                    //Handle selected state change
                } else {
                    //Handle de-select state change
                }

            }

        });

        final ImageView im4 =(ImageView)findViewById(R.id.im4);
        im4.setImageResource(R.drawable.bookedseat);

        final ImageView im5 =(ImageView)findViewById(R.id.im5);
        im5.setBackgroundResource(R.drawable.seat_booked);

        im5.setOnClickListener(new View.OnClickListener() {

            public void onClick(View button) {
                //Set the button's appearance
                im5.setSelected(!button.isSelected());

                if (button.isSelected()) {
                    //Handle selected state change
                } else {
                    //Handle de-select state change
                }

            }

        });

        final ImageView im6 =(ImageView)findViewById(R.id.im6);
        im6.setBackgroundResource(R.drawable.seat_booked);

        im6.setOnClickListener(new View.OnClickListener() {

            public void onClick(View button) {
                //Set the button's appearance
                im6.setSelected(!button.isSelected());

                if (button.isSelected()) {
                    //Handle selected state change
                } else {
                    //Handle de-select state change
                }

            }

        });

        final ImageView im7 =(ImageView)findViewById(R.id.im7);
        im7.setImageResource(R.drawable.bookedseat);


        final ImageView im8 =(ImageView)findViewById(R.id.im8);
        im8.setBackgroundResource(R.drawable.seat_booked);

        im8.setOnClickListener(new View.OnClickListener() {

            public void onClick(View button) {
                //Set the button's appearance
                im8.setSelected(!button.isSelected());

                if (button.isSelected()) {
                    //Handle selected state change
                } else {
                    //Handle de-select state change
                }

            }

        });

        final ImageView im9 =(ImageView)findViewById(R.id.im9);
        im9.setBackgroundResource(R.drawable.seat_booked);

        im9.setOnClickListener(new View.OnClickListener() {

            public void onClick(View button) {
                //Set the button's appearance
                im9.setSelected(!button.isSelected());

                if (button.isSelected()) {
                    //Handle selected state change
                } else {
                    //Handle de-select state change
                }

            }

        });

        final ImageView im10 =(ImageView)findViewById(R.id.im10);
        im10.setBackgroundResource(R.drawable.seat_booked);

        im10.setOnClickListener(new View.OnClickListener() {

            public void onClick(View button) {
                //Set the button's appearance
                im10.setSelected(!button.isSelected());

                if (button.isSelected()) {
                    //Handle selected state change
                } else {
                    //Handle de-select state change
                }

            }

        });

        final ImageView im11 =(ImageView)findViewById(R.id.im11);
        im11.setBackgroundResource(R.drawable.seat_booked);

        im11.setOnClickListener(new View.OnClickListener() {

            public void onClick(View button) {
                //Set the button's appearance
                im11.setSelected(!button.isSelected());

                if (button.isSelected()) {
                    //Handle selected state change
                } else {
                    //Handle de-select state change
                }

            }

        });

        final ImageView im12 =(ImageView)findViewById(R.id.im12);
        im12.setBackgroundResource(R.drawable.seat_booked);

        im12.setOnClickListener(new View.OnClickListener() {

            public void onClick(View button) {
                //Set the button's appearance
                im12.setSelected(!button.isSelected());

                if (button.isSelected()) {
                    //Handle selected state change
                } else {
                    //Handle de-select state change
                }

            }

        });

        final ImageView im13 =(ImageView)findViewById(R.id.im13);
        im13.setBackgroundResource(R.drawable.seat_booked);

        im13.setOnClickListener(new View.OnClickListener() {

            public void onClick(View button) {
                //Set the button's appearance
                im13.setSelected(!button.isSelected());

                if (button.isSelected()) {
                    //Handle selected state change
                } else {
                    //Handle de-select state change
                }

            }

        });


        final ImageView im14 =(ImageView)findViewById(R.id.im14);
        im14.setBackgroundResource(R.drawable.seat_booked);

        im14.setOnClickListener(new View.OnClickListener() {

            public void onClick(View button) {
                //Set the button's appearance
                im14.setSelected(!button.isSelected());

                if (button.isSelected()) {
                    //Handle selected state change
                } else {
                    //Handle de-select state change
                }

            }

        });


        final ImageView im15 =(ImageView)findViewById(R.id.im15);
        im15.setBackgroundResource(R.drawable.seat_booked);

        im15.setOnClickListener(new View.OnClickListener() {

            public void onClick(View button) {
                //Set the button's appearance
                im15.setSelected(!button.isSelected());

                if (button.isSelected()) {
                    //Handle selected state change
                } else {
                    //Handle de-select state change
                }

            }

        });

        final ImageView im16 =(ImageView)findViewById(R.id.im16);
        im16.setBackgroundResource(R.drawable.seat_booked);

        im16.setOnClickListener(new View.OnClickListener() {

            public void onClick(View button) {
                //Set the button's appearance
                im16.setSelected(!button.isSelected());

                if (button.isSelected()) {
                    //Handle selected state change
                } else {
                    //Handle de-select state change
                }

            }

        });

        final ImageView im17 =(ImageView)findViewById(R.id.im17);
        im17.setBackgroundResource(R.drawable.seat_booked);

        im17.setOnClickListener(new View.OnClickListener() {

            public void onClick(View button) {
                //Set the button's appearance
                im17.setSelected(!button.isSelected());

                if (button.isSelected()) {
                    //Handle selected state change
                } else {
                    //Handle de-select state change
                }

            }

        });

        final ImageView im18 =(ImageView)findViewById(R.id.im18);
        im18.setBackgroundResource(R.drawable.seat_booked);

        im18.setOnClickListener(new View.OnClickListener() {

            public void onClick(View button) {
                //Set the button's appearance
                im18.setSelected(!button.isSelected());

                if (button.isSelected()) {
                    //Handle selected state change
                } else {
                    //Handle de-select state change
                }

            }

        });

        final ImageView im19 =(ImageView)findViewById(R.id.im19);
        im19.setBackgroundResource(R.drawable.seat_booked);

        im19.setOnClickListener(new View.OnClickListener() {

            public void onClick(View button) {
                //Set the button's appearance
                im19.setSelected(!button.isSelected());

                if (button.isSelected()) {
                    //Handle selected state change
                } else {
                    //Handle de-select state change
                }

            }

        });

        final ImageView im20 =(ImageView)findViewById(R.id.im20);
        im20.setBackgroundResource(R.drawable.seat_booked);

        im20.setOnClickListener(new View.OnClickListener() {

            public void onClick(View button) {
                //Set the button's appearance
                im20.setSelected(!button.isSelected());

                if (button.isSelected()) {
                    //Handle selected state change
                } else {
                    //Handle de-select state change
                }

            }

        });

        final ImageView im21 =(ImageView)findViewById(R.id.im21);
        im21.setBackgroundResource(R.drawable.seat_booked);

        im21.setOnClickListener(new View.OnClickListener() {

            public void onClick(View button) {
                //Set the button's appearance
                im21.setSelected(!button.isSelected());

                if (button.isSelected()) {
                    //Handle selected state change
                } else {
                    //Handle de-select state change
                }

            }

        });

        final ImageView im22 =(ImageView)findViewById(R.id.im22);
        im22.setBackgroundResource(R.drawable.seat_booked);

        im22.setOnClickListener(new View.OnClickListener() {

            public void onClick(View button) {
                //Set the button's appearance
                im22.setSelected(!button.isSelected());

                if (button.isSelected()) {
                    //Handle selected state change
                } else {
                    //Handle de-select state change
                }

            }

        });

        final ImageView im23 =(ImageView)findViewById(R.id.im23);
        im23.setBackgroundResource(R.drawable.seat_booked);

        im23.setOnClickListener(new View.OnClickListener() {

            public void onClick(View button) {
                //Set the button's appearance
                im23.setSelected(!button.isSelected());

                if (button.isSelected()) {
                    //Handle selected state change
                } else {
                    //Handle de-select state change
                }

            }

        });

        final ImageView im24 =(ImageView)findViewById(R.id.im24);
        im24.setBackgroundResource(R.drawable.seat_booked);

        im24.setOnClickListener(new View.OnClickListener() {

            public void onClick(View button) {
                //Set the button's appearance
                im24.setSelected(!button.isSelected());

                if (button.isSelected()) {
                    //Handle selected state change
                } else {
                    //Handle de-select state change
                }

            }

        });

        final ImageView im25 =(ImageView)findViewById(R.id.im25);
        im25.setBackgroundResource(R.drawable.seat_booked);

        im25.setOnClickListener(new View.OnClickListener() {

            public void onClick(View button) {
                //Set the button's appearance
                im25.setSelected(!button.isSelected());

                if (button.isSelected()) {
                    //Handle selected state change
                } else {
                    //Handle de-select state change
                }

            }

        });

        final ImageView im26 =(ImageView)findViewById(R.id.im26);
        im26.setBackgroundResource(R.drawable.seat_booked);

        im26.setOnClickListener(new View.OnClickListener() {

            public void onClick(View button) {
                //Set the button's appearance
                im26.setSelected(!button.isSelected());

                if (button.isSelected()) {
                    //Handle selected state change
                } else {
                    //Handle de-select state change
                }

            }

        });



        final TextView tVnoseats =(TextView)findViewById(R.id.tVnoseats);
        final TextView tVvipseats =(TextView)findViewById(R.id.tVvipseats);
        final TextView tVeconomyseats =(TextView)findViewById(R.id.tVeconomyseats);

        final Button Bseatdone =(Button)findViewById(R.id.Bseatdone);

        Bseatdone.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent b = new Intent(SeatsActivity.this, PaymentActivity.class);
                startActivity(b);
            }
        });



    }

    private void addListenerOnImageView() {
    }

    @Override
    public void onClick(View v) {

        }

    }


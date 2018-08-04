package com.example.kishan_gupta.kidslearningapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class Main2Activity extends AppCompatActivity {
    ImageButton letter_btn, counting_btn, bodyparts_btn, fruits_btn, vehicle_btn, color_btn,video_btn,funvideo_btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);



        letter_btn = (ImageButton) findViewById(R.id.lettersbutton);
        letter_btn.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View arg0) {


                Intent in = new Intent(Main2Activity.this, Alphabet.class);

                startActivity(in);

            }

        });

        counting_btn = (ImageButton) findViewById(R.id.countingbutton);
        counting_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    Intent in = new Intent(Main2Activity.this, Numbers.class);
                    startActivity(in);

                } catch (Exception e) {

                }

            }
        });
        bodyparts_btn = (ImageButton) findViewById(R.id.bodybutton);
        bodyparts_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    Intent in = new Intent(Main2Activity.this, Leg.class);
                    startActivity(in);

                } catch (Exception e) {

                }

            }
        });
        fruits_btn = (ImageButton) findViewById(R.id.fruitsbutton);
        fruits_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    Intent in = new Intent(Main2Activity.this, Anar.class);
                    startActivity(in);

                } catch (Exception e) {

                }

            }
        });

        vehicle_btn = (ImageButton) findViewById(R.id.vbutton);
        vehicle_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    Intent in = new Intent(Main2Activity.this, Bus.class);
                    startActivity(in);

                } catch (Exception e) {

                }

            }
        });
        color_btn = (ImageButton) findViewById(R.id.colorbutton);
        color_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    Intent in = new Intent(Main2Activity.this, Red.class);
                    startActivity(in);

                } catch (Exception e) {
                }
            }
        });

        video_btn=(ImageButton)findViewById(R.id.vibutton);
        video_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    Intent in = new Intent(Main2Activity.this, Main3Activity.class);
                    startActivity(in);
                }catch (Exception e){
                }
            }
        });
        funvideo_btn=(ImageButton)findViewById(R.id.vidbutton);
        funvideo_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    Intent in = new Intent(Main2Activity.this, Engvideos.class);
                    startActivity(in);
                }catch (Exception e){
                }
            }
        });

    }
}

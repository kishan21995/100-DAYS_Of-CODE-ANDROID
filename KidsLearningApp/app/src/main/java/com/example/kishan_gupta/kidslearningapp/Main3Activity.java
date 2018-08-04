package com.example.kishan_gupta.kidslearningapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class Main3Activity extends AppCompatActivity {
    ImageButton absong1,numsong,fruitvid,vegvideos,bodyvideos,colvideos;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);


        absong1=(ImageButton)findViewById(R.id.imgbtn);
        absong1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    Intent in = new Intent(getApplicationContext(), Absong1.class);
                    startActivity(in);
                }catch (Exception e){

                }
            }
        });
        numsong=(ImageButton)findViewById(R.id.imgbutton);
        numsong.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    Intent in = new Intent(getApplicationContext(), Numsong.class);
                    startActivity(in);
                }catch (Exception e){
                }
            }
        });
        fruitvid=(ImageButton)findViewById(R.id.imagebtn);
        fruitvid.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    Intent in = new Intent(getApplicationContext(), Fruitvid.class);
                    startActivity(in);
                }catch (Exception e){
                }
            }
        });

        vegvideos=(ImageButton)findViewById(R.id.imbtn);
        vegvideos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    Intent in = new Intent(getApplicationContext(), Vegvid.class);
                    startActivity(in);
                }catch (Exception e){
                }
            }
        });

        bodyvideos=(ImageButton)findViewById(R.id.ibutton);
        bodyvideos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    Intent in = new Intent(getApplicationContext(), Bodyvideos.class);
                    startActivity(in);
                }catch (Exception e){
                }
            }
        });
        colvideos=(ImageButton)findViewById(R.id.ibtn);
        colvideos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    Intent in = new Intent(getApplicationContext(), Colvideos.class);
                    startActivity(in);
                }catch (Exception e){
                }
            }
        });


    }
}

package com.example.kishan_gupta.kidslearningapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class Engvideos extends AppCompatActivity {
    ImageButton birdsvid,animalvid,traffvid,funvid,traflearn_btn,parkvid_btn,moonvid,socialvid;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_engvideos);

        birdsvid=(ImageButton)findViewById(R.id.imge);
        birdsvid.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    Intent in = new Intent(getApplicationContext(), Birdvid.class);
                    startActivity(in);
                }catch (Exception e){
                }
            }
        });
        animalvid=(ImageButton)findViewById(R.id.cbutton);
        animalvid.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {

                    Intent in = new Intent(getApplicationContext(), Animalsvid.class);
                    startActivity(in);
                }catch (Exception e){

                }
            }
        });
        traffvid=(ImageButton)findViewById(R.id.bbutton);
        traffvid.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    Intent in = new Intent(getApplicationContext(), Trafvid.class);
                    startActivity(in);
                }catch (Exception e){
                }
            }
        });
        funvid=(ImageButton)findViewById(R.id.fbutton);
        funvid.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    Intent in = new Intent(getApplicationContext(), Funvideng.class);
                    startActivity(in);
                }catch (Exception e){
                }
            }
        });
        traflearn_btn=(ImageButton)findViewById(R.id.trafv);
        traflearn_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    Intent in = new Intent(getApplicationContext(), Traflearn.class);
                    startActivity(in);
                }catch (Exception e){
                }
            }
        });
        parkvid_btn=(ImageButton)findViewById(R.id.parkv);
        parkvid_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    Intent in = new Intent(getApplicationContext(), Parkvid.class);
                    startActivity(in);
                }catch (Exception e){
                }
            }
        });
        moonvid=(ImageButton)findViewById(R.id.vbton);
        moonvid.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    Intent in = new Intent(getApplicationContext(), Moonvid.class);
                    startActivity(in);
                }catch (Exception e){
                }
            }
        });
        socialvid=(ImageButton)findViewById(R.id.vdbutton);
        socialvid.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    Intent in = new Intent(getApplicationContext(), Socialvi.class);
                    startActivity(in);
                }catch (Exception e){
                }
            }
        });


}
}
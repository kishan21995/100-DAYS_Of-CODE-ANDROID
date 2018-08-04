package com.example.kishan_gupta.kidslearningapp;

import android.content.Intent;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.Toast;

public class Eight extends AppCompatActivity {
    ImageButton forward_a,backward_a,play_a;
    ImageButton menu_a;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_eight);


        ImageButton menu_a=(ImageButton)findViewById(R.id.mbtn);
        menu_a.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    Intent in = new Intent(Eight.this, Main2Activity.class);
                    startActivity(in);
                    Toast.makeText(getApplicationContext(), "go to menu list", Toast.LENGTH_LONG).show();
                }catch(Exception e){
                }
            }
        });
        ImageButton forward_a=(ImageButton)findViewById(R.id.fbtn);
        forward_a.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    Intent in = new Intent(Eight.this, Nine.class);
                    startActivity(in);
                }catch (Exception e){
                }
            }
        });
        ImageButton backward_a=(ImageButton)findViewById(R.id.bbtn);
        backward_a.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    Intent in = new Intent(Eight.this, Seven.class);
                    startActivity(in);
                } catch (Exception e) {

                }
            }
        });


        ImageButton play_a=(ImageButton) findViewById(R.id.pbtn);
        play_a.setOnClickListener(new View.OnClickListener()
        {
            public void onClick(View arg0)
            {

                try
                {

                    MediaPlayer mp = MediaPlayer.create(getApplicationContext(), R.raw.eight);
                    mp.start();
                    Toast.makeText(getApplicationContext(), "audio play", Toast.LENGTH_LONG).show();

                } catch (Exception e)
                {


                }


            }
        });




    }
}

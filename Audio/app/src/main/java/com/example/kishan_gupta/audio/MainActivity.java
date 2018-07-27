package com.example.kishan_gupta.audio;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {
MediaPlayer mysong;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mysong=MediaPlayer.create(MainActivity.this,R.raw.aa);
    }
    public void playit(View v){

        mysong.start();
    }

    protected void onPause(){
        super.onPause();
        mysong.release();
    }
}

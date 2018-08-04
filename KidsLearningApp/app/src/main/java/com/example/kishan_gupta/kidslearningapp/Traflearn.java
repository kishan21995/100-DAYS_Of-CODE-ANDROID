package com.example.kishan_gupta.kidslearningapp;

import android.app.Activity;
import android.graphics.PixelFormat;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Bundle;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import android.view.View;
import android.widget.Button;
import android.widget.MediaController;
import android.widget.VideoView;

import com.example.kishan_gupta.kidslearningapp.R;

//Implement SurfaceHolder interface to Play video
//Implement this interface to receive information about changes to the surface
public class Traflearn extends Activity implements SurfaceHolder.Callback{

    MediaPlayer mediaPlayer;
    SurfaceView surfaceView;
    SurfaceHolder surfaceHolder;
    boolean pausing = false;


    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_traflearn);

        Button buttonPlayVideo = (Button)findViewById(R.id.bn_play);

        getWindow().setFormat(PixelFormat.UNKNOWN);

        //Displays a video file.
        VideoView mVideoView = (VideoView)findViewById(R.id.videoView);




        String uriPath = "android.resource://com.example.kishan_gupta.kidslearningapp/"+R.raw.traflearn;
        Uri uri = Uri.parse(uriPath);
        mVideoView.setVideoURI(uri);
        mVideoView.requestFocus();
        mVideoView.start();



        buttonPlayVideo.setOnClickListener(new Button.OnClickListener(){

            @Override
            public void onClick(View v) {

                // VideoView refference see main.xml
                VideoView mVideoView = (VideoView)findViewById(R.id.videoView);
                // MediaController11 mediaController= new MediaController11(this);
                // mediaController11.setAnchorView(mVideoView);

                String uriPath = "android.resource://com.example.kishan_gupta.kidslearningapp/"+R.raw.traflearn;

                Uri uri = Uri.parse(uriPath);
                // mVideoView.setMediaController(mediaController11);
                //mVideoView.setMediaController(mediaController11);
                // MediaController11.setMediaPlayer(mVideoView);
                mVideoView.setVideoURI(uri);
                mVideoView.requestFocus();
                mVideoView.start();


            }});
    }

    @Override
    public void surfaceChanged(SurfaceHolder holder, int format, int width,
                               int height) {
        // TODO Auto-generated method stub

    }

    @Override
    public void surfaceCreated(SurfaceHolder holder) {
        // TODO Auto-generated method stub

    }

    @Override
    public void surfaceDestroyed(SurfaceHolder holder) {
        // TODO Auto-generated method stub

    }
}
package com.skyfishjy.ripplebackground.sample;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.MenuItem;
import android.view.View;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.widget.Button;
import android.widget.ImageView;

import com.skyfishjy.library.RippleBackground;
import com.skyfishjy.library.ripplebackground.sample.R;

import java.util.ArrayList;


public class MainActivity extends Activity {

    private ImageView foundDevice1,foundDevice2,foundDevice3,foundDevice4,foundDevice5,foundDevice6 ,foundDevice7;

    ////
    private Button send;   // Declaration of button.

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);




        send = (Button) findViewById(R.id.btn2);//connectivity of button.
        send.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, Main2Activity.class); //call second activity
                startActivity(intent);
            }
        });
        final RippleBackground rippleBackground = (RippleBackground) findViewById(R.id.content);

        final Handler handler = new Handler();

        foundDevice7 = (ImageView) findViewById(R.id.foundDevice7);

         foundDevice1 = (ImageView) findViewById(R.id.foundDevice1);
       foundDevice2= (ImageView) findViewById(R.id.foundDevice2);
        foundDevice3 = (ImageView) findViewById(R.id.foundDevice3);
        foundDevice4= (ImageView) findViewById(R.id.foundDevice4);
        foundDevice5= (ImageView) findViewById(R.id.foundDevice5);
        foundDevice6= (ImageView) findViewById(R.id.foundDevice6);

        rippleBackground.startRippleAnimation();
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {

                foundDevice1();
            }
        }, 3000);
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                foundDevice2();
            }
        }, 4000);
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                foundDevice3();
            }
        }, 5000);
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                foundDevice4();
            }
        }, 6000);
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                foundDevice5();
            }
        }, 7000);
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                foundDevice6();
            }
        }, 8000);
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                foundDevice7();
            }
        }, 9000);


        ImageView button = (ImageView) findViewById(R.id.centerImage);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });


    }

    private void foundDevice1() {     ///
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.setDuration(400);
        animatorSet.setInterpolator(new AccelerateDecelerateInterpolator());
        ArrayList<Animator> animatorList = new ArrayList<Animator>();
        ObjectAnimator scaleXAnimator = ObjectAnimator.ofFloat(foundDevice1, "ScaleX", 0f, 1.2f, 1f);
        animatorList.add(scaleXAnimator);
        ObjectAnimator scaleYAnimator = ObjectAnimator.ofFloat(foundDevice1, "ScaleY", 0f, 1.2f, 1f);
        animatorList.add(scaleYAnimator);
        animatorSet.playTogether(animatorList);
        foundDevice1.setVisibility(View.VISIBLE);
        animatorSet.start();
    }
      private void foundDevice2() {     ///
           AnimatorSet animatorSet = new AnimatorSet();
           animatorSet.setDuration(400);
           animatorSet.setInterpolator(new AccelerateDecelerateInterpolator());
           ArrayList<Animator> animatorList = new ArrayList<Animator>();
           ObjectAnimator scaleXAnimator = ObjectAnimator.ofFloat(foundDevice2, "ScaleX", 0f, 1.2f, 1f);
           animatorList.add(scaleXAnimator);
           ObjectAnimator scaleYAnimator = ObjectAnimator.ofFloat(foundDevice2, "ScaleY", 0f, 1.2f, 1f);
           animatorList.add(scaleYAnimator);
           animatorSet.playTogether(animatorList);
           foundDevice2.setVisibility(View.VISIBLE);
           animatorSet.start();
       }
     private void foundDevice3() {     ///
           AnimatorSet animatorSet = new AnimatorSet();
           animatorSet.setDuration(400);
           animatorSet.setInterpolator(new AccelerateDecelerateInterpolator());
           ArrayList<Animator> animatorList = new ArrayList<Animator>();
           ObjectAnimator scaleXAnimator = ObjectAnimator.ofFloat(foundDevice3, "ScaleX", 0f, 1.2f, 1f);
           animatorList.add(scaleXAnimator);
           ObjectAnimator scaleYAnimator = ObjectAnimator.ofFloat(foundDevice3, "ScaleY", 0f, 1.2f, 1f);
           animatorList.add(scaleYAnimator);
           animatorSet.playTogether(animatorList);
           foundDevice3.setVisibility(View.VISIBLE);
           animatorSet.start();
       }
      private void foundDevice4() {     ///
           AnimatorSet animatorSet = new AnimatorSet();
           animatorSet.setDuration(400);
           animatorSet.setInterpolator(new AccelerateDecelerateInterpolator());
           ArrayList<Animator> animatorList = new ArrayList<Animator>();
           ObjectAnimator scaleXAnimator = ObjectAnimator.ofFloat(foundDevice4, "ScaleX", 0f, 1.2f, 1f);
           animatorList.add(scaleXAnimator);
           ObjectAnimator scaleYAnimator = ObjectAnimator.ofFloat(foundDevice4, "ScaleY", 0f, 1.2f, 1f);
           animatorList.add(scaleYAnimator);
           animatorSet.playTogether(animatorList);
           foundDevice4.setVisibility(View.VISIBLE);
           animatorSet.start();
       }
      private void foundDevice5() {     ///
           AnimatorSet animatorSet = new AnimatorSet();
           animatorSet.setDuration(400);
           animatorSet.setInterpolator(new AccelerateDecelerateInterpolator());
           ArrayList<Animator> animatorList = new ArrayList<Animator>();
           ObjectAnimator scaleXAnimator = ObjectAnimator.ofFloat(foundDevice5, "ScaleX", 0f, 1.2f, 1f);
           animatorList.add(scaleXAnimator);
           ObjectAnimator scaleYAnimator = ObjectAnimator.ofFloat(foundDevice5, "ScaleY", 0f, 1.2f, 1f);
           animatorList.add(scaleYAnimator);
           animatorSet.playTogether(animatorList);
           foundDevice5.setVisibility(View.VISIBLE);
           animatorSet.start();
       }
      private void foundDevice6() {     ///
           AnimatorSet animatorSet = new AnimatorSet();
           animatorSet.setDuration(400);
           animatorSet.setInterpolator(new AccelerateDecelerateInterpolator());
           ArrayList<Animator> animatorList = new ArrayList<Animator>();
           ObjectAnimator scaleXAnimator = ObjectAnimator.ofFloat(foundDevice6, "ScaleX", 0f, 1.2f, 1f);
           animatorList.add(scaleXAnimator);
           ObjectAnimator scaleYAnimator = ObjectAnimator.ofFloat(foundDevice6, "ScaleY", 0f, 1.2f, 1f);
           animatorList.add(scaleYAnimator);
           animatorSet.playTogether(animatorList);
           foundDevice6.setVisibility(View.VISIBLE);
           animatorSet.start();
       }
      private void foundDevice7() {     ///
           AnimatorSet animatorSet = new AnimatorSet();
           animatorSet.setDuration(400);
           animatorSet.setInterpolator(new AccelerateDecelerateInterpolator());
           ArrayList<Animator> animatorList = new ArrayList<Animator>();
           ObjectAnimator scaleXAnimator = ObjectAnimator.ofFloat(foundDevice7, "ScaleX", 0f, 1.2f, 1f);
           animatorList.add(scaleXAnimator);
           ObjectAnimator scaleYAnimator = ObjectAnimator.ofFloat(foundDevice7, "ScaleY", 0f, 1.2f, 1f);
           animatorList.add(scaleYAnimator);
           animatorSet.playTogether(animatorList);
           foundDevice7.setVisibility(View.VISIBLE);
           animatorSet.start();
       }


    //create Back Button
    public boolean onOptionsItemSelected(MenuItem item) {
        if (item.getItemId() == android.R.id.home)
            finish();
        return super.onOptionsItemSelected(item);


    }
}

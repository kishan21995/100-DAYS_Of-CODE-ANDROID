package com.skyfishjy.ripplebackground.sample;

import android.app.Activity;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import com.skyfishjy.library.ripplebackground.sample.R;

public class Main2Activity extends Activity {
  ImageView view1,view2,view3,view4,view5,view6;
  Button btn1,btn2,btn3,btn4,btn5,btn6;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        view1 = (ImageView) findViewById(R.id.imageView);
        view2 = (ImageView) findViewById(R.id.imageView2);
        view3 = (ImageView) findViewById(R.id.imageView3);
        view4 = (ImageView) findViewById(R.id.imageView4);
        view5 = (ImageView) findViewById(R.id.imageView5);
        view6 = (ImageView) findViewById(R.id.imageView6);


    }

    //exit button//
   public void clickexit(View v)
    {
        moveTaskToBack(true);
        android.os.Process.killProcess(android.os.Process.myPid());
        System.exit(1);
    }

}

package com.example.kishan_gupta.myappl;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ImageView;

public class Main2Activity extends AppCompatActivity {
     ImageView imageView;
    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        imageView=(ImageView) findViewById(R.id.imageView);


        //create BackButton
        if (getSupportActionBar()!=null){
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
            getSupportActionBar().setDisplayShowHomeEnabled(true);
        }


    }
    //create Back Button
    public boolean onOptionsItemSelected(MenuItem item)
        {
        if(item.getItemId()==android.R.id.home)
            finish();
            return super.onOptionsItemSelected(item);
        }


    }





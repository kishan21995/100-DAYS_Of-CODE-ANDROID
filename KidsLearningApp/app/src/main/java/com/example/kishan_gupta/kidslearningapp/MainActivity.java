package com.example.kishan_gupta.kidslearningapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity {
   ImageButton All_view;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

       All_view = ( ImageButton ) findViewById(R.id.view);
       All_view.setOnClickListener(new View.OnClickListener() {

           @Override
           public void onClick(View view) {
              Intent intent=new Intent(MainActivity.this,Main2Activity.class);
              startActivity(intent);

           }
       });
    }
}

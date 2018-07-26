package com.basiccal.calcy;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
  Button Addition,Subtraction,Multiplication,Division;
  EditText et1,et2;
    TextView result;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Addition = (Button) findViewById(R.id.btnadd);
        Subtraction = (Button) findViewById(R.id.subtract);
        Multiplication = (Button) findViewById(R.id.Multiply);
        Division = (Button) findViewById(R.id.btndiv);
        et1 = (EditText) findViewById(R.id.et1);
        et2 = (EditText) findViewById(R.id.et3);
        result = (TextView) findViewById(R.id.textView2);

        Addition.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View viev) {
                int n1, n2;
                n1 = Integer.parseInt(et1.getText().toString());
                n2 = Integer.parseInt(et2.getText().toString());
                int sum = n1 + n2;
                result.setText("Sum=" + sum);
            }
        });



        Subtraction.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View viev) {
                int n1, n2;
                n1 = Integer.parseInt(et1.getText().toString());
                n2 = Integer.parseInt(et2.getText().toString());
                int sub= n1 - n2;
                result.setText("Sub=" + sub);
            }
        });



        Multiplication.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View viev) {
                int n1, n2;
                n1 = Integer.parseInt(et1.getText().toString());
                n2 = Integer.parseInt(et2.getText().toString());
                int mul = n1 * n2;
                result.setText("mul="+ mul);
            }
        });




        Division.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View viev) {
                int n1, n2;
                n1 = Integer.parseInt(et1.getText().toString());
                n2 = Integer.parseInt(et2.getText().toString());
                int div = n1 / n2;
                result.setText("div="+ div);
            }
        });









    }}







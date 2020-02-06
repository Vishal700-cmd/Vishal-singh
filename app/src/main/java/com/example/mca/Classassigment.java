package com.example.mca;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class Classassigment extends AppCompatActivity {
    EditText cl1,cl2,cl3,p11,p12;
    TextView c44,p44;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_classassigment);
        cl1=findViewById(R.id.cl1);
        cl2=findViewById(R.id.cl2);
        cl3=findViewById(R.id.cl3);
        c44=findViewById(R.id.c44);
        p11=findViewById(R.id.p11);
        p12=findViewById(R.id.p12);
        p44=findViewById(R.id.p44);
    }

    public void total(View view) {
       int m = Integer.parseInt(cl1.getText().toString());
       int n = Integer.parseInt(cl2.getText().toString());
       int o = Integer.parseInt(cl3.getText().toString());
       int result=m*5+n*10+o*15;
       String st ="Total is"+result;
       c44.setText(st);

    }

    public void total1(View view) {
        int q = Integer.parseInt(p11.getText().toString());
        int w = Integer.parseInt(p12.getText().toString());
        int result1=q*w;
        String as ="Total is"+result1;
        p44.setText(as);
    }
}

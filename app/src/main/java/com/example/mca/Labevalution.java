package com.example.mca;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class Labevalution extends AppCompatActivity {

    EditText e11,e12,e13,e14,e15,e16;
    TextView e44;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_labevalution);
        e11=findViewById(R.id.e11);
        e12=findViewById(R.id.e12);
        e13=findViewById(R.id.e13);
        e14=findViewById(R.id.e14);
        e15=findViewById(R.id.e15);
        e16=findViewById(R.id.e16);
        e44=findViewById(R.id.e44);

    }

    public void calculatecharges(View view) {

        int ij=Integer.parseInt(e15.getText().toString());
        int kl=Integer.parseInt(e16.getText().toString());
        int result3=ij*500+kl*250;
        String w="Total is"+result3;
        e44.setText(w);


    }
}

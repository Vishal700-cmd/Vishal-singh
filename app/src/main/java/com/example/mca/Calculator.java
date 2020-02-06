package com.example.mca;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import org.w3c.dom.Text;

public class Calculator extends AppCompatActivity {
     EditText c1,c2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculator);
        c1= findViewById(R.id.c1);
        c2=findViewById(R.id.c2);

    }

    public void add(View view) {
        int v =Integer.parseInt(c1.getText().toString());
        int v1=Integer.parseInt(c2.getText().toString());
        int result=v+v1;
        Toast.makeText(this, "Addition is "+result, Toast.LENGTH_SHORT).show();

    }

    public void sub(View view) {
        int v =Integer.parseInt(c1.getText().toString());
        int v1=Integer.parseInt(c2.getText().toString());
        int result=v-v1;
        Toast.makeText(this, "Subtraction is "+result, Toast.LENGTH_SHORT).show();
    }

    public void multiply(View view) {
        int v =Integer.parseInt(c1.getText().toString());
        int v1=Integer.parseInt(c2.getText().toString());
        int result=v*v1;
        Toast.makeText(this, "Multiply "+result, Toast.LENGTH_SHORT).show();
    }

    public void Div(View view) {
        int v =Integer.parseInt(c1.getText().toString());
        int v1=Integer.parseInt(c2.getText().toString());
        int result=v/v1;
        Toast.makeText(this, "Division is "+result, Toast.LENGTH_SHORT).show();
    }
}

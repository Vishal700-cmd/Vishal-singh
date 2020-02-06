package com.example.mca;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import org.w3c.dom.Text;

public class GetDataBundleActivity extends AppCompatActivity {

    TextView tv1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_get_data_bundle);
        tv1=findViewById(R.id.tv1);
        Intent it = getIntent();
        Bundle b= it.getBundleExtra("bundle");

        String name1 = b.getString("name");
        int roll_no1 = b.getInt("roll_no",0);
        float cgpa= b.getFloat("cgpa",0.0f);

        tv1.setText("Rollno : "+ roll_no1 + "\n Name : "+name1 + "\n CGPA: "+cgpa);
    }
}

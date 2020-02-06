package com.example.mca;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText tv2,t1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tv2 = findViewById(R.id.tv2);

    }

    public void login(View view) {
        Toast.makeText(this, "Mobile Touch mt kro", Toast.LENGTH_SHORT).show();
    }

    public void Calculator(View view) {
        Intent it =new Intent(this, Calculator.class);
        startActivity(it);
    }


    public void use_bundle_to_send_data(View view) {

        Intent it =new Intent(this, GetDataBundleActivity.class);
        Bundle b =new Bundle();
        b.putString("name","Vishal");
        b.putInt("roll_no",45);
        b.putFloat("cgpa",9.6f);
        it.putExtra("bundle",b);

        startActivity(it);

    }

    public void classassigment(View view) {
        Intent it2 =new Intent(this,Classassigment.class);
        startActivity(it2);
    }

    public void labevalution(View view) {
        Intent t1 =new Intent(this,Labevalution.class);
        startActivity(t1);
    }

    public void webview(View view) {
        Intent op =new Intent(this ,openbrowser.class);
        startActivity(op);
    }

    public void ordermenu(View view) {
            Intent ol =new Intent(this ,OrderMenu.class);
            startActivity(ol);
    }
}

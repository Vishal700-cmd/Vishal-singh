package com.example.mca;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;

public class openbrowser extends AppCompatActivity {
    WebView wv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_openbrowser);
        wv=findViewById(R.id.wv);
    }

    public void search(View view) {
        //this is used to direct to the site or url you enter
        // wv.loadUrl("https://www.javatpoint.com ");
        //this is used to access the file with is in the directory
       // wv.loadUrl("file:///android_asset/A.html");
        String data ="<html><body><h1> this is my first web </h1></body></html>";
        wv.loadData(data ,"text/html","UTF-8");//we can also
    }
}

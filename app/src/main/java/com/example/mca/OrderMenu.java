package com.example.mca;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.Toast;

public class OrderMenu extends AppCompatActivity {
     CheckBox cb1,cb2,cb3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_order_menu);
        cb1=findViewById(R.id.cb1);
        cb2=findViewById(R.id.cb2);
        cb3=findViewById(R.id.cb3);
    }

    public void show_the_bill(View view) {
        int total=0;
        {
            StringBuilder msg =new StringBuilder();
            msg.append("Selected items");
            if(cb1.isChecked())
            {
                total +=150;
                msg.append("\n Sandwich:Rs 150");
            }  if(cb2.isChecked())
            {
                total +=150;
                msg.append("\n Pizza:Rs 150");
            }  if(cb3.isChecked())
            {
                total +=150;
                msg.append("\n Burger:Rs 150");
            }
            msg.append("\n Total= +total");
            Toast.makeText(this, msg, Toast.LENGTH_SHORT).show();
        }

    }
}

package com.example.ruaasamara.javalayouts;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.LinearLayout.LayoutParams;



public class MainActivity extends AppCompatActivity {
    TextView txtView1,txtView2, txtView3  ;
    Button btn;
    LinearLayout linearLayout;
    LinearLayout.LayoutParams layoutParams;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //setContentView(R.layout.activity_main);
        txtView1 = new TextView(this);
        txtView2 = new TextView(this);
        txtView3 = new TextView(this);
        btn = new Button(this);
        linearLayout = new LinearLayout(this);
        linearLayout.setBackgroundColor(Color.LTGRAY);
        layoutParams = new LinearLayout.LayoutParams(LayoutParams.MATCH_PARENT,LayoutParams.MATCH_PARENT);

        txtView1.setText("User First Name");
        txtView2.setText("User Second Name");
        txtView3.setText("User Email");
        btn.setText("Send");

        txtView1.setTextSize(25);
        txtView2.setTextSize(25);
        txtView3.setTextSize(25);
        btn.setTextSize(25);

        txtView1.setLayoutParams(new LinearLayout.LayoutParams(LayoutParams.MATCH_PARENT,LayoutParams.WRAP_CONTENT));
        txtView2.setLayoutParams(new LinearLayout.LayoutParams(LayoutParams.MATCH_PARENT,LayoutParams.WRAP_CONTENT));
        txtView3.setLayoutParams(new LinearLayout.LayoutParams(LayoutParams.MATCH_PARENT,LayoutParams.WRAP_CONTENT));
        btn.setLayoutParams(new LinearLayout.LayoutParams(LayoutParams.WRAP_CONTENT,LayoutParams.WRAP_CONTENT));

        layoutParams.setMargins(16, 0, 16, 16);
        linearLayout.setOrientation(LinearLayout.VERTICAL);
        linearLayout.setLayoutParams(layoutParams);
        linearLayout.addView(txtView1);
        linearLayout.addView(txtView2);
        linearLayout.addView(txtView3);
        linearLayout.addView(btn);

        setContentView(linearLayout);


    }

}

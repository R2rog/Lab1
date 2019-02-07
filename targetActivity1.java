package com.lab1.a01272373.lab1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.content.Intent;
import android.widget.TextView;
public class targetActivity1 extends AppCompatActivity {
    TextView myTextView;
    Intent currentIntent;
    String myIntentVar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_target1);
        currentIntent=getIntent();

        myIntentVar= currentIntent.getStringExtra("Value to send");
        int myIntExtra= currentIntent.getIntExtra("My integer",1);
        //myTextView= findViewById(R.id.my_text);
        //myTextView.setText(myIntentVar);
    }
}

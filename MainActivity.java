package com.lab1.a01272373.lab1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;//Import the widget button.
import android.content.Intent;//Importing the Intent class.

import java.lang.annotation.Target;

public class MainActivity extends AppCompatActivity {

    Button btnActivity;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnActivity= findViewById(R.id.button2);
        btnActivity.setOnClickListener(new View.OnClickListener() {
            @Override // It creates an event listener for the button.
            public void onClick(View v) {
                Intent myIntent= new Intent(MainActivity.this,Target.class);
                myIntent.putExtra("StringToSend","Hello Intent");
                myIntent.putExtra("MyInteger",2);
                startActivity(myIntent);
            }
        });
    }

}

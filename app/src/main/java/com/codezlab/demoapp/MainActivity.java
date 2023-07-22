package com.codezlab.demoapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        setTitle("Activity A");

        TextView titleTV = findViewById(R.id.titleTV);
        titleTV.setText("Hello World");
        //titleTV.setVisibility(View.GONE);
        Button submitBT= findViewById(R.id.submitBT);
        submitBT.setText("Next");

        submitBT.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Toast.makeText(MainActivity.this,"Submit button clicked", Toast.LENGTH_SHORT).show();

                //Intent next=new Intent(MainActivity.this, NextActivity.class);
                Intent next=new Intent();
                next.setClass(MainActivity.this,NextActivity.class);
                startActivity(next);

            }
        });

    }
}
package com.example.game;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.RelativeLayout;

public class Truthactivity extends AppCompatActivity {


    RadioButton truth , dare;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_truthactivity);
        getWindow().setNavigationBarColor(Color.parseColor("#C98347"));



        truth = findViewById(R.id.truth);
        dare = findViewById(R.id.dare);

        truth.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Truthactivity.this, MainActivity3.class);
                startActivity(intent);
            }
        });

       dare.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Truthactivity.this, MainActivity4.class);
                startActivity(intent);
            }
        });
    }
}
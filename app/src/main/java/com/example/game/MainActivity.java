package com.example.game;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.os.Handler;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {
  ImageView imageView;
  TextView textView;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setStatusBarColor(Color.parseColor("#C98347"));
        getWindow().setNavigationBarColor(Color.parseColor("#C98347"));

        setContentView(R.layout.activity_main);

        imageView = findViewById(R.id.logo2);
        textView = findViewById(R.id.text1);
         Animation move = AnimationUtils.loadAnimation(MainActivity.this, R.anim.top);
        Animation move1 = AnimationUtils.loadAnimation(MainActivity.this, R.anim.bottom);

        imageView.startAnimation(move);
        textView.startAnimation(move1);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                startActivity(new Intent(MainActivity.this, MainActivity2.class));
                finish();
            }
        }, 4000);
    }
}
package com.example.game;

import android.annotation.SuppressLint;
import android.app.Dialog;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.RotateAnimation;
import android.widget.Button;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.Random;

public class MainActivity2 extends AppCompatActivity {

    Button btn1,btn2;
    private ImageView imageView;
    private Random random = new Random();
    private int newDirection, lastDirection;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main2);


        imageView = findViewById(R.id.imageView);
        btn1 = findViewById(R.id.truth);
        btn2 = findViewById(R.id.dare);

    }


    public void spin(View view) {
        newDirection = random.nextInt(4000);
        int min = 1000, max = newDirection;
        int ran = (int) (Math.random() * ((max - min) + 1) + min);
        float pivotX = imageView.getWidth() / 2;
        float pivotY = imageView.getHeight() / 2;

        Animation rotate = new RotateAnimation(lastDirection, newDirection, pivotX, pivotY);
        rotate.setDuration(ran);
        rotate.setFillAfter(true);

        rotate.setAnimationListener(new Animation.AnimationListener() {
            @Override
            public void onAnimationStart(Animation animation) {
                imageView.setEnabled(false);
            }

            @Override
            public void onAnimationEnd(Animation animation) {


                Dialog dialog = new Dialog (MainActivity2.this);
                dialog.setContentView(R.layout.custom_dailog);
                dialog.show();
                btn1.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {

                    }
                });
                btn2.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {

                    }
                });
                imageView.setEnabled(true);

            }
            @Override
            public void onAnimationRepeat(Animation animation) {
            }
        });
        lastDirection = newDirection;
        imageView.startAnimation(rotate);

    }
}


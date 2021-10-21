package com.example.kidzlearn;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class NumberLearn1 extends Activity implements View.OnClickListener {

    MediaPlayer sound1;
    ImageButton imgbtn1, imgbtnHome1, imgbtnNext1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_number_learn1);

        imgbtn1 = (ImageButton) findViewById(R.id.ImgBtn_Num1);
        imgbtnHome1 = (ImageButton) findViewById(R.id.ImgBtn_Home1);
        imgbtnNext1 = (ImageButton) findViewById(R.id.ImgBtn_Next1);

        //button  click image
        imgbtn1.setOnClickListener(this);

        //button to Main Menu
        imgbtnHome1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), MainActivity.class);
                startActivity(intent);
            }
        });

        //button next
        imgbtnNext1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), NumberLearn2.class);
                startActivity(intent);
            }
        });
    }

    //click the image for listen
    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.ImgBtn_Num1:
                sound1 = MediaPlayer.create(this, R.raw.one);
                sound1.start();
                break;
        }

    }
}

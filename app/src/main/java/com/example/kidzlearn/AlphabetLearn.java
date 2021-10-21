package com.example.kidzlearn;

import android.app.Activity;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class AlphabetLearn extends Activity implements View.OnClickListener {

    MediaPlayer soundA, soundApple ;
    ImageButton imgbtnA, imgbtnApple, imgbtnNextA, imgbtnHomeA;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_alphabet_learn);

        imgbtnA = (ImageButton) findViewById(R.id.ImgBtn_A);
        imgbtnApple = (ImageButton) findViewById(R.id.ImgBtn_Apple);
        imgbtnHomeA = (ImageButton) findViewById(R.id.imgBtn_HomeA);
        imgbtnNextA = (ImageButton) findViewById(R.id.ImgBtn_NextA);

        //button click image
        imgbtnA.setOnClickListener(this);
        imgbtnApple.setOnClickListener(this);

        //button to Main Menu
        imgbtnHomeA.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), MainActivity.class);
                startActivity(intent);
            }
        });

        //button next
        imgbtnNextA.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), AlphabetLearnB.class);
                startActivity(intent);
            }
        });
    }

    //click the image for listen
    @Override
    public void onClick(View view) {
     switch (view.getId()) {
         case R.id.ImgBtn_A:
             soundA = MediaPlayer.create(this,R.raw.alphabet_a);
             soundA.start();
             break;
         case R.id.ImgBtn_Apple:
             soundApple = MediaPlayer.create(this,R.raw.apple);
             soundApple.start();
             break;
     }
    }

}

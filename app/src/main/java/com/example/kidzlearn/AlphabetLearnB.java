package com.example.kidzlearn;

import android.app.Activity;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.provider.ContactsContract;
import android.view.View;
import android.widget.ImageButton;

public class AlphabetLearnB extends Activity implements View.OnClickListener {

    MediaPlayer soundB, soundBall;
    ImageButton imgbtnB, imgbtnball, imgbtnPrevB, imgbtnNextB,imgbtnHomeB;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_alphabet_learn_b);

        imgbtnB = (ImageButton) findViewById(R.id.ImgBtn_B);
        imgbtnball = (ImageButton) findViewById(R.id.ImgBtn_Ball);
        imgbtnHomeB = (ImageButton) findViewById(R.id.imgBtn_HomeB);
        imgbtnPrevB = (ImageButton) findViewById(R.id.ImgBtn_PrevB);
        imgbtnNextB = (ImageButton) findViewById(R.id.ImgBtn_NextB);

        imgbtnB.setOnClickListener(this);
        imgbtnball.setOnClickListener(this);

        //button menu
        imgbtnHomeB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), MainActivity.class);
                startActivity(intent);
             }
        });

        //Back to learn A
        imgbtnPrevB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), AlphabetLearn.class);
                startActivity(intent);
            }
        });
        //Next to learn C
        imgbtnNextB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), AlphabetLearnC.class);
                startActivity(intent);
            }
        });
    }

    //click the image for listen
    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.ImgBtn_B:
            soundB = MediaPlayer.create(this,R.raw.alphabet_b);
            soundB.start();
            break;
            case R.id.ImgBtn_Ball:
            soundBall = MediaPlayer.create(this, R.raw.ball);
            soundBall.start();
            break;
        }
    }


}

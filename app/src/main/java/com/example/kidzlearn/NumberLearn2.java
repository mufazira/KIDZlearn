package com.example.kidzlearn;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class NumberLearn2 extends Activity implements View.OnClickListener {

    MediaPlayer sound2;
    ImageButton imgbtn2, imgbtnNext2, imgbtnPrev2, imgbtnHome2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_number_learn2);

        imgbtn2 = (ImageButton) findViewById(R.id.ImgBtn_Num2);
        imgbtnHome2 = (ImageButton) findViewById(R.id.imgBtn_Home2);
        imgbtnNext2 = (ImageButton) findViewById(R.id.ImgBtn_Next2);
        imgbtnPrev2 = (ImageButton) findViewById(R.id.ImgBtn_Prev2);

        imgbtn2.setOnClickListener(this);

        //button Menu, next, previous
        imgbtnHome2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), MainActivity.class);
                startActivity(intent);
            }
        });

        imgbtnNext2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), NumberLearn3.class);
                startActivity(intent);
            }
        });
        imgbtnPrev2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), NumberLearn1.class);
                startActivity(intent);
            }
        });
    }

    //click to listen
    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.ImgBtn_Num2:
                sound2 = MediaPlayer.create(this, R.raw.two);
                sound2.start();
                break;
        }

    }
}

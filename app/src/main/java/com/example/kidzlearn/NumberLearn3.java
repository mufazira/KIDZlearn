package com.example.kidzlearn;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class NumberLearn3 extends Activity implements View.OnClickListener {

    MediaPlayer sound3;
    ImageButton imgbtn3, imbtnHome3, imgbtnPrev3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_number_learn3);

        imgbtn3 = (ImageButton) findViewById(R.id.ImgBtn_Num3);
        imbtnHome3 = (ImageButton) findViewById(R.id.ImgBtn_Home3);
        imgbtnPrev3 = (ImageButton) findViewById(R.id.ImgBtn_Prev3);

        imgbtn3.setOnClickListener(this);

        imbtnHome3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), MainActivity.class);
                startActivity(intent);
            }
        });
        imgbtnPrev3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), NumberLearn2.class);
                startActivity(intent);
            }
        });
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.ImgBtn_Num3:
                sound3 = MediaPlayer.create(this, R.raw.three);
                sound3.start();
                break;
        }
    }
}

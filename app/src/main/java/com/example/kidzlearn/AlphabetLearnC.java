package com.example.kidzlearn;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class AlphabetLearnC extends Activity implements View.OnClickListener {

    MediaPlayer sounndC, soundCat;
    ImageButton imgbtnC, imgbtncat, imgbtnPrevC, imgbtnHomeC;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_alphabet_learn_c);

        imgbtnC = (ImageButton) findViewById(R.id.ImgBtn_C);
        imgbtncat = (ImageButton) findViewById(R.id.ImgBtn_Cat);
        imgbtnPrevC = (ImageButton) findViewById(R.id.ImgBtn_PrevC);
        imgbtnHomeC = (ImageButton) findViewById(R.id.ImgBtn_HomeC);

        imgbtnC.setOnClickListener(this);
        imgbtncat.setOnClickListener(this);

        //back to Learn B
        imgbtnPrevC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), AlphabetLearnB.class);
                startActivity(intent);
            }
        });
        //back to Menu
        imgbtnHomeC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), MainActivity.class);
                startActivity(intent);
            }
        });

    }

    //click the image for listen (SOUND)
    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.ImgBtn_C:
                sounndC = MediaPlayer.create(this,R.raw.alphabet_c);
                sounndC.start();
                break;
            case R.id.ImgBtn_Cat:
                soundCat = MediaPlayer.create(this, R.raw.car);
                soundCat.start();
                break;
        }
    }
}

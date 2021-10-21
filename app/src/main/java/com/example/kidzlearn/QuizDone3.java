package com.example.kidzlearn;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

public class QuizDone3 extends AppCompatActivity {
    TextView tvs3;
    ImageView imWellDone3;
    ImageButton ibContinue3, ibHmenu3, ibreplay3;
    Animation smalltobig;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz_done3);

        smalltobig = AnimationUtils.loadAnimation(this, R.anim.smalltobig);

        tvs3 = (TextView) findViewById(R.id.tv_s3);
        ibContinue3 = (ImageButton) findViewById(R.id.ib_continue3);
        ibreplay3 = (ImageButton) findViewById(R.id.ib_replay3);
        ibHmenu3 = (ImageButton) findViewById(R.id.ib_Hmenu3);
        imWellDone3 = (ImageView) findViewById(R.id.im_welldone3);

        imWellDone3.startAnimation(smalltobig);

        //button continue
        ibContinue3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(),Quiz4.class);
                startActivity(intent);
            }
        });
        //button replay
        ibreplay3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), Quiz3.class);
                startActivity(intent);
            }
        });
        //button home
        ibHmenu3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), MainActivity.class);
                startActivity(intent);
            }
        });
    }
}

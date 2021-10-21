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

public class QuizDone1 extends AppCompatActivity {

    TextView tvs1;
    ImageView imWellDone1;
    ImageButton ibContinue1, ibHmenu1, ibreplay1;
    Animation smalltobig;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz_done1);

        smalltobig = AnimationUtils.loadAnimation(this, R.anim.smalltobig);

        tvs1 = (TextView) findViewById(R.id.tv_s1);
        ibContinue1 = (ImageButton) findViewById(R.id.ib_continue1);
        ibreplay1 = (ImageButton) findViewById(R.id.ib_replay1);
        ibHmenu1 = (ImageButton) findViewById(R.id.ib_Hmenu1);
        imWellDone1 = (ImageView) findViewById(R.id.im_welldone1);

        imWellDone1.startAnimation(smalltobig);

        //button continue
        ibContinue1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), Quiz2.class);
                startActivity(intent);
            }
        });
        //button replay
        ibreplay1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), Quiz.class);
                startActivity(intent);
            }
        });
        //button home
        ibHmenu1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), MainActivity.class);
                startActivity(intent);
            }
        });
    }
}

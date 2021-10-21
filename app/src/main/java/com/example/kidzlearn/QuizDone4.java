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

public class QuizDone4 extends AppCompatActivity {
    TextView tvs4;
    ImageView imWellDone4;
    ImageButton ibContinue4, ibHmenu4, ibreplay4;
    Animation smalltobig;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz_done4);

        smalltobig = AnimationUtils.loadAnimation(this,R.anim.smalltobig);

        tvs4 = (TextView) findViewById(R.id.tv_s4);
        ibContinue4 = (ImageButton) findViewById(R.id.ib_continue4);
        ibreplay4 = (ImageButton) findViewById(R.id.ib_replay4);
        ibHmenu4 = (ImageButton) findViewById(R.id.ib_Hmenu4);
        imWellDone4 = (ImageView) findViewById(R.id.im_welldone4);

        imWellDone4.startAnimation(smalltobig);

        //button continue
        ibContinue4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), Quiz5.class);
                startActivity(intent);
            }
        });
        //button replay
        ibreplay4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), Quiz4.class);
                startActivity(intent);
            }
        });
        //button home
        ibHmenu4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), MainActivity.class);
                startActivity(intent);
            }
        });

    }
}

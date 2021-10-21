package com.example.kidzlearn;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.provider.ContactsContract;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

public class QuizDone5 extends AppCompatActivity {
    TextView tvs5;
    ImageView imWellDone5;
    ImageButton ibHmenu5, ibreplay5, ibexitmenud5;
    Animation smalltobig;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz_done5);

        smalltobig = AnimationUtils.loadAnimation(this,R.anim.smalltobig);

        tvs5 = (TextView) findViewById(R.id.tv_s5);
        ibreplay5 = (ImageButton) findViewById(R.id.ib_replay5);
        ibHmenu5 = (ImageButton) findViewById(R.id.ib_Hmenu5);
        imWellDone5 = (ImageView) findViewById(R.id.im_welldone5);
        ibexitmenud5 = (ImageButton) findViewById(R.id.ib_ExitMenuD5);

        imWellDone5.startAnimation(smalltobig);

        //button replay
        ibreplay5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), Quiz5.class);
                startActivity(intent);
            }
        });

        //button home
        ibHmenu5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(),MainActivity.class);
                startActivity(intent);
            }
        });
        //button exit
        ibexitmenud5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                moveTaskToBack(true);
                android.os.Process.killProcess(android.os.Process.myPid());
                System.exit(1);
            }
        });

    }
}

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

public class QuizDone2 extends AppCompatActivity {
    TextView tvs2;
    ImageView imWellDone2;
    ImageButton ibContinue2, ibHmenu2, ibreplay2;
    Animation smalltobig;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz_done2);

        smalltobig = AnimationUtils.loadAnimation(this, R.anim.smalltobig);

        tvs2 = (TextView) findViewById(R.id.tv_s2);
        ibContinue2 = (ImageButton) findViewById(R.id.ib_continue2);
        ibreplay2 = (ImageButton) findViewById(R.id.ib_replay2);
        ibHmenu2 = (ImageButton) findViewById(R.id.ib_Hmenu2);
        imWellDone2 = (ImageView) findViewById(R.id.im_welldone2);

        imWellDone2.startAnimation(smalltobig);

        //button continue
        ibContinue2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), Quiz3.class);
                startActivity(intent);
            }
        });
        //button replay
        ibreplay2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), Quiz2.class);
                startActivity(intent);
            }
        });
        //button home
        ibHmenu2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(),MainActivity.class);
                startActivity(intent);
            }
        });
    }
}

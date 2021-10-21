package com.example.kidzlearn;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Random;

public class Quiz5 extends AppCompatActivity {
    private int pressCounter = 0;
    private int maxPressCounter = 4;
    private String[] keys = {"O","E","M","N","W"};
    private String textAnswer = "ONE";
    Animation smallbigfourth;
    ImageView imQ5;
    TextView tittle5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz5);

        smallbigfourth = AnimationUtils.loadAnimation(this, R.anim.smallbigforth);

        keys = shuffleArray(keys);

        for (String key:keys){
            addView(((LinearLayout) findViewById(R.id.layoutPatent5)), key, ((EditText) findViewById(R.id.answer5)));
        }
        maxPressCounter = 3;
    }
    private String[] shuffleArray(String[] ar) {
        Random rnd = new Random();
        for (int i = ar.length -1; i>0; i--) {
            int index = rnd.nextInt(i + 1);
            String a = ar[index];
            ar[index] = ar[i];
            ar[i] = a;
        }
        return ar;
    }
    private void addView(LinearLayout viewParent, final  String text, final EditText editText){
        LinearLayout.LayoutParams linearLayoutParams = new LinearLayout.LayoutParams(
                LinearLayout.LayoutParams.WRAP_CONTENT,
                LinearLayout.LayoutParams.WRAP_CONTENT

        );
        linearLayoutParams.rightMargin = 20;
        linearLayoutParams.leftMargin = 30;

        final TextView textView = new TextView(this);

        textView.setLayoutParams(linearLayoutParams);
        textView.setBackground(this.getResources().getDrawable(R.drawable.square));
        textView.setTextColor(this.getResources().getColor(R.color.colorWords));
        textView.setGravity(Gravity.CENTER);
        textView.setText(text);
        textView.setClickable(true);
        textView.setFocusable(true);
        textView.setTextSize(25);

        tittle5 = (TextView) findViewById(R.id.tv_tittle5);
        imQ5 = (ImageView) findViewById(R.id.iv_q5);

        textView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (pressCounter<maxPressCounter) {
                    if (pressCounter == 0)
                        editText.setText("");

                    editText.setText(editText.getText().toString() + text);
                    textView.startAnimation(smallbigfourth);
                    textView.animate().alpha(0).setDuration(300);
                    pressCounter++;

                    if (pressCounter == maxPressCounter)
                        doValidate();
                }
            }
        });
        viewParent.addView(textView);
    }

    private void doValidate() {
        pressCounter = 0;
        EditText ans5 = findViewById(R.id.answer5);
        LinearLayout linearLayout = findViewById(R.id.layoutPatent5);
        if (ans5.getText().toString().equals(textAnswer)) {
            //Toast.makeText(Quiz.this, "CORRECT", Toast.LENGTH_LONG).show();
            Intent intent = new Intent(Quiz5.this, QuizDone5.class);
            startActivity(intent);
            ans5.setText("");
        } else {
            Toast.makeText(Quiz5.this, "WRONG", Toast.LENGTH_LONG).show();
            ans5.setText("");
        }
        keys = shuffleArray(keys);
        linearLayout.removeAllViews();
        for (String key:keys) {
            addView(linearLayout, key, ans5);
        }
    }
}

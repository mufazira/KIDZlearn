package com.example.kidzlearn;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.GridLayout;
import android.widget.ImageButton;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    GridLayout mainGrid;
    ImageButton exitMenu;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //button Exit
        exitMenu = (ImageButton) findViewById(R.id.ib_ExitMenu);
        exitMenu.setOnClickListener(new View.OnClickListener() {
            @Override
               public void onClick(View view) {
                    moveTaskToBack(true);
                    android.os.Process.killProcess(android.os.Process.myPid());
                System.exit(1);
            }
        });

        //menu button
        mainGrid = (GridLayout) findViewById(R.id.MainGrid);

        //get Event
        setSingleEvent (mainGrid);
    }

    private void setSingleEvent(GridLayout mainGrid) {
        for (int i = 0; i < mainGrid.getChildCount(); i++) {
            CardView cardView = (CardView) mainGrid.getChildAt(i);
            final int finalI = i;
            cardView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    if (finalI == 0)
                    {
                        Intent intent = new Intent(MainActivity.this, AlphabetLearn.class);
                        startActivity(intent);
                    }
                    else if (finalI == 1)
                    {
                        Intent intent = new Intent(MainActivity.this, NumberLearn1.class);
                        startActivity(intent);
                    }
                    else
                    {
                        Intent intent = new Intent(MainActivity.this, Quiz.class);
                        startActivity(intent);
                    }

                }
            });
        }
    }
}

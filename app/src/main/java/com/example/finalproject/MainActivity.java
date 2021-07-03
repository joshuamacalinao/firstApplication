package com.example.finalproject;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private CardView B1, B2, B3, B4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        B1 = (CardView) findViewById(R.id.b1);
        B2 = (CardView) findViewById(R.id.b2);
        B3 = (CardView) findViewById(R.id.b3);
        B4 = (CardView) findViewById(R.id.b4);

        B1.setOnClickListener((View.OnClickListener) this);
        B2.setOnClickListener((View.OnClickListener) this);
        B3.setOnClickListener((View.OnClickListener) this);
        B4.setOnClickListener((View.OnClickListener) this);

    }

    @Override
    public void onClick(View v){
        Intent i ;
        switch (v.getId()) {

            case R.id.b1:
                i = new Intent(this, types_of_stars.class);
                startActivity(i);
                break;

            case R.id.b2:
                i = new Intent(this, star_size_comparison.class);
                startActivity(i);
                break;

            case R.id.b3:
                i = new Intent(this, constellation.class);
                startActivity(i);
                break;

            case R.id.b4:
                i = new Intent(this, quizActivity.class);
                startActivity(i);
                break;

        }

    }

}
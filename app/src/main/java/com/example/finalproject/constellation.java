package com.example.finalproject;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class constellation extends AppCompatActivity implements View.OnClickListener{

    private CardView C1, C2, C3, C4, C5, C6, C7, C8, C9, C10, C11, C12;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_constellation);

        C1 = (CardView) findViewById(R.id.c1);
        C2 = (CardView) findViewById(R.id.c2);
        C3 = (CardView) findViewById(R.id.c3);
        C4 = (CardView) findViewById(R.id.c4);
        C5 = (CardView) findViewById(R.id.c5);
        C6 = (CardView) findViewById(R.id.c6);
        C7 = (CardView) findViewById(R.id.c7);
        C8 = (CardView) findViewById(R.id.c8);
        C9 = (CardView) findViewById(R.id.c9);
        C10 = (CardView) findViewById(R.id.c10);
        C11 = (CardView) findViewById(R.id.c11);
        C12 = (CardView) findViewById(R.id.c12);

        C1.setOnClickListener((View.OnClickListener) this);
        C2.setOnClickListener((View.OnClickListener) this);
        C3.setOnClickListener((View.OnClickListener) this);
        C4.setOnClickListener((View.OnClickListener) this);
        C5.setOnClickListener((View.OnClickListener) this);
        C6.setOnClickListener((View.OnClickListener) this);
        C7.setOnClickListener((View.OnClickListener) this);
        C8.setOnClickListener((View.OnClickListener) this);
        C9.setOnClickListener((View.OnClickListener) this);
        C10.setOnClickListener((View.OnClickListener) this);
        C11.setOnClickListener((View.OnClickListener) this);
        C12.setOnClickListener((View.OnClickListener) this);

    }

    @Override
    public void onClick(View v){
        Intent i ;
        switch (v.getId()) {

            case R.id.c1:
                i = new Intent(this, aries.class);
                startActivity(i);
                break;

            case R.id.c2:
                i = new Intent(this, taurus.class);
                startActivity(i);
                break;

            case R.id.c3:
                i = new Intent(this, gemini.class);
                startActivity(i);
                break;

            case R.id.c4:
                i = new Intent(this, cancer.class);
                startActivity(i);
                break;

            case R.id.c5:
                i = new Intent(this, leo.class);
                startActivity(i);
                break;

            case R.id.c6:
                i = new Intent(this, virgo.class);
                startActivity(i);
                break;

            case R.id.c7:
                i = new Intent(this, libra.class);
                startActivity(i);
                break;

            case R.id.c8:
                i = new Intent(this, scorpius.class);
                startActivity(i);
                break;

            case R.id.c9:
                i = new Intent(this, sagittarius.class);
                startActivity(i);
                break;

            case R.id.c10:
                i = new Intent(this, capricornus.class);
                startActivity(i);
                break;

            case R.id.c11:
                i = new Intent(this, aquarius.class);
                startActivity(i);
                break;

            case R.id.c12:
                i = new Intent(this, pices.class);
                startActivity(i);
                break;

        }

    }
}
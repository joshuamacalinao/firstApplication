package com.example.finalproject;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class types_of_stars extends AppCompatActivity implements View.OnClickListener {

    private CardView S1, S2, S3, S4, S5 , S6;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_types_of_stars);


        S1 = (CardView) findViewById(R.id.s1) ;
        S2 = (CardView) findViewById(R.id.s2) ;
        S3 = (CardView) findViewById(R.id.s3) ;
        S4 = (CardView) findViewById(R.id.s4) ;
        S5 = (CardView) findViewById(R.id.s5) ;
        S6 = (CardView) findViewById(R.id.s6) ;

        S1.setOnClickListener((View.OnClickListener) this);
        S2.setOnClickListener((View.OnClickListener) this);
        S3.setOnClickListener((View.OnClickListener) this);
        S4.setOnClickListener((View.OnClickListener) this);
        S5.setOnClickListener((View.OnClickListener) this);
        S6.setOnClickListener((View.OnClickListener) this);

    }

    @Override
    public void onClick(View v){
        Intent i;
        switch (v.getId()){

            case R.id.s1:
                i = new Intent(this, solartypestars.class);
                startActivity(i);
                break;

            case R.id.s2:
                i = new Intent(this, hotbluestars.class);
                startActivity(i);
                break;

            case R.id.s3:
                i = new Intent(this, reddwarfstars.class);
                startActivity(i);
                break;

            case R.id.s4:
                i = new Intent(this, redgiantstars.class);
                startActivity(i);
                break;

            case R.id.s5:
                i = new Intent(this, whitedwarfstars.class);
                startActivity(i);
                break;

            case R.id.s6:
                i = new Intent(this, neutronstarsandblackholes.class);
                startActivity(i);
                break;

        }
    }

}
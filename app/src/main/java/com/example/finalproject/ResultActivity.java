package com.example.finalproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class ResultActivity extends AppCompatActivity {

    Button returnButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);

        Intent i = getIntent();
        String output1 = i.getStringExtra("input1");
        String output2 = i.getStringExtra("input2");
        String output3 = i.getStringExtra("input3");
        String output4 = i.getStringExtra("input4");
        String output5 = i.getStringExtra("input5");
        String output6 = i.getStringExtra("input6");
        String output7 = i.getStringExtra("input7");
        String output8 = i.getStringExtra("input8");
        String output9 = i.getStringExtra("input9");
        String output10 = i.getStringExtra("input10");
        String output11 = i.getStringExtra("input11");
        String output12 = i.getStringExtra("input12");
        String output13 = i.getStringExtra("input13");
        String output14 = i.getStringExtra("input14");
        String output15 = i.getStringExtra("input15");
        String output16 = i.getStringExtra("input16");
        String output17 = i.getStringExtra("input17");
        String output18 = i.getStringExtra("input18");
        String output19 = i.getStringExtra("input19");
        String output20 = i.getStringExtra("input20");
        String output21 = i.getStringExtra("input21");
        String output22 = i.getStringExtra("input22");
        String output23 = i.getStringExtra("input23");
        String output24 = i.getStringExtra("input24");
        String output25 = i.getStringExtra("input25");
        String output26 = i.getStringExtra("input26");
        String output27 = i.getStringExtra("input27");
        String output28 = i.getStringExtra("input28");
        String output29 = i.getStringExtra("input29");
        String output30 = i.getStringExtra("input30");

        ((TextView)findViewById(R.id.output1)).setText(output1);
        ((TextView)findViewById(R.id.output2)).setText(output2);
        ((TextView)findViewById(R.id.output3)).setText(output3);
        ((TextView)findViewById(R.id.output4)).setText(output4);
        ((TextView)findViewById(R.id.output5)).setText(output5);
        ((TextView)findViewById(R.id.output6)).setText(output6);
        ((TextView)findViewById(R.id.output7)).setText(output7);
        ((TextView)findViewById(R.id.output8)).setText(output8);
        ((TextView)findViewById(R.id.output9)).setText(output9);
        ((TextView)findViewById(R.id.output10)).setText(output10);
        ((TextView)findViewById(R.id.output11)).setText(output11);
        ((TextView)findViewById(R.id.output12)).setText(output12);
        ((TextView)findViewById(R.id.output13)).setText(output13);
        ((TextView)findViewById(R.id.output14)).setText(output14);
        ((TextView)findViewById(R.id.output15)).setText(output15);
        ((TextView)findViewById(R.id.output16)).setText(output16);
        ((TextView)findViewById(R.id.output17)).setText(output17);
        ((TextView)findViewById(R.id.output18)).setText(output18);
        ((TextView)findViewById(R.id.output19)).setText(output19);
        ((TextView)findViewById(R.id.output20)).setText(output20);
        ((TextView)findViewById(R.id.output21)).setText(output21);
        ((TextView)findViewById(R.id.output22)).setText(output22);
        ((TextView)findViewById(R.id.output23)).setText(output23);
        ((TextView)findViewById(R.id.output24)).setText(output24);
        ((TextView)findViewById(R.id.output25)).setText(output25);
        ((TextView)findViewById(R.id.output26)).setText(output26);
        ((TextView)findViewById(R.id.output27)).setText(output27);
        ((TextView)findViewById(R.id.output28)).setText(output28);
        ((TextView)findViewById(R.id.output29)).setText(output29);
        ((TextView)findViewById(R.id.output30)).setText(output30);

        returnButton = findViewById(R.id.returnButton);

        returnButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(ResultActivity.this, MainActivity.class);
                startActivity(i);
            }
        });

    }
}
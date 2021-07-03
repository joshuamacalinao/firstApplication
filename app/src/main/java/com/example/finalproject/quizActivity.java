package com.example.finalproject;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class quizActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz);

    }


    public void submitButton(View view){

        AlertDialog.Builder alert = new AlertDialog.Builder(this);
        alert.setTitle("Proceed?");
        alert.setMessage("Are you sure about your answer?");
        alert.setPositiveButton("Yes", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int i) {
                Intent intent = new Intent(quizActivity.this,ResultActivity.class);
                String input1 = ((EditText)findViewById(R.id.input1)).getText().toString();
                String input2 = ((EditText)findViewById(R.id.input2)).getText().toString();
                String input3 = ((EditText)findViewById(R.id.input3)).getText().toString();
                String input4 = ((EditText)findViewById(R.id.input4)).getText().toString();
                String input5 = ((EditText)findViewById(R.id.input5)).getText().toString();
                String input6 = ((EditText)findViewById(R.id.input6)).getText().toString();
                String input7 = ((EditText)findViewById(R.id.input7)).getText().toString();
                String input8 = ((EditText)findViewById(R.id.input8)).getText().toString();
                String input9 = ((EditText)findViewById(R.id.input9)).getText().toString();
                String input10 = ((EditText)findViewById(R.id.input10)).getText().toString();
                String input11 = ((EditText)findViewById(R.id.input11)).getText().toString();
                String input12 = ((EditText)findViewById(R.id.input12)).getText().toString();
                String input13 = ((EditText)findViewById(R.id.input13)).getText().toString();
                String input14 = ((EditText)findViewById(R.id.input14)).getText().toString();
                String input15 = ((EditText)findViewById(R.id.input15)).getText().toString();
                String input16 = ((EditText)findViewById(R.id.input16)).getText().toString();
                String input17 = ((EditText)findViewById(R.id.input17)).getText().toString();
                String input18 = ((EditText)findViewById(R.id.input18)).getText().toString();
                String input19 = ((EditText)findViewById(R.id.input19)).getText().toString();
                String input20 = ((EditText)findViewById(R.id.input20)).getText().toString();
                String input21 = ((EditText)findViewById(R.id.input21)).getText().toString();
                String input22 = ((EditText)findViewById(R.id.input22)).getText().toString();
                String input23 = ((EditText)findViewById(R.id.input23)).getText().toString();
                String input24 = ((EditText)findViewById(R.id.input24)).getText().toString();
                String input25 = ((EditText)findViewById(R.id.input25)).getText().toString();
                String input26 = ((EditText)findViewById(R.id.input26)).getText().toString();
                String input27 = ((EditText)findViewById(R.id.input27)).getText().toString();
                String input28 = ((EditText)findViewById(R.id.input28)).getText().toString();
                String input29 = ((EditText)findViewById(R.id.input29)).getText().toString();
                String input30 = ((EditText)findViewById(R.id.input30)).getText().toString();


                intent.putExtra("input1", input1);
                intent.putExtra("input2", input2);
                intent.putExtra("input3", input3);
                intent.putExtra("input4", input4);
                intent.putExtra("input5", input5);
                intent.putExtra("input6", input6);
                intent.putExtra("input7", input7);
                intent.putExtra("input8", input8);
                intent.putExtra("input9", input9);
                intent.putExtra("input10", input10);
                intent.putExtra("input11", input11);
                intent.putExtra("input12", input12);
                intent.putExtra("input13", input13);
                intent.putExtra("input14", input14);
                intent.putExtra("input15", input15);
                intent.putExtra("input16", input16);
                intent.putExtra("input17", input17);
                intent.putExtra("input18", input18);
                intent.putExtra("input19", input19);
                intent.putExtra("input20", input20);
                intent.putExtra("input21", input21);
                intent.putExtra("input22", input22);
                intent.putExtra("input23", input23);
                intent.putExtra("input24", input24);
                intent.putExtra("input25", input25);
                intent.putExtra("input26", input26);
                intent.putExtra("input27", input27);
                intent.putExtra("input28", input28);
                intent.putExtra("input29", input29);
                intent.putExtra("input30", input30);

                startActivity(intent);
            }
        });

        alert.setNegativeButton("No", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int i) {
                Toast.makeText(quizActivity.this, "Canceled", Toast.LENGTH_SHORT).show();
            }
        });
        alert.create().show();
    }
}
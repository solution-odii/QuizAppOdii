package com.app.odii.quizapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.Toast;

public class Main2Activity extends AppCompatActivity {

    CheckBox option5;
    CheckBox option6;
    CheckBox option7;
    CheckBox option8;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        option5 = (CheckBox) findViewById(R.id.checkBox5);
        option6 = (CheckBox) findViewById(R.id.checkBox6);
        option7 = (CheckBox)findViewById(R.id.checkBox7);
        option8 = (CheckBox)findViewById(R.id.checkBox8);
    }

    public void Move2(View v) {
        if (option5.isChecked() && option8.isChecked()) {

            FR.FINALRESULT= FR.FINALRESULT+2;
            Intent move2 = new Intent(Main2Activity.this, Main3Activity.class);
            startActivity(move2);
            finish();
        }
        else if (option6.isChecked() || option7.isChecked()){

            Toast.makeText(this, "Incorrect Answers", Toast.LENGTH_SHORT).show();
        }
    }
}

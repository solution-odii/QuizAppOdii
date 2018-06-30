package com.app.odii.quizapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    int score;

    CheckBox option1;
    CheckBox option2;
    CheckBox option3;
    CheckBox option4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        option1 = (CheckBox) findViewById(R.id.checkBox);
        option2 = (CheckBox) findViewById(R.id.checkBox2);
        option4 = (CheckBox)findViewById(R.id.checkBox3);
        option4 = (CheckBox)findViewById(R.id.checkBox4);
    }

    public void Move1(View v) {
        if (option1.isChecked() && option4.isChecked()) {
            score = score + 2;
            FR.FINALRESULT = score;
            Intent move1 = new Intent(MainActivity.this, Main2Activity.class);
            startActivity(move1);
            finish();

        }else if (option2.isChecked() || option3.isChecked()){

            Toast.makeText(this, "Incorrect Answers", Toast.LENGTH_SHORT).show();
        }
    }
}


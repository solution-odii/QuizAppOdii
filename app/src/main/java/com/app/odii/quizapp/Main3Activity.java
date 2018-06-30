package com.app.odii.quizapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.Toast;

public class Main3Activity extends AppCompatActivity {

    CheckBox option9;
    CheckBox option10;
    CheckBox option11;
    CheckBox option12;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        option9 = (CheckBox) findViewById(R.id.checkBox9);
        option10 = (CheckBox) findViewById(R.id.checkBox10);
        option11 = (CheckBox) findViewById(R.id.checkBox11);
        option12 = (CheckBox) findViewById(R.id.checkBox12);
    }

    public void Move3(View v) {
        if (option11.isChecked() && option12.isChecked()) {
            FR.FINALRESULT = FR.FINALRESULT + 1;
            Intent move3 = new Intent(Main3Activity.this, Main4Activity.class);
            startActivity(move3);
            finish();
        }else if (option9.isChecked() || option10.isChecked()){

        Toast.makeText(this, "Incorrect Answers", Toast.LENGTH_SHORT).show();
        }
    }
}

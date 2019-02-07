package com.example.android.quizapp;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

import java.text.NumberFormat;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ImageView picture = (ImageView) findViewById(R.id.intro_picture);
        picture.setImageResource(R.drawable.a380);
    }

    public void submit(View view) {
        int score;
        score = 0;
        RadioButton q1_a2 = (RadioButton) findViewById(R.id.q1_a2);
        if (q1_a2.isChecked()) {
            score++;
        }

        // Get text response
        EditText AnswearField = (EditText) findViewById(R.id.name_field_q2);
        Editable AnswearEditable = AnswearField.getText();
        String answear = AnswearEditable.toString();
        if (answear.equalsIgnoreCase("Feet")) {
            score++;
        }

        RadioButton q3_a1 = (RadioButton) findViewById(R.id.q3_a1);
        if (q3_a1.isChecked()) {
            score++;
        }

        RadioButton q4_a1 = (RadioButton) findViewById(R.id.q4_a1);
        if (q4_a1.isChecked()) {
            score++;
        }

        RadioButton q5_a1 = (RadioButton) findViewById(R.id.q5_a1);
        if (q5_a1.isChecked()) {
            score++;
        }

        RadioButton q6_a2 = (RadioButton) findViewById(R.id.q6_a2);
        if (q6_a2.isChecked()) {
            score++;
        }

        CheckBox q7_a1 = (CheckBox) findViewById(R.id.q7_a1);
        boolean q7_aa1 = q7_a1.isChecked();
        CheckBox q7_a2 = (CheckBox) findViewById(R.id.q7_a2);
        boolean q7_aa2 = q7_a2.isChecked();
        CheckBox q7_a3 = (CheckBox) findViewById(R.id.q7_a3);
        boolean q7_aa3 = q7_a3.isChecked();
        CheckBox q7_a4 = (CheckBox) findViewById(R.id.q7_a4);
        boolean q7_aa4 = q7_a4.isChecked();

        CheckBox q8_a1 = (CheckBox) findViewById(R.id.q8_a1);
        boolean q8_aa1 = q8_a1.isChecked();
        CheckBox q8_a2 = (CheckBox) findViewById(R.id.q8_a2);
        boolean q8_aa2 = q8_a2.isChecked();
        CheckBox q8_a3 = (CheckBox) findViewById(R.id.q8_a3);
        boolean q8_aa3 = q8_a3.isChecked();
        CheckBox q8_a4 = (CheckBox) findViewById(R.id.q8_a4);
        boolean q8_aa4 = q8_a4.isChecked();

        if (q7_aa1 && q7_aa4 && !q7_aa2 && !q7_aa3) {
            score++;
        }
        if (q8_aa1 && q8_aa2 && q8_aa3 && !q8_aa4) {
            score++;
        }

        RadioButton q9_a1 = (RadioButton) findViewById(R.id.q9_a1);
        if (q9_a1.isChecked()) {
            score++;
        }
        RadioButton q10_a2 = (RadioButton) findViewById(R.id.q10_a2);
        if (q10_a2.isChecked()) {
            score++;
        }

        String finalMessage = "Your final score is: " + (score) + " points.";
        if (score == 10) {
            finalMessage = finalMessage + "\nCongratulations!";
        } else finalMessage = finalMessage + "\nThink again!";
        displayScore(finalMessage);

        Toast toast = Toast.makeText(getApplicationContext(), finalMessage, Toast.LENGTH_SHORT);
        toast.show();
    }

    private void displayScore(String message) {
        TextView scoreTextView = (TextView) findViewById(R.id.score);
        scoreTextView.setText(message);
    }

}

package com.example.zilonkaj.pockettherapy;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.NumberPicker;

public class Questionnaire extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_questionare);

        NumberPicker np = (NumberPicker) findViewById(R.id.numberPicker);

        np.setMinValue(10);
        np.setMaxValue(99);
        np.setOnLongPressUpdateInterval(1);
    }

    public void sendMessage(View view){
        Intent StartNew = new Intent(this, FeelingPrompt.class);
        startActivity(StartNew);
    }

}

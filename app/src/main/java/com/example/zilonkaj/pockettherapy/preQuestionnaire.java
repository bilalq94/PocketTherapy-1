package com.example.zilonkaj.pockettherapy;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;

public class preQuestionnaire extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pre_questionnaire);
    }

    public void switchScreen(View view) {
        // Do something in response to button
        Intent intent = new Intent(this, Questionnaire.class);
        startActivity(intent);



    }

}

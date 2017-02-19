package com.example.zilonkaj.pockettherapy;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class FeelingPrompt extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_feeling_prompt);
    }

    public void sendMessage(View view){
        Intent StartNew = new Intent(this, FinalScreen.class);
        startActivity(StartNew);




    }
}

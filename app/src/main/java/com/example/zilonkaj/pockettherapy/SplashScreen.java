package com.example.zilonkaj.pockettherapy;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import android.os.Handler;


public class SplashScreen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        new Handler().postDelayed(new Runnable(){
            public void run() {
                /* Create an Intent that will start the questionnaire. */
                Intent intent = new Intent(SplashScreen.this, preQuestionnaire.class);
                startActivity(intent);
                finish();
            }
        }, 3000);}

}


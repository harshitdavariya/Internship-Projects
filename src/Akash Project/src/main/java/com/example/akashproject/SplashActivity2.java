package com.example.akashproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.WindowManager;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.TextView;

import java.sql.Time;
import java.util.Timer;
import java.util.TimerTask;

public class SplashActivity2 extends AppCompatActivity {

    private TextView akash;
    Timer timer;

    @Override
    public void onBackPressed() {
        finish();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_splash2);

        getSupportActionBar().hide();
        setContentView(R.layout.activity_splash2);

        akash = findViewById(R.id.akash);

        Animation aniFadeIn = AnimationUtils.loadAnimation(SplashActivity2.this, R.anim.fade_in);

        akash.setAnimation(aniFadeIn);

        timer = new Timer();
        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                Intent intent = new Intent(SplashActivity2.this, SplashActivity3.class);
                startActivity(intent);
            }
        }, 3000);
    }
}
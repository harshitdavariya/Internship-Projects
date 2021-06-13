package com.example.akashproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.TextView;

import java.util.Timer;
import java.util.TimerTask;

public class SplashActivity3 extends AppCompatActivity {

    private TextView splashMusic;
    MediaPlayer splashSound;
    Timer timer;

    @Override
    public void onBackPressed() {
        splashSound.stop();
        finish();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_splash3);

        getSupportActionBar().hide();
        setContentView(R.layout.activity_splash3);

        splashMusic = findViewById(R.id.splash_music_1);

        Animation aniFadeIn = AnimationUtils.loadAnimation(SplashActivity3.this, R.anim.fade_in);

        splashMusic.setAnimation(aniFadeIn);
        splashSound = MediaPlayer.create(SplashActivity3.this, R.raw.splash_tune);
        splashSound.start();

        timer = new Timer();
        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                Intent intent = new Intent(SplashActivity3.this, MainActivity.class);
                startActivity(intent);
            }
        }, 5000);
    }
}
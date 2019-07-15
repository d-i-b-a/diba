package com.diba.diba;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;

import gr.net.maroulis.library.EasySplashScreen;

public class SplashScreen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        EasySplashScreen config =  new EasySplashScreen(SplashScreen.this)
                .withFullScreen()
                .withTargetActivity(MainActivity.class)
                .withSplashTimeOut(2000)
                .withBackgroundColor(Color.parseColor("#010203"))
                .withLogo(R.drawable.diba)
                .withFooterText("Copyright 2019");

        //Set Text Color
        config.getFooterTextView().setTextColor(Color.WHITE);

        //Set View
        View view = config.create();

        //Set Content View
        setContentView(view);
    }
}

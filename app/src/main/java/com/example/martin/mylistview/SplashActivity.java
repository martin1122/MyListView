package com.example.martin.mylistview;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;

public class SplashActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
//        Runnable runnable3secs= new Runnable() {
//            @Override
//            public void run() {
//                nextActivity();
//            }
//        };
//        Handler myHandler= new Handler();
//        myHandler.postDelayed(runnable3secs,3000);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                nextActivity();
                finish();
            }
        },3000);

    }

    public void nextActivity(){
        Intent intent= new Intent(this, MainActivity.class);
        startActivity(intent);
    }

}

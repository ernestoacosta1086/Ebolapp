package com.ahorcado.ernes.ebolapp;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

import com.parse.Parse;

public class SplashActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

//        Runnable executeAfter3Seconds = new Runnable() {
//            @Override
//            public void run() {
//                nextActivity();
//                finish();
//            }
//        };
//
//        Handler handler = new Handler();
//        handler.postDelayed(executeAfter3Seconds, 2500);

        Parse.initialize(new Parse.Configuration.Builder(this)
                .applicationId("kajaiZCg8Ri08zRMFDx4pAOs5ZsNbeI3boVV730M")
                .clientKey("n7BTnvUoffFmmW6ZQnrm4g95B0SNd9VIGyo8nvFp")
                .server("https://parseapi.back4app.com").build()
        );

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                nextActivity();
                finish();
            }
        }, 2500);
    }

    public void nextActivity() {
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }
}

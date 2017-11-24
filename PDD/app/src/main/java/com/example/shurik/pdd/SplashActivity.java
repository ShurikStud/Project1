package com.example.shurik.pdd;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

/**
 * Created by shurik on 04.11.2017.
 */

public class SplashActivity extends AppCompatActivity {

    private Activity activity;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        activity    = this;

        Thread thread_main  = new Thread(){

            public void run() {

                try {
                    int count = 2000;

                    while (count > 0){
                        sleep(200);
                        count-=200;
                    }

                    startActivity(new Intent(activity, MainActivity.class));

                }catch (InterruptedException e){

                    e.printStackTrace();

                } finally {

                    finish();

                }

            }
        };

        thread_main.start();

    }
}

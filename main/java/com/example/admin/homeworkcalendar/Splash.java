package com.example.admin.homeworkcalendar;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.Window;

public class Splash extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.splash);
        Handler handler = new Handler();
        handler.postDelayed(new SplashHandler(),2000);
    }

    class SplashHandler implements Runnable{
        public void run(){
            Intent intent = new Intent(getApplication(),Calendar.class);
            startActivity(intent);
            Splash.this.finish();
        }
    }
}

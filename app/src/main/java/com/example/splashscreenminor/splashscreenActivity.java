package com.example.splashscreenminor;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

public class splashscreenActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splashscreen);
        getSupportActionBar().hide();
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                //This line can be written before the delayfunc as long as the startactivity function is present in the runnable function inside postdelayed
                Intent nextHome = new Intent(splashscreenActivity.this,MainActivity.class);
                startActivity(nextHome);
                //        startActivity(new Intent(splashscreenActivity.this,MainActivity.class));

                //This form of intent declaration gives rise to cold start problem every time the application in used
                // and to avoid this the below startActivity can be used
                finish();
            }
        },5000);


//        finish();

    }
}
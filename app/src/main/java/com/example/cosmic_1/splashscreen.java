package com.example.cosmic_1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.WindowManager;

public class splashscreen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splashscreen);

        Thread td = new Thread(){

            public void run(){

                try {
                    sleep(5000);

                }catch (Exception ex){
                    ex.printStackTrace();

                }finally {
                    Intent intent = new Intent(splashscreen.this ,MainActivity.class);
                    startActivity(intent);
                    finish();
                }
            }
        }; td.start();

    }
}
package com.cookandroid.lecture14;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Exam01 extends AppCompatActivity {

    Intent intent;
    Button btnStart, btnStop;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_exam01);
        setTitle("음악 서비스");

        intent = new Intent(this, Exam01MusicService.class);
        btnStart = (Button) findViewById(R.id.exam01_btn_start);
        btnStop = (Button) findViewById(R.id.exam01_btn_stop);

        btnStart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startService(intent);
                android.util.Log.i("서비스 테스트", "startService()");
            }
        });

        btnStop.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                stopService(intent);
                android.util.Log.i("서비스 테스트", "stopService()");
            }
        });
    }
}
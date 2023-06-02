package com.cookandroid.lecture14;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class Exam02 extends AppCompatActivity {

    Intent intent;
    Button btnStart, btnStop;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_exam02);
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setIcon(R.drawable.music4);
        setTitle("음악 서비스 (개선)");

        intent = new Intent(this, Exam02MusicService.class);
        btnStart = (Button) findViewById(R.id.exam02_btn_start);
        btnStop = (Button) findViewById(R.id.exam02_btn_stop);

        btnStart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startService(intent);
                android.util.Log.i("서비스 테스트", "startService()");
                Toast.makeText(getApplicationContext(), "startService()", Toast.LENGTH_SHORT)
                        .show();
                finish();
            }
        });

        btnStop.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                stopService(intent);
                android.util.Log.i("서비스 테스트", "stopService()");
                Toast.makeText(getApplicationContext(), "stopService()",  Toast.LENGTH_SHORT)
                        .show();
            }
        });
    }
}
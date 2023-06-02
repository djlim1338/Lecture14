package com.cookandroid.lecture14;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class Prac01 extends AppCompatActivity {
    Intent intent;
    Button btnStart, btnStop;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_prac01);
        setTitle("연습문제14-1");

        intent = new Intent(this, Prac01MusicService.class);
        btnStart = (Button) findViewById(R.id.btnStart);
        btnStop = (Button) findViewById(R.id.btnStop);
        ActivityCompat.requestPermissions(this, new String[] {android.Manifest.permission.WRITE_EXTERNAL_STORAGE},MODE_PRIVATE);


        btnStart.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                startService(intent);
                //android.util.Log.i("서비스 테스트", "startService()");
            }
        });

        btnStop.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                stopService(intent);
                //android.util.Log.i("서비스 테스트", "stopService()");
            }
        });
    }

}
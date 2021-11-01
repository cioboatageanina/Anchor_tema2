package com.example.anchor;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    private CardView cvLogin;
    private CardView cvGoogle;
    private CardView cvEmail;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.v("tagCautare", "Found");
        Log.e("tagCautare", "Found: Error");
        Log.i("tagCautare", "Info");
        Log.d("tagCautare", "Debug");

        Log.v("lifeCycle", "onCreate");

        cvLogin = findViewById(R.id.cv1);
        cvGoogle = findViewById(R.id.cv2);
        cvEmail = findViewById(R.id.cv3);

        cvLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent newIntent = new Intent(MainActivity.this, Login.class);
                startActivity(newIntent);
            }
        });

        cvGoogle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent newIntent = new Intent(MainActivity.this, Google.class);
                startActivity(newIntent);
            }
        });

        cvEmail.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent newIntent = new Intent(MainActivity.this, Email.class);
                startActivity(newIntent);
            }
        });

    }
    @Override
    protected void onStart() {
        super.onStart();
        Log.v("lifeCycle", "onStart");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.v("lifeCycle", "onResume");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.v("lifeCycle", "onPause");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.v("lifeCycle", "onStop");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.v("lifeCycle", "onDestroy");
    }
}
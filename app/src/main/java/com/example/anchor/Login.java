package com.example.anchor;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.util.Timer;
import java.util.TimerTask;

public class Login extends AppCompatActivity {

    private CardView btnLogIn;
    private EditText edEmailLogIn;
    private EditText edParolaLogIn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        btnLogIn = findViewById(R.id.btnLogIn);
        edEmailLogIn = findViewById(R.id.edEmailLogIn);
        edParolaLogIn = findViewById(R.id.edParolaLogIn);

        btnLogIn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = getIntent();
                String email = i.getStringExtra("email");
                String parola = i.getStringExtra("parola");
                edEmailLogIn.setText (email);
                edParolaLogIn.setText (parola);
                edEmailLogIn.setEnabled(false);
                edParolaLogIn.setEnabled(false);
                new Timer().schedule(new TimerTask(){
                    public void run() {
                        Login.this.runOnUiThread(new Runnable() {
                            public void run() {
                                startActivity(new Intent(Login.this, Discover.class));
                            }
                        });
                    }
                }, 800);
            }
        });

       /* btnLogIn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Login.this, Discover.class);
                startActivity(intent);
            }
        });*/

    }
}
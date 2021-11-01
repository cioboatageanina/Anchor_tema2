package com.example.anchor;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.util.Patterns;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class Email extends AppCompatActivity {

    private CardView btnNext;
    private EditText edNameEmail;
    private EditText edEmailEmail;
    private EditText edParolaEmail;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_email);

        btnNext = findViewById(R.id.btnNext);
        edNameEmail = findViewById(R.id.edNameEmail);
        edEmailEmail = findViewById(R.id.edEmailEmail);
        edParolaEmail = findViewById(R.id.edParolaEmail);

        btnNext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent ( Email.this, Login.class );
                intent.putExtra ("email", edEmailEmail.getText().toString());
                intent.putExtra ("parola", edParolaEmail.getText().toString());
                startActivity(intent);
            }
        });
    }

    boolean isEmailValid(CharSequence email) {
        return Patterns.EMAIL_ADDRESS.matcher(email).matches();
    }

    private boolean isValid() {
        if (edNameEmail.getText().toString().isEmpty()) {
            Toast.makeText(Email.this, "You must enter your name.", Toast.LENGTH_LONG).show();
            return false;
        }
        if (edEmailEmail.getText().toString().isEmpty()) {
            Toast.makeText(Email.this, "Your email is invalid.", Toast.LENGTH_LONG).show();
            return false;
        }
        if (edParolaEmail.getText().toString().isEmpty()) {
            Toast.makeText(Email.this, "Your password is too weak.", Toast.LENGTH_LONG).show();
            return false;
        }
        if (!(isEmailValid(edEmailEmail.getText().toString()))) {
            Toast.makeText(Email.this, "Your email is invalid.", Toast.LENGTH_LONG).show();
            return false;
        }
        return true;
    }
}
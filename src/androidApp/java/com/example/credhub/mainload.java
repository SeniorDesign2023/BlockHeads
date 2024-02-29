package com.example.credhub;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

import com.example.credhub.ui.signup.signup;

public class mainload extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mainload);

        // Find the login button by its id
        Button loginButton = findViewById(R.id.loginbutton);
        // Set OnClickListener for the login button
        loginButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Navigate to the login activity
                Intent intent = new Intent(mainload.this, LogIn.class);
                startActivity(intent);
            }
        });

        // Find the sign-up button by its id
        Button signupButton = findViewById(R.id.signupbutton);
        // Set OnClickListener for the sign-up button
        signupButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Navigate to the sign-up activity
                Intent intent = new Intent(mainload.this, signup.class);
                startActivity(intent);
            }
        });
    }
}

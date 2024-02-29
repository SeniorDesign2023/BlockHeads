package com.example.credhub;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class degree_validated extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_degree_validated);

        ImageButton backButton = findViewById(R.id.imageButton4);
        // Set OnClickListener for the ImageButton
        backButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Navigate to the mainload activity
                Intent intent = new Intent(degree_validated.this, MainActivity.class);
                startActivity(intent);
            }
        });
    }
}
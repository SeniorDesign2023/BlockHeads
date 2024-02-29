package com.example.credhub;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

import com.example.credhub.ui.gallery.GalleryFragment;

public class validateage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_validateage);

            ImageButton backButton = findViewById(R.id.imageButton4);
            // Set OnClickListener for the ImageButton
            backButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Navigate to the Main activity
                Intent intent = new Intent(validateage.this, GalleryFragment.class);
                startActivity(intent);
            }
        });
        Button signupButton = findViewById(R.id.submitbutton);

        // Set OnClickListener for the sign-up button
        signupButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Navigate to the MainActivity
                Intent intent = new Intent(validateage.this, MainActivity.class);
                startActivity(intent);
            }
        });
    }
}
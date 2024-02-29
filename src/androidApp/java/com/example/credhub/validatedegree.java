package com.example.credhub;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.Spinner;

public class validatedegree extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_validatedegree);

        // Initialize Spinner
        Spinner degreeTypeSpinner = findViewById(R.id.degreeTypeSpinner);

        // Define degree types array with the initial prompt
        String[] degreeTypes = {"Select a Degree type", "Bachelor's Science", "Associates Science", "Associates Arts",
                "Bachelor's Arts", "Master's Science", "Master's Arts", "PhD", "DR"};

        // Set up adapter for the Spinner
        ArrayAdapter<String> adapter = new ArrayAdapter<>(this,
                android.R.layout.simple_spinner_item, degreeTypes);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        degreeTypeSpinner.setAdapter(adapter);

        // Set initial selection to the prompt
        degreeTypeSpinner.setSelection(0);

        // Find the Button by its id
        Button signupButton = findViewById(R.id.submitbutton);

        // Set OnClickListener for the sign-up button
        signupButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Get the selected degree type
                String selectedDegreeType = degreeTypeSpinner.getSelectedItem().toString();

                // You can do something with the selected degree type here

                // Navigate to the MainActivity
                Intent intent = new Intent(validatedegree.this, MainActivity.class);
                startActivity(intent);
            }
        });

        // Find the ImageButton for the back button
        ImageButton backButton = findViewById(R.id.imageButton4);

        // Set OnClickListener for the ImageButton
        backButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Finish the current activity and return to the previous one
                finish();
            }
        });
    }
}

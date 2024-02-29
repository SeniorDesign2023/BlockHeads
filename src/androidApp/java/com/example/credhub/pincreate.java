package com.example.credhub;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class pincreate extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pincreate);

        Button signupButton = findViewById(R.id.submitbutton);
        // Set OnClickListener for the sign-up button
        signupButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText pinEditText = findViewById(R.id.passwordEditText);
                EditText rePinEditText = findViewById(R.id.repassword);

                String pin = pinEditText.getText().toString();
                String rePin = rePinEditText.getText().toString();

                if (pin.isEmpty() || rePin.isEmpty()) {
                    Toast.makeText(pincreate.this, "Both fields are required", Toast.LENGTH_SHORT).show();
                } else if (!pin.equals(rePin)) {
                    Toast.makeText(pincreate.this, "Pins do not match", Toast.LENGTH_SHORT).show();
                } else if (pin.length() != 4) {
                    Toast.makeText(pincreate.this, "PIN must be 4 digits", Toast.LENGTH_SHORT).show();
                } else {
                    // Proceed with your original logic if everything is fine
                    Intent intent = new Intent(pincreate.this, MainActivity.class);
                    startActivity(intent);
                }
            }
        });
    }
}

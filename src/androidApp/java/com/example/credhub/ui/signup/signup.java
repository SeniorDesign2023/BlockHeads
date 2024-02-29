package com.example.credhub.ui.signup;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.Toast;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Locale;
import java.util.regex.Pattern;

import com.example.credhub.MainActivity;
import com.example.credhub.R;
import com.example.credhub.mainload;
import com.example.credhub.pincreate;

public class signup extends AppCompatActivity {

    private EditText birthdateEditText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup);

        // Initialize views
        initializeViews();

        // Set up back button click listener
        ImageButton backButton = findViewById(R.id.imageButton4);
        backButton.setOnClickListener(v -> {
            Intent intent = new Intent(signup.this, mainload.class);
            startActivity(intent);
        });

        // Set up sign-up button click listener
        Button signupButton = findViewById(R.id.signupbutton);
        signupButton.setOnClickListener(v -> {
            // Validate inputs
            if (validateInputs()) {
                // If inputs are valid, navigate to the next activity
                Intent intent = new Intent(signup.this, pincreate.class);
                startActivity(intent);
            }
        });
    }

    private void initializeViews() {
        birthdateEditText = findViewById(R.id.birthdateEditText);
        EditText passwordEditText = findViewById(R.id.passwordEditText);
        EditText repasswordEditText = findViewById(R.id.repassword);

        // Set transformation method to show dots instead of actual characters
        passwordEditText.setTransformationMethod(android.text.method.PasswordTransformationMethod.getInstance());
        repasswordEditText.setTransformationMethod(android.text.method.PasswordTransformationMethod.getInstance());
    }

    private boolean validateInputs() {
        EditText firstNameEditText = findViewById(R.id.firstNameEditText);
        EditText lastNameEditText = findViewById(R.id.lastNameEditText);
        EditText emailEditText = findViewById(R.id.emailEditText);
        EditText phoneNumberEditText = findViewById(R.id.phoneNumberEditText);
        EditText usernameEditText = findViewById(R.id.usernameEditText);
        EditText passwordEditText = findViewById(R.id.passwordEditText);
        EditText repasswordEditText = findViewById(R.id.repassword);
        CheckBox agreeCheckBox = findViewById(R.id.checkBox);

        // Check if any field is empty
        if (firstNameEditText.getText().toString().isEmpty() ||
                lastNameEditText.getText().toString().isEmpty() ||
                emailEditText.getText().toString().isEmpty() ||
                phoneNumberEditText.getText().toString().isEmpty() ||
                birthdateEditText.getText().toString().isEmpty() ||
                usernameEditText.getText().toString().isEmpty() ||
                passwordEditText.getText().toString().isEmpty() ||
                repasswordEditText.getText().toString().isEmpty()) {
            showToast("All fields are required");
            return false;
        }

        // Check if password and re-enter password match
        if (!passwordEditText.getText().toString().equals(repasswordEditText.getText().toString())) {
            showToast("Passwords do not match");
            return false;
        }

        // Check if password meets the criteria (8 characters or more with one capital letter and a number)
        String password = passwordEditText.getText().toString();
        if (!Pattern.compile("^(?=.*[0-9])(?=.*[A-Z]).{8,}$").matcher(password).matches()) {
            showToast("Password must be 8 characters or more with at least one capital letter and a number");
            return false;
        }

        // Check if birthdate is in MM/DD/YYYY format
        String birthdate = birthdateEditText.getText().toString();
        SimpleDateFormat dateFormat = new SimpleDateFormat("MM/dd/yyyy", Locale.US);
        dateFormat.setLenient(false);
        try {
            dateFormat.parse(birthdate);
        } catch (ParseException e) {
            showToast("Birthdate must be in MM/DD/YYYY format");
            return false;
        }

        // Check if the checkbox is checked
        if (!agreeCheckBox.isChecked()) {
            showToast("You must agree to the terms");
            return false;
        }

        return true;
    }

    private void showToast(String message) {
        Toast.makeText(this, message, Toast.LENGTH_SHORT).show();
    }
}

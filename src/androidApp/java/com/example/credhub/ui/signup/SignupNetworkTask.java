package com.example.credhub.ui.signup;

import android.os.AsyncTask;
import android.util.Log;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class SignupNetworkTask extends AsyncTask<Void, Void, Boolean> {

    private static final String TAG = SignupNetworkTask.class.getSimpleName();

    // Database credentials
    private static final String DB_URL = "jdbc:mysql://your_aws_db_endpoint:3306/your_database_name";
    private static final String USER = "your_database_username";
    private static final String PASS = "your_database_password";

    // Sign-up data
    private String firstName;
    private String lastName;
    private String email;
    private String phoneNumber;
    private String birthdate;
    private String username;
    private String password;

    public SignupNetworkTask(String firstName, String lastName, String email, String phoneNumber,
                             String birthdate, String username, String password) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.birthdate = birthdate;
        this.username = username;
        this.password = password;
    }

    @Override
    protected Boolean doInBackground(Void... voids) {
        Connection conn = null;
        PreparedStatement stmt = null;
        try {
            // Register JDBC driver
            Class.forName("com.mysql.jdbc.Driver");
            // Open a connection
            conn = DriverManager.getConnection(DB_URL, USER, PASS);
            // Execute a query
            String sql = "INSERT INTO users (first_name, last_name, email, phone_number, birthdate, username, password) VALUES (?, ?, ?, ?, ?, ?, ?)";
            stmt = conn.prepareStatement(sql);
            stmt.setString(1, firstName);
            stmt.setString(2, lastName);
            stmt.setString(3, email);
            stmt.setString(4, phoneNumber);
            stmt.setString(5, birthdate);
            stmt.setString(6, username);
            stmt.setString(7, password);
            int rowsAffected = stmt.executeUpdate();
            return rowsAffected > 0;
        } catch (SQLException | ClassNotFoundException e) {
            Log.e(TAG, "Error in database operation", e);
            return false;
        } finally {
            try {
                if (stmt != null) {
                    stmt.close();
                }
                if (conn != null) {
                    conn.close();
                }
            } catch (SQLException e) {
                Log.e(TAG, "Error closing database connection", e);
            }
        }
    }
}

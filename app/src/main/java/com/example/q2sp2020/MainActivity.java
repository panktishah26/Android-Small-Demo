package com.example.q2sp2020;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    public final static String USERNAME = "quiz2b";
    public final static String PASSWORD = "spring2020";
    EditText username;
    EditText password;
    public final static String TAG = "LoginPage";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        username = findViewById(R.id.username);
        password = findViewById(R.id.passowrd);
    }

    public void login(View view) {

        if (!username.getText().toString().equals(USERNAME) || !password.getText().toString().equals(PASSWORD)) {
            Toast.makeText(this, "Incorrect username/password", Toast.LENGTH_LONG).show();
            return;
        }
        Intent intent = new Intent(this, Activity2.class);
        intent.putExtra("name",USERNAME);
        startActivity(intent);
    }
}

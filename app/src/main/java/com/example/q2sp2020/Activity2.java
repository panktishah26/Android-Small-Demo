package com.example.q2sp2020;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Activity2 extends AppCompatActivity {
    //List<String> list = new ArrayList<>();
    Set<String> list = new HashSet<>();
    EditText eid;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
    }

    public void logout(View view) {
        alertDialog();
    }

    public void enroll(View view) {
        eid = findViewById(R.id.textView2);
        if(list.contains(eid.getText().toString())) {
            Toast.makeText(getApplicationContext(), "Student is already enrolled in "+eid.getText().toString(), Toast.LENGTH_LONG).show();
        } else {
            Toast.makeText(getApplicationContext(), "Student enrolling in "+eid.getText().toString(), Toast.LENGTH_LONG).show();
            list.add(eid.getText().toString());
        }
    }

    public void alertDialog() {
        System.out.println("inside dialog");
        AlertDialog.Builder dialog = new AlertDialog.Builder(this);
        dialog.setMessage("Click yes to logout");
        dialog.setTitle("Are you sure?");
        dialog.setPositiveButton("Yes", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                Intent intent = new Intent(Activity2.this, MainActivity.class);
                startActivity(intent);
            }
        });
        dialog.setNegativeButton("No", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                Toast.makeText(getApplicationContext(), "You decided to stay!", Toast.LENGTH_LONG).show();
            }
        });
        AlertDialog alertDialog=dialog.create();
        alertDialog.show();
    }
}

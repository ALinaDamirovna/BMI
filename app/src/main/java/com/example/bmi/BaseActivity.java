package com.example.bmi;


import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;


import androidx.appcompat.app.AppCompatActivity;

import android.widget.Toast;
public class BaseActivity extends AppCompatActivity {
    private Button button;
    private EditText firstnameText,lastnameText;
    public static final String LOG_TAG =BaseActivity.class.getSimpleName();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        button=findViewById(R.id.button);
        firstnameText=findViewById(R.id.firstname);
        lastnameText=findViewById(R.id.lastname);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (firstnameText.getText().toString().equals("") | lastnameText.getText().toString().equals("")) {
                    Toast.makeText(getApplicationContext(), "Enter the data,please", Toast.LENGTH_LONG).show();
                }else{
                String firstnameT = firstnameText.getText().toString();
                String lastnameT = lastnameText.getText().toString();
                Toast.makeText(getApplicationContext(), "Hello," + firstnameT + " " + lastnameT + "!", Toast.LENGTH_LONG).show();
                Intent i = new Intent(getApplicationContext(), MainActivity.class);

                i.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP | Intent.FLAG_ACTIVITY_SINGLE_TOP);
                startActivity(i);
            }

            }
        });

    }
    @Override
    protected void onStop() {
        super.onStop();
        Log.i(LOG_TAG, "BaseActivity onStop");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.i(LOG_TAG, "BaseActivity onDestroy");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.i(LOG_TAG, "BaseActivity onPause");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.i(LOG_TAG, "BaseActivity onResume");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.i(LOG_TAG, "BaseActivity onStart");
    }
}

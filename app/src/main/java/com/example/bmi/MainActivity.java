package com.example.bmi;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
public class MainActivity extends AppCompatActivity {
    private Button button;
    private Button button1;
    private EditText heightText,weightText;
    public static final String LOG_TAG =MainActivity.class.getSimpleName();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button=findViewById(R.id.button);
        button1=findViewById(R.id.button1);
        heightText=findViewById(R.id.firstname);
        weightText=findViewById(R.id.lastname);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (heightText.getText().toString().equals("") | weightText.getText().toString().equals("")) {
                    Toast.makeText(getApplicationContext(), "Enter the data,please", Toast.LENGTH_LONG).show();
                }else{
                float height = Float.parseFloat(heightText.getText().toString());
                float weight = Float.parseFloat(weightText.getText().toString());
                float bmi = weight / (height * height);
                Toast.makeText(getApplicationContext(), "BMI is: " + bmi, Toast.LENGTH_LONG).show();
                Intent i = new Intent(getApplicationContext(), secondActivity.class);

                i.putExtra("BMI", bmi);
                startActivity(i);
            }

            }
        });
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), BaseActivity.class);
                intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP | Intent.FLAG_ACTIVITY_SINGLE_TOP);
                startActivity(intent);


            }
        });
    }
    @Override
    protected void onStop() {
        super.onStop();
        Log.i(LOG_TAG, "MainActivity onStop");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.i(LOG_TAG, "MainActivity onDestroy");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.i(LOG_TAG, "MainActivity onPause");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.i(LOG_TAG, "MainActivity onResume");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.i(LOG_TAG, "MainActivity onStart");
    }
}

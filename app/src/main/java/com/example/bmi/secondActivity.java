package com.example.bmi;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;
public class secondActivity extends AppCompatActivity {
    private TextView resultText;
    private ImageView resultImage;
    private Button button, button1;
    public static final String LOG_TAG =secondActivity.class.getSimpleName();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        Intent intent=getIntent();
        float user_bmi=intent.getFloatExtra("BMI",0);
        button=findViewById(R.id.button);
        button1=findViewById(R.id.button1);
        if(25.0>=user_bmi && 17.0<=user_bmi)
        {   resultText = (TextView)findViewById(R.id.result);
            resultText.setText("you are healthy");
            resultImage=(ImageView)findViewById(R.id.resultImg);
            Drawable drawable  = getResources().getDrawable(R.drawable.healthy);
            resultImage.setImageDrawable(drawable);
        }
        else if(user_bmi<=17.0)
        {   resultText = (TextView)findViewById(R.id.result);
            resultText.setText("you are Undernurished");
            resultImage=(ImageView)findViewById(R.id.resultImg);
            Drawable drawable  = getResources().getDrawable(R.drawable.weak);
            resultImage.setImageDrawable(drawable);
        }
        else
        {   resultText = (TextView)findViewById(R.id.result);
            resultText.setText("you are Overnurished!");
            resultImage=(ImageView)findViewById(R.id.resultImg);
            Drawable drawable  = getResources().getDrawable(R.drawable.over);
            resultImage.setImageDrawable(drawable);
        }
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(getApplicationContext(), BaseActivity.class);
                intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP | Intent.FLAG_ACTIVITY_SINGLE_TOP);
                startActivity(intent);


            }
        });
        button1.setOnClickListener(new View.OnClickListener() {
            @RequiresApi(api = Build.VERSION_CODES.JELLY_BEAN)
            @Override
            public void onClick(View v) {

                finishAffinity();
                System.exit(0);


            }
        });

    }
    @Override
    protected void onStop() {
        super.onStop();
        Log.i(LOG_TAG, "SecondActivity onStop");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.i(LOG_TAG, "SecondActivity onDestroy");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.i(LOG_TAG, "SecondActivity onPause");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.i(LOG_TAG, "SecondActivity onResume");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.i(LOG_TAG, "SecondActivity onStart");
    }
}

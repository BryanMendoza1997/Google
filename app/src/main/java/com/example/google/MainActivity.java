package com.example.google;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void EnviarGmail(View view)
    {
        Intent segundo=new Intent(this,Gmail.class);
        startActivity(segundo);
    }
    public void EnviarDrive(View view)
    {
        Intent segundo=new Intent(this,Drive.class);
        startActivity(segundo);
    }
}
package com.example.lec2demo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);//execute the base/superclass onCreate method
        setContentView(R.layout.activity_main);//responsible for applying the layout onto the activity
    }
}
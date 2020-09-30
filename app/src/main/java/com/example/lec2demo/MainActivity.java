package com.example.lec2demo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button btnViewRecipe; //object in java code

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);//execute the base/superclass onCreate method
        setContentView(R.layout.activity_main);//responsible for applying the layout onto the activity

        /*
        Button viewRecipe = findViewById(R.id.btnViewRecipe);
        viewRecipe.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent recipeActivity = new Intent(MainActivity.this,RecipeActivity.class);
                startActivity(recipeActivity);
            }
        });*/
        //demo for try catch
        try{
            TextView txtViewTitle = findViewById(R.id.txtViewTitle);//incorrectly accessing view from other activity
            txtViewTitle.setText("Hello World");//result in referencing a method from a null object - null pointer exception

        }catch(Exception ex){
            Log.e("RECIPE APP","Accessing incorrect view");
        }


        btnViewRecipe = findViewById(R.id.btnViewRecipe); //id comes from xml design layout, this method can be called only after onCreate method is called
        btnViewRecipe.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //start recipe activity
                //intent is abstract class useful in communication in mobile app, what action going to occur, what data might be passed
                startActivity(new Intent(MainActivity.this,RecipeActivity.class));//current activity parameter - referring to the main activity obj

            }

        });


    }
}
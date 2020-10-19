package com.example.myapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        try{
            this.getSupportActionBar().hide();
        }catch (NullPointerException e){

        }

        Button buttonNext = (Button) findViewById(R.id.button_start);
        buttonNext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Intent i = new Intent(getApplicationContext(), Ingredient.class);
                Intent i = new Intent(getApplicationContext(), Favourite.class);
                startActivity(i);
            }
        });
    }
}

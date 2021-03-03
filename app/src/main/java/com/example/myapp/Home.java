package com.example.myapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class Home extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.home);

        try{
            this.getSupportActionBar().hide();
        }catch (NullPointerException e){

        }

        Button logo1 = (Button) findViewById(R.id.logo1);
        logo1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(), Ingredient.class);
                startActivity(i);
            }
        });
        Button logo2 = (Button) findViewById(R.id.logo2);
        logo2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(), Chooseingredient.class);
                startActivity(i);
            }
        });
        Button logo3 = (Button) findViewById(R.id.logo3);
        logo3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(), Favourite.class);
                startActivity(i);
            }
        });
        Button logo4 = (Button) findViewById(R.id.logo4);
        logo4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(), MainActivity.class);
                startActivity(i);
            }
        });
    }
}
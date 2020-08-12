package com.example.myapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

import java.util.ArrayList;

public class Showmenufromdatabase extends AppCompatActivity {
    ArrayList<String> input = new ArrayList<String>();
    public int index = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.showmenufromdatabase);
        /*
        getIngredient("garlic");
        getIngredient("lemongrass");
        getIngredient("tomato");
        getIngredient("chinesecabbage");
        getIngredient("cabbage");
        getIngredient("chile");
        getIngredient("kaffirlimeleaves");
        getIngredient("yardlongbeans");
        getIngredient("carrot");
        getIngredient("lemon");
        getIngredient("babycorn");
        getIngredient("springonion");
        getIngredient("kale");
        getIngredient("onion");
        getIngredient("cucumber");
        getIngredient("ginger");
        getIngredient("galangal");
        getIngredient("blockkerry");
        getIngredient("coriander");
        getIngredient("holybasil");
        getIngredient("waterspinach");
        getIngredient("egg");
        getIngredient("shrimp");
        getIngredient("porkmeat");
        getIngredient("chickenbreast");*/

        // edit code here
        Button buttonNextChoose = (Button) findViewById(R.id.showrecipe);
        buttonNextChoose.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(), Showrecipe.class);
                startActivity(i);
            }
        });
    }
    public void getIngredient(final String name){
        String way = "ingredientinput/" + name;
        FirebaseDatabase database = FirebaseDatabase.getInstance();
        final DatabaseReference myRef = database.getReference(way); // "ingredientibput/garlic"

        myRef.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                String Value = dataSnapshot.getValue(String.class);
                if(Value.equals("yes")){
                    getInput(name);
                    changIndex();
                    Toast.makeText(getApplicationContext(), name, Toast.LENGTH_LONG).show();

                }

            }
            @Override
            public void onCancelled(DatabaseError error) {
                Toast.makeText(getApplicationContext(), "fail read date", Toast.LENGTH_LONG).show();
            }

        });
    }
    public void getInput(String name){
        input.add(name);
    }
    public void changIndex(){
        index = index+1;
    }
}

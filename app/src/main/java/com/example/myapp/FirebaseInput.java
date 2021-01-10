package com.example.myapp;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class FirebaseInput {
    public boolean PuttoFirebase(String name){
        String way = "ingredientinput/"+name;
        FirebaseDatabase database = FirebaseDatabase.getInstance();
        DatabaseReference myRef = database.getReference(way);
        myRef.setValue("true");
        return true;
    }
}

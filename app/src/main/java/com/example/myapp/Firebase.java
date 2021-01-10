package com.example.myapp;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class Firebase {
    public String getData(String way){
        FirebaseDatabase database = FirebaseDatabase.getInstance();
        DatabaseReference myRef = database.getReference("ingredientinput/yardlongbeans");
        myRef.setValue("true");
        String str = "";
        return str;
    }
    public String getMenu(String way){
        FirebaseDatabase database = FirebaseDatabase.getInstance();
        DatabaseReference myRef = database.getReference("Menu/yardlongbeans");
        myRef.setValue("true");
        String str = "";
        return str;
    }
    public String Searchdatabase(String name){
        String way = "Menu/" + name;
        FirebaseDatabase database = FirebaseDatabase.getInstance();
        DatabaseReference myRef = database.getReference(way);
        myRef.setValue("true");
        String str = "";
        return str;
    }
    public int Count(String[] list){
        int count = 0;
        count = list.length;
        return count;
    }
    public boolean Putdata(String name){
        FirebaseDatabase database = FirebaseDatabase.getInstance();
        DatabaseReference myRef = database.getReference("Menu/yardlongbeans");
        myRef.setValue("true");
        boolean str = true;
        return str;
    }
}

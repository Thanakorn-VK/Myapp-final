package com.example.myapp;

import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;



import androidx.appcompat.app.AppCompatActivity;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;



public class Ingredient extends AppCompatActivity {
    String v="test";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.ingredient);
        Toast.makeText(getApplicationContext(),"read data",Toast.LENGTH_LONG).show();
        readdata();



    }


    public void setname() {

        FirebaseDatabase database = FirebaseDatabase.getInstance();
        DatabaseReference myRef = database.getReference("ingredient/01/name");
        Toast.makeText(getApplicationContext(),"readed path",Toast.LENGTH_LONG).show();
        // Read from the database
        myRef.addValueEventListener(new ValueEventListener() {

            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                //TextView textView = (TextView)findViewById(R.id.box1);
                v = dataSnapshot.getValue(String.class);
                //textView.setText(v);
                Toast.makeText(getApplicationContext(),"onDataChage",Toast.LENGTH_LONG).show();
            }

            @Override
            public void onCancelled(DatabaseError error) {
                // Failed to read value

            }
        });
    }
    public void readdata() {
        final FirebaseDatabase database = FirebaseDatabase.getInstance();
        DatabaseReference myRef = database.getReference("ingredient/01/check");
        Toast.makeText(getApplicationContext(),"get path",Toast.LENGTH_LONG).show();
        myRef.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                TextView textView = (TextView)findViewById(R.id.box1);
                String value = dataSnapshot.getValue(String.class);
                Toast.makeText(getApplicationContext(),"get string",Toast.LENGTH_LONG).show();
                if(value.equals("yes")) {
                   Toast.makeText(getApplicationContext(),"compair",Toast.LENGTH_LONG).show();
                    setname();
                    Toast.makeText(getApplicationContext(),"set box1",Toast.LENGTH_LONG).show();
                    textView.setText(v);
                }
            }
            @Override
            public void onCancelled(DatabaseError error) {
                // Failed to read value
            }
        });

    }/*
    public void basicWrite() {

        // [START write_message]
        // Write a message to the database
        FirebaseDatabase database = FirebaseDatabase.getInstance();
        DatabaseReference myRef = database.getReference("id");

        myRef.setValue("Hello, World!");

        DatabaseReference myRef1 = database.getReference("message");

        myRef1.setValue("Hello, Worldtest!");
        // [END write_message]

        // [START read_message]
        // Read from the database
        // [END read_message]
        // Read from the database
    }

    /*
    public void basicRead(){
        FirebaseDatabase database = FirebaseDatabase.getInstance();
        DatabaseReference myRef = database.getReference("id");

        // Read from the database
        myRef.addValueEventListener(new ValueEventListener() {

            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                TextView textView = (TextView)findViewById(R.id.textdatatest);
                // This method is called once with the initial value and again
                // whenever data at this location is updated.
                String value = dataSnapshot.getValue(String.class);
                textView.setText(value);
            }

            @Override
            public void onCancelled(DatabaseError error) {
                // Failed to read value

            }
        });
    }*/
}

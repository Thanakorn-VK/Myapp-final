package com.example.myapp;

import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;


import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;


public class Ingredient extends AppCompatActivity {
    public int i = 2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.ingredient);
        Toast.makeText(getApplicationContext(), "read data", Toast.LENGTH_LONG).show();
        setPath();
        //testloop();
    }

    public void testloop() {
        String fruits[] = {"garlic",
                "lemongrass"};/*,
                "tomato",
                "chinesecabbage",
                "cabbage",
                "chile",
                "kaffirlimeleaves",
                "yardlongbeans",
                "carrot",
                "lemon",
                "babycorn",
                "springonion",
                "kale",
                "onion",
                "cucumber",
                "ginger",
                "galangal",
                "blockkerry",
                "coriander",
                "holybasil",
                "waterspinach",
                "egg",
                "shrimp",
                "porkmeat",
                "chickenbreast"};*/
        for(String fruit : fruits){
            Toast.makeText(getApplicationContext(), fruit, Toast.LENGTH_LONG).show();
            setname(fruit);
        }
    }
    public void setname(final String name) {
        String To = "ingredient/" + name + "/status";
        FirebaseDatabase database = FirebaseDatabase.getInstance();
        DatabaseReference myRef = database.getReference(To);
        Toast.makeText(getApplicationContext(), "Path is " + To, Toast.LENGTH_LONG).show();
        myRef.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                TextView textView1 = (TextView) findViewById(R.id.box1);
                TextView textView4 = (TextView) findViewById(R.id.box4);
                String Value = dataSnapshot.getValue(String.class);
                textView4.setText(Value);
                textView1.setText(name);
                Toast.makeText(getApplicationContext(), "onDataChage", Toast.LENGTH_LONG).show();
            }

            @Override
            public void onCancelled(DatabaseError error) {
                // Failed to read value

            }
        });
    }




    public void setPath() {
        Toast.makeText(getApplicationContext(), "in setPath", Toast.LENGTH_LONG).show();
        String fruits[] = {"garlic",
                "lemongrass",
                "tomato",
                "chinesecabbage",
                "cabbage"};/*,
                "chile",
                "kaffirlimeleaves",
                "yardlongbeans",
                "carrot",
                "lemon",
                "babycorn",
                "springonion",
                "kale",
                "onion",
                "cucumber",
                "ginger",
                "galangal",
                "blockkerry",
                "coriander",
                "holybasil",
                "waterspinach",
                "egg",
                "shrimp",
                "porkmeat",
                "chickenbreast"};*/
        Toast.makeText(getApplicationContext(), "check before forloop", Toast.LENGTH_LONG).show();
        //int i = 1;
        //for(String fruit : fruits){
        //    Toast.makeText(getApplicationContext(), fruit, Toast.LENGTH_LONG).show();
        //    getStatus(fruit,i);
        //}
        getStatus(fruits[1],i);
        // ********** ติดบัคตรง for loop วนชื่อของผลไม้ โปรแกรมมันเด้ง
    }
    public void getStatus(final String To, final int index) {
        String way = "ingredient/"+To+"/status";
        FirebaseDatabase database = FirebaseDatabase.getInstance();
        DatabaseReference myRef = database.getReference(way);
        myRef.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                //TextView textView = (TextView) findViewById(R.id.box1);
                String Value = dataSnapshot.getValue(String.class);
                //textView.setText(Value);
                if(Value.equals("yes")) {
                    switch(index) {
                        case 1:
                            TextView textView1 = (TextView) findViewById(R.id.box1);
                            textView1.setText(To);
                            incIndex();
                            break;
                        case 2:
                            TextView textView3 = (TextView) findViewById(R.id.box3);
                            textView3.setText(To);
                            incIndex();
                            break;
                        case 3:
                            TextView textView4 = (TextView) findViewById(R.id.box4);
                            textView4.setText(To);
                            incIndex();
                            break;
                        default:
                            // code block
                    }
                }
                else return;
            }
            @Override
            public void onCancelled(DatabaseError error) {
                Toast.makeText(getApplicationContext(), "fail read date", Toast.LENGTH_LONG).show();
            }

        });
    }
    public void incIndex() {
        i = i + 1;
    }
}

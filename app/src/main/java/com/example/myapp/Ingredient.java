package com.example.myapp;

import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;
import android.widget.Toast;


import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

import java.util.concurrent.ThreadLocalRandom;


public class Ingredient extends AppCompatActivity {
    public int index = 1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.ingredient);
        Toast.makeText(getApplicationContext(), "read data", Toast.LENGTH_LONG).show();
        getStatus("lemongrass");
        getStatus("gralic");
        getStatus("tomato");
        getStatus("chinesecabbage");
        getStatus("cabbage");
        getStatus("chile");
        getStatus("kaffirlimeleaves");
        getStatus("yardlongbeans");
        getStatus("carrot");
        getStatus("lemon");
        getStatus("babycorn");
        getStatus("springonion");
        getStatus("kale");
        getStatus("onion");
        getStatus("cucumber");
        getStatus("ginger");
        getStatus("galangal");
        getStatus("blockkerry");
        getStatus("coriander");
        getStatus("holybasil");
        getStatus("waterspinach");
        getStatus("egg");
        getStatus("shrimp");
        getStatus("porkmeat");
        getStatus("chickenbreast");
        /*
        String fruits[] = new String[]{"garlic",
                "lemongrass",
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
                "chickenbreast"};
        for (String fruit : fruits){
            getStatus(fruit);
        }*/
    }
        /*String fruits[] = new String[]{"garlic",
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
                "chickenbreast"};

        //for (String fruit : fruits){
        //    Toast.makeText(getApplicationContext(), "in loop " + fruit +" - i is "+ i, Toast.LENGTH_LONG).show();
        getStatus("lemongrass");
        getStatus("gralic");
        getStatus("tomato");
        /*getStatus("chinesecabbage",i);
        getStatus("cabbage",i);
        getStatus("chile",i);
        getStatus("kaffirlimeleaves",i);
        getStatus("yardlongbeans",i);
        getStatus("carrot",i);
        getStatus("lemon",i);
        getStatus("babycorn",i);
        getStatus("springonion",i);
        getStatus("kale",i);
        getStatus("onion",i);
        getStatus("cucumber",i);
        getStatus("ginger",i);
        getStatus("galangal",i);
        getStatus("blockkerry",i);
        getStatus("coriander",i);
        getStatus("holybasil",i);
        getStatus("waterspinach",i);
        getStatus("egg",i);
        getStatus("shrimp",i);
        getStatus("porkmeat",i);
        getStatus("chickenbreast",i);*/





        //}
        /*FirebaseDatabase database = FirebaseDatabase.getInstance();
        DatabaseReference myRef = database.getReference("message");

        myRef.setValue("Hello, World!");*/
    public void getStatus(final String To) { // function is worked !!
        String way = "ingredient/"+To+"/status";
        Toast.makeText(getApplicationContext(), "path is " + way, Toast.LENGTH_LONG).show();
        FirebaseDatabase database = FirebaseDatabase.getInstance();
        DatabaseReference myRef = database.getReference(way);
        myRef.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                String Value = dataSnapshot.getValue(String.class);
                Toast.makeText(getApplicationContext(), "status is " + Value, Toast.LENGTH_LONG).show();
                if(Value.equals("yes")) {
                    switch(index) {
                        case 1:
                            TextView textView1 = (TextView) findViewById(R.id.box1);
                            textView1.setText(To);
                            incIndex();
                            Toast.makeText(getApplicationContext(), "1 index = "+ index, Toast.LENGTH_LONG).show();
                            break;
                        case 2:
                            TextView textView2 = (TextView) findViewById(R.id.box2);
                            textView2.setText(To);
                            incIndex();
                            Toast.makeText(getApplicationContext(), "2 index = "+ index, Toast.LENGTH_LONG).show();
                            break;
                        case 3:
                            TextView textView3 = (TextView) findViewById(R.id.box3);
                            textView3.setText(To);
                            Toast.makeText(getApplicationContext(), "3 index = "+ index, Toast.LENGTH_LONG).show();
                            incIndex();
                            break;
                        case 4:
                            TextView textView4 = (TextView) findViewById(R.id.box4);
                            textView4.setText(To);
                            incIndex();
                            Toast.makeText(getApplicationContext(), "4 index = "+ index, Toast.LENGTH_LONG).show();
                            break;
                        case 5:
                            TextView textView5 = (TextView) findViewById(R.id.box5);
                            textView5.setText(To);
                            incIndex();
                            Toast.makeText(getApplicationContext(), "5 index = "+ index, Toast.LENGTH_LONG).show();
                            break;
                        case 6:
                            TextView textView6 = (TextView) findViewById(R.id.box6);
                            textView6.setText(To);
                            Toast.makeText(getApplicationContext(), "6 index = "+ index, Toast.LENGTH_LONG).show();
                            incIndex();
                            break;
                        case 7:
                            TextView textView7 = (TextView) findViewById(R.id.box7);
                            textView7.setText(To);
                            Toast.makeText(getApplicationContext(), "7 index = "+ index, Toast.LENGTH_LONG).show();
                            incIndex();
                            break;
                        case 8:
                            TextView textView8 = (TextView) findViewById(R.id.box8);
                            textView8.setText(To);
                            incIndex();
                            Toast.makeText(getApplicationContext(), "8 index = "+ index, Toast.LENGTH_LONG).show();
                            break;
                        case 9:
                            TextView textView9 = (TextView) findViewById(R.id.box9);
                            textView9.setText(To);
                            incIndex();
                            Toast.makeText(getApplicationContext(), "9 index = "+ index, Toast.LENGTH_LONG).show();
                            break;
                        case 10:
                            TextView textView10 = (TextView) findViewById(R.id.box10);
                            textView10.setText(To);
                            Toast.makeText(getApplicationContext(), "10 index = "+ index, Toast.LENGTH_LONG).show();
                            incIndex();
                            break;
                        case 11:
                            TextView textView11 = (TextView) findViewById(R.id.box11);
                            textView11.setText(To);
                            Toast.makeText(getApplicationContext(), "11 index = "+ index, Toast.LENGTH_LONG).show();
                            incIndex();
                            break;
                        default:
                            // code block
                    }
                }
                else {
                    Toast.makeText(getApplicationContext(), "status is no", Toast.LENGTH_LONG).show();
                    return;
                }
            }
            @Override
            public void onCancelled(DatabaseError error) {
                Toast.makeText(getApplicationContext(), "fail read date", Toast.LENGTH_LONG).show();
            }

        });
    }
    public void incIndex() {
        index = index + 1;
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
        /*String fruits[] = new String[]{"garlic",
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
        //getStatus("garlic",i);

        // ********** ติดบัคตรง for loop วนชื่อของผลไม้ โปรแกรมมันเด้ง
    }


}

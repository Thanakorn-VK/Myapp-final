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
    }

    public void getStatus(final String To) { // function is worked !!
        String way = "ingredient/"+To+"/status";
        FirebaseDatabase database = FirebaseDatabase.getInstance();
        DatabaseReference myRef = database.getReference(way);
        myRef.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                String Value = dataSnapshot.getValue(String.class);
                if(Value.equals("yes")) {
                    switch(index) {
                        case 1:
                            TextView textView1 = (TextView) findViewById(R.id.box1);
                            textView1.setText(To);
                            incIndex();
                            break;
                        case 2:
                            TextView textView2 = (TextView) findViewById(R.id.box2);
                            textView2.setText(To);
                            incIndex();
                            break;
                        case 3:
                            TextView textView3 = (TextView) findViewById(R.id.box3);
                            textView3.setText(To);
                            incIndex();
                            break;
                        case 4:
                            TextView textView4 = (TextView) findViewById(R.id.box4);
                            textView4.setText(To);
                            incIndex();
                            break;
                        case 5:
                            TextView textView5 = (TextView) findViewById(R.id.box5);
                            textView5.setText(To);
                            incIndex();
                            break;
                        case 6:
                            TextView textView6 = (TextView) findViewById(R.id.box6);
                            textView6.setText(To);
                            incIndex();
                            break;
                        case 7:
                            TextView textView7 = (TextView) findViewById(R.id.box7);
                            textView7.setText(To);
                            incIndex();
                            break;
                        case 8:
                            TextView textView8 = (TextView) findViewById(R.id.box8);
                            textView8.setText(To);
                            incIndex();
                            break;
                        case 9:
                            TextView textView9 = (TextView) findViewById(R.id.box9);
                            textView9.setText(To);
                            incIndex();
                            break;
                        case 10:
                            TextView textView10 = (TextView) findViewById(R.id.box10);
                            textView10.setText(To);
                            incIndex();
                            break;
                        case 11:
                            TextView textView11 = (TextView) findViewById(R.id.box11);
                            textView11.setText(To);
                            incIndex();
                            break;
                        default:
                            // code block
                    }
                }
                else {
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

}

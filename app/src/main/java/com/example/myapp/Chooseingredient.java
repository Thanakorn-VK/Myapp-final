package com.example.myapp;


import android.os.Bundle;
import android.renderscript.Sampler;
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

public class Chooseingredient extends AppCompatActivity {
    final boolean state[] = {true,true,true,true,true,true,
                             true,true,true,true,true,true,
                             true,true,true,true,true,true,
                             true,true,true,true,true,true};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.chooseingredient);

        Button item1 = (Button) findViewById(R.id.button8);
        Button item2 = (Button) findViewById(R.id.button9);
        Button item3 = (Button) findViewById(R.id.button10);
        Button item4 = (Button) findViewById(R.id.button11);
        Button item5 = (Button) findViewById(R.id.button12);
        Button item6 = (Button) findViewById(R.id.button13);
        Button item7 = (Button) findViewById(R.id.button14);
        Button item8 = (Button) findViewById(R.id.button15);
        Button item9 = (Button) findViewById(R.id.button16);
        Button item10 = (Button) findViewById(R.id.button17);
        Button item11 = (Button) findViewById(R.id.button18);
        Button item12 = (Button) findViewById(R.id.button19);
        Button item13 = (Button) findViewById(R.id.button20);
        Button item14 = (Button) findViewById(R.id.button21);
        Button item15 = (Button) findViewById(R.id.button22);
        Button item16 = (Button) findViewById(R.id.button23);
        Button item17 = (Button) findViewById(R.id.button24);
        Button item18 = (Button) findViewById(R.id.button25);
        Button item19 = (Button) findViewById(R.id.button26);
        Button item20 = (Button) findViewById(R.id.button27);
        Button item21 = (Button) findViewById(R.id.button28);
        Button item22 = (Button) findViewById(R.id.button29);
        Button item23 = (Button) findViewById(R.id.button30);
        Button item24 = (Button) findViewById(R.id.button31);
        Button item25 = (Button) findViewById(R.id.button32);
        item1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FirebaseDatabase database = FirebaseDatabase.getInstance();
                DatabaseReference myRef = database.getReference("ingredientinput/garlic");
                if(state[0]){
                    myRef.setValue("yes");
                    changC(0);
                }
                else if(!(state[0])) {
                    myRef.setValue("no");
                    changC(0);
                }
            }
        });
        item2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FirebaseDatabase database = FirebaseDatabase.getInstance();
                DatabaseReference myRef = database.getReference("ingredientinput/holybasil");
                if(state[1]){
                    myRef.setValue("yes");
                    changC(1);
                }
                else if(!(state[1])) {
                    myRef.setValue("no");
                    changC(1);
                }
            }
        });
        item3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FirebaseDatabase database = FirebaseDatabase.getInstance();
                DatabaseReference myRef = database.getReference("ingredientinput/holybasil");
                if(state[2]){
                    myRef.setValue("yes");
                    changC(2);
                }
                else if(!(state[2])) {
                    myRef.setValue("no");
                    changC(2);
                }
            }
        });
        item4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                FirebaseDatabase database = FirebaseDatabase.getInstance();
                DatabaseReference myRef = database.getReference("ingredientinput/holybasil");
                if(state[2]){
                    myRef.setValue("yes");
                    changC(2);
                }
                else if(!(state[2])) {
                    myRef.setValue("no");
                    changC(2);
                }
            }
        });
        item4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                FirebaseDatabase database = FirebaseDatabase.getInstance();
                DatabaseReference myRef = database.getReference("ingredientinput/holybasil");
                if(state[2]){
                    myRef.setValue("yes");
                    changC(2);
                }
                else if(!(state[2])) {
                    myRef.setValue("no");
                    changC(2);
                }
            }
        });
        item4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                FirebaseDatabase database = FirebaseDatabase.getInstance();
                DatabaseReference myRef = database.getReference("ingredientinput/holybasil");
                if(state[2]){
                    myRef.setValue("yes");
                    changC(2);
                }
                else if(!(state[2])) {
                    myRef.setValue("no");
                    changC(2);
                }
            }
        });
        item4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                FirebaseDatabase database = FirebaseDatabase.getInstance();
                DatabaseReference myRef = database.getReference("ingredientinput/holybasil");
                if(state[2]){
                    myRef.setValue("yes");
                    changC(2);
                }
                else if(!(state[2])) {
                    myRef.setValue("no");
                    changC(2);
                }
            }
        });
        item4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                FirebaseDatabase database = FirebaseDatabase.getInstance();
                DatabaseReference myRef = database.getReference("ingredientinput/holybasil");
                if(state[2]){
                    myRef.setValue("yes");
                    changC(2);
                }
                else if(!(state[2])) {
                    myRef.setValue("no");
                    changC(2);
                }
            }
        });
        item4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                FirebaseDatabase database = FirebaseDatabase.getInstance();
                DatabaseReference myRef = database.getReference("ingredientinput/holybasil");
                if(state[2]){
                    myRef.setValue("yes");
                    changC(2);
                }
                else if(!(state[2])) {
                    myRef.setValue("no");
                    changC(2);
                }
            }
        });
        item4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                FirebaseDatabase database = FirebaseDatabase.getInstance();
                DatabaseReference myRef = database.getReference("ingredientinput/holybasil");
                if(state[2]){
                    myRef.setValue("yes");
                    changC(2);
                }
                else if(!(state[2])) {
                    myRef.setValue("no");
                    changC(2);
                }
            }
        });
        item4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                FirebaseDatabase database = FirebaseDatabase.getInstance();
                DatabaseReference myRef = database.getReference("ingredientinput/holybasil");
                if(state[2]){
                    myRef.setValue("yes");
                    changC(2);
                }
                else if(!(state[2])) {
                    myRef.setValue("no");
                    changC(2);
                }
            }
        });
        item4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                FirebaseDatabase database = FirebaseDatabase.getInstance();
                DatabaseReference myRef = database.getReference("ingredientinput/holybasil");
                if(state[2]){
                    myRef.setValue("yes");
                    changC(2);
                }
                else if(!(state[2])) {
                    myRef.setValue("no");
                    changC(2);
                }
            }
        });
        item4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                FirebaseDatabase database = FirebaseDatabase.getInstance();
                DatabaseReference myRef = database.getReference("ingredientinput/holybasil");
                if(state[2]){
                    myRef.setValue("yes");
                    changC(2);
                }
                else if(!(state[2])) {
                    myRef.setValue("no");
                    changC(2);
                }
            }
        });
        item4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                FirebaseDatabase database = FirebaseDatabase.getInstance();
                DatabaseReference myRef = database.getReference("ingredientinput/holybasil");
                if(state[2]){
                    myRef.setValue("yes");
                    changC(2);
                }
                else if(!(state[2])) {
                    myRef.setValue("no");
                    changC(2);
                }
            }
        });
        item4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                FirebaseDatabase database = FirebaseDatabase.getInstance();
                DatabaseReference myRef = database.getReference("ingredientinput/holybasil");
                if(state[2]){
                    myRef.setValue("yes");
                    changC(2);
                }
                else if(!(state[2])) {
                    myRef.setValue("no");
                    changC(2);
                }
            }
        });
        item4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                FirebaseDatabase database = FirebaseDatabase.getInstance();
                DatabaseReference myRef = database.getReference("ingredientinput/holybasil");
                if(state[2]){
                    myRef.setValue("yes");
                    changC(2);
                }
                else if(!(state[2])) {
                    myRef.setValue("no");
                    changC(2);
                }
            }
        });
        item4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                FirebaseDatabase database = FirebaseDatabase.getInstance();
                DatabaseReference myRef = database.getReference("ingredientinput/holybasil");
                if(state[2]){
                    myRef.setValue("yes");
                    changC(2);
                }
                else if(!(state[2])) {
                    myRef.setValue("no");
                    changC(2);
                }
            }
        });
        item4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                FirebaseDatabase database = FirebaseDatabase.getInstance();
                DatabaseReference myRef = database.getReference("ingredientinput/holybasil");
                if(state[2]){
                    myRef.setValue("yes");
                    changC(2);
                }
                else if(!(state[2])) {
                    myRef.setValue("no");
                    changC(2);
                }
            }
        });
        item4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                FirebaseDatabase database = FirebaseDatabase.getInstance();
                DatabaseReference myRef = database.getReference("ingredientinput/holybasil");
                if(state[2]){
                    myRef.setValue("yes");
                    changC(2);
                }
                else if(!(state[2])) {
                    myRef.setValue("no");
                    changC(2);
                }
            }
        });
        item4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                FirebaseDatabase database = FirebaseDatabase.getInstance();
                DatabaseReference myRef = database.getReference("ingredientinput/holybasil");
                if(state[2]){
                    myRef.setValue("yes");
                    changC(2);
                }
                else if(!(state[2])) {
                    myRef.setValue("no");
                    changC(2);
                }
            }
        });
        item4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                FirebaseDatabase database = FirebaseDatabase.getInstance();
                DatabaseReference myRef = database.getReference("ingredientinput/holybasil");
                if(state[2]){
                    myRef.setValue("yes");
                    changC(2);
                }
                else if(!(state[2])) {
                    myRef.setValue("no");
                    changC(2);
                }
            }
        });
        item4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                FirebaseDatabase database = FirebaseDatabase.getInstance();
                DatabaseReference myRef = database.getReference("ingredientinput/holybasil");
                if(state[2]){
                    myRef.setValue("yes");
                    changC(2);
                }
                else if(!(state[2])) {
                    myRef.setValue("no");
                    changC(2);
                }
            }
        });
        item4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                FirebaseDatabase database = FirebaseDatabase.getInstance();
                DatabaseReference myRef = database.getReference("ingredientinput/holybasil");
                if(state[2]){
                    myRef.setValue("yes");
                    changC(2);
                }
                else if(!(state[2])) {
                    myRef.setValue("no");
                    changC(2);
                }
            }
        });
        item4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                FirebaseDatabase database = FirebaseDatabase.getInstance();
                DatabaseReference myRef = database.getReference("ingredientinput/holybasil");
                if(state[2]){
                    myRef.setValue("yes");
                    changC(2);
                }
                else if(!(state[2])) {
                    myRef.setValue("no");
                    changC(2);
                }
            }
        });
        item4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                FirebaseDatabase database = FirebaseDatabase.getInstance();
                DatabaseReference myRef = database.getReference("ingredientinput/holybasil");
                if(state[2]){
                    myRef.setValue("yes");
                    changC(2);
                }
                else if(!(state[2])) {
                    myRef.setValue("no");
                    changC(2);
                }
            }
        });

    }
    public void changC(int index){
        state[index] = !(state[index]);
    }
}

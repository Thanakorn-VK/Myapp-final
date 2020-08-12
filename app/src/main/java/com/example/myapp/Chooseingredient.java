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

        Button item1 = (Button) findViewById(R.id.buttongarlic);
        Button item2 = (Button) findViewById(R.id.buttoncabbage);
        Button item3 = (Button) findViewById(R.id.buttonginger);
        Button item4 = (Button) findViewById(R.id.buttongalangal);
        Button item5 = (Button) findViewById(R.id.buttonbabycorn);
        Button item6 = (Button) findViewById(R.id.buttonkale);
        Button item7 = (Button) findViewById(R.id.buttoncarrot);
        Button item8 = (Button) findViewById(R.id.buttonspringonion);
        Button item9 = (Button) findViewById(R.id.buttonlemongrass);
        Button item10 = (Button) findViewById(R.id.buttonyardlongbeans);
        Button item11 = (Button) findViewById(R.id.buttoncucumber);
        Button item12 = (Button) findViewById(R.id.buttonblockkerry);
        Button item13 = (Button) findViewById(R.id.buttonkaffirlimeleaves);
        Button item14 = (Button) findViewById(R.id.buttonholybasil);
        Button item15 = (Button) findViewById(R.id.buttonchinesecabbage);
        Button item16 = (Button) findViewById(R.id.buttoncoriander);
        Button item17 = (Button) findViewById(R.id.buttonwaterspinach);
        Button item18 = (Button) findViewById(R.id.buttonchile);
        Button item19 = (Button) findViewById(R.id.buttontomato);
        Button item20 = (Button) findViewById(R.id.buttonlemon);
        Button item21 = (Button) findViewById(R.id.buttononion);
        Button item22 = (Button) findViewById(R.id.buttonshrimp);
        Button item23 = (Button) findViewById(R.id.buttonegg);
        Button item24 = (Button) findViewById(R.id.buttonchickenbreast);
        Button item25 = (Button) findViewById(R.id.buttonporkmeat);
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
                DatabaseReference myRef = database.getReference("ingredientinput/cabbage");
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
                DatabaseReference myRef = database.getReference("ingredientinput/ginger");
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
                DatabaseReference myRef = database.getReference("ingredientinput/galangal");
                if(state[3]){
                    myRef.setValue("yes");
                    changC(3);
                }
                else if(!(state[3])) {
                    myRef.setValue("no");
                    changC(3);
                }
            }
        });
        item5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                FirebaseDatabase database = FirebaseDatabase.getInstance();
                DatabaseReference myRef = database.getReference("ingredientinput/babycorn");
                if(state[4]){
                    myRef.setValue("yes");
                    changC(4);
                }
                else if(!(state[4])) {
                    myRef.setValue("no");
                    changC(4);
                }
            }
        });
        item6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                FirebaseDatabase database = FirebaseDatabase.getInstance();
                DatabaseReference myRef = database.getReference("ingredientinput/kale");
                if(state[5]){
                    myRef.setValue("yes");
                    changC(5);
                }
                else if(!(state[5])) {
                    myRef.setValue("no");
                    changC(5);
                }
            }
        });
        item7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                FirebaseDatabase database = FirebaseDatabase.getInstance();
                DatabaseReference myRef = database.getReference("ingredientinput/carrot");
                if(state[6]){
                    myRef.setValue("yes");
                    changC(6);
                }
                else if(!(state[6])) {
                    myRef.setValue("no");
                    changC(6);
                }
            }
        });
        item8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                FirebaseDatabase database = FirebaseDatabase.getInstance();
                DatabaseReference myRef = database.getReference("ingredientinput/springonion");
                if(state[7]){
                    myRef.setValue("yes");
                    changC(7);
                }
                else if(!(state[2])) {
                    myRef.setValue("no");
                    changC(7);
                }
            }
        });
        item9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                FirebaseDatabase database = FirebaseDatabase.getInstance();
                DatabaseReference myRef = database.getReference("ingredientinput/lemongrass");
                if(state[7]){
                    myRef.setValue("yes");
                    changC(7);
                }
                else if(!(state[7])) {
                    myRef.setValue("no");
                    changC(7);
                }
            }
        });
        item10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                FirebaseDatabase database = FirebaseDatabase.getInstance();
                DatabaseReference myRef = database.getReference("ingredientinput/yardlongbeans");
                if(state[8]){
                    myRef.setValue("yes");
                    changC(8);
                }
                else if(!(state[8])) {
                    myRef.setValue("no");
                    changC(8);
                }
            }
        });
        item11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                FirebaseDatabase database = FirebaseDatabase.getInstance();
                DatabaseReference myRef = database.getReference("ingredientinput/cucumber");
                if(state[9]){
                    myRef.setValue("yes");
                    changC(9);
                }
                else if(!(state[9])) {
                    myRef.setValue("no");
                    changC(9);
                }
            }
        });
        item12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                FirebaseDatabase database = FirebaseDatabase.getInstance();
                DatabaseReference myRef = database.getReference("ingredientinput/blockkerry");
                if(state[10]){
                    myRef.setValue("yes");
                    changC(10);
                }
                else if(!(state[10])) {
                    myRef.setValue("no");
                    changC(10);
                }
            }
        });
        item13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                FirebaseDatabase database = FirebaseDatabase.getInstance();
                DatabaseReference myRef = database.getReference("ingredientinput/kaffirlimeleaves");
                if(state[11]){
                    myRef.setValue("yes");
                    changC(11);
                }
                else if(!(state[11])) {
                    myRef.setValue("no");
                    changC(11);
                }
            }
        });
        item14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                FirebaseDatabase database = FirebaseDatabase.getInstance();
                DatabaseReference myRef = database.getReference("ingredientinput/holybasil");
                if(state[212]){
                    myRef.setValue("yes");
                    changC(12);
                }
                else if(!(state[12])) {
                    myRef.setValue("no");
                    changC(12);
                }
            }
        });
        item15.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                FirebaseDatabase database = FirebaseDatabase.getInstance();
                DatabaseReference myRef = database.getReference("ingredientinput/chinesecabbage");
                if(state[13]){
                    myRef.setValue("yes");
                    changC(13);
                }
                else if(!(state[13])) {
                    myRef.setValue("no");
                    changC(13);
                }
            }
        });
        item16.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                FirebaseDatabase database = FirebaseDatabase.getInstance();
                DatabaseReference myRef = database.getReference("ingredientinput/coriander");
                if(state[14]){
                    myRef.setValue("yes");
                    changC(14);
                }
                else if(!(state[14])) {
                    myRef.setValue("no");
                    changC(14);
                }
            }
        });
        item17.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                FirebaseDatabase database = FirebaseDatabase.getInstance();
                DatabaseReference myRef = database.getReference("ingredientinput/waterspinach");
                if(state[15]){
                    myRef.setValue("yes");
                    changC(15);
                }
                else if(!(state[15])) {
                    myRef.setValue("no");
                    changC(15);
                }
            }
        });
        item18.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                FirebaseDatabase database = FirebaseDatabase.getInstance();
                DatabaseReference myRef = database.getReference("ingredientinput/chile");
                if(state[16]){
                    myRef.setValue("yes");
                    changC(16);
                }
                else if(!(state[16])) {
                    myRef.setValue("no");
                    changC(16);
                }
            }
        });
        item19.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                FirebaseDatabase database = FirebaseDatabase.getInstance();
                DatabaseReference myRef = database.getReference("ingredientinput/holybasil");
                if(state[17]){
                    myRef.setValue("yes");
                    changC(17);
                }
                else if(!(state[17])) {
                    myRef.setValue("no");
                    changC(17);
                }
            }
        });
        item20.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                FirebaseDatabase database = FirebaseDatabase.getInstance();
                DatabaseReference myRef = database.getReference("ingredientinput/tomato");
                if(state[18]){
                    myRef.setValue("yes");
                    changC(18);
                }
                else if(!(state[18])) {
                    myRef.setValue("no");
                    changC(18);
                }
            }
        });
        item21.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                FirebaseDatabase database = FirebaseDatabase.getInstance();
                DatabaseReference myRef = database.getReference("ingredientinput/onion");
                if(state[19]){
                    myRef.setValue("yes");
                    changC(19);
                }
                else if(!(state[19])) {
                    myRef.setValue("no");
                    changC(19);
                }
            }
        });
        item22.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                FirebaseDatabase database = FirebaseDatabase.getInstance();
                DatabaseReference myRef = database.getReference("ingredientinput/shrimp");
                if(state[20]){
                    myRef.setValue("yes");
                    changC(20);
                }
                else if(!(state[20])) {
                    myRef.setValue("no");
                    changC(20);
                }
            }
        });
        item23.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                FirebaseDatabase database = FirebaseDatabase.getInstance();
                DatabaseReference myRef = database.getReference("ingredientinput/egg");
                if(state[21]){
                    myRef.setValue("yes");
                    changC(21);
                }
                else if(!(state[21])) {
                    myRef.setValue("no");
                    changC(21);
                }
            }
        });
        item24.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                FirebaseDatabase database = FirebaseDatabase.getInstance();
                DatabaseReference myRef = database.getReference("ingredientinput/chickenbreast");
                if(state[22]){
                    myRef.setValue("yes");
                    changC(22);
                }
                else if(!(state[22])) {
                    myRef.setValue("no");
                    changC(22);
                }
            }
        });
        item25.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                FirebaseDatabase database = FirebaseDatabase.getInstance();
                DatabaseReference myRef = database.getReference("ingredientinput/porkmeat");
                if(state[23]){
                    myRef.setValue("yes");
                    changC(23);
                }
                else if(!(state[23])) {
                    myRef.setValue("no");
                    changC(23);
                }
            }
        });

    }
    public void changC(int index){
        state[index] = !(state[index]);
    }
}

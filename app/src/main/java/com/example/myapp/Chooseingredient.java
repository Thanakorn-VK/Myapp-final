package com.example.myapp;


import android.content.Intent;
import android.os.Bundle;
import android.renderscript.Sampler;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

import static com.example.myapp.R.drawable.press;

public class Chooseingredient extends AppCompatActivity {
    final boolean state[] = {true,true,true,true,true,true,
                             true,true,true,true,true,true,
                             true,true,true,true,true,true,
                             true,true,true,true,true,true,true};
    boolean state0 = true;
    boolean state1 = true;
    boolean state2 = true;


    boolean statebutton[] = {true,true}; //false โดนกด
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.chooseingredient);
        Button buttonShowmanu = (Button) findViewById(R.id.cooking);
        buttonShowmanu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {




                Intent i = new Intent(getApplicationContext(), popup_priority.class);
                startActivity(i);
            }
        });

        initialStatus();

        LinearLayout buttonrec0 = (LinearLayout)findViewById(R.id.ltoh);
        buttonrec0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(statebutton[0]) {
                    LinearLayout linearLayout = (LinearLayout)findViewById(R.id.ltoh);
                    linearLayout.setBackgroundResource(R.drawable.press);
                    statebutton[0] = false;
                    statebutton[1] = true;
                    if(statebutton[1]) {
                        LinearLayout linearLayout2 = (LinearLayout)findViewById(R.id.htol);
                        linearLayout2.setBackgroundResource(R.drawable.notpress);
                    }
                }

            }
        });
        LinearLayout buttonrec1 = (LinearLayout)findViewById(R.id.htol);
        buttonrec1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(statebutton[1]) {
                    LinearLayout linearLayout = (LinearLayout)findViewById(R.id.htol);
                    linearLayout.setBackgroundResource(R.drawable.press);
                    statebutton[1] = false;
                    statebutton[0] = true;
                    if(statebutton[0]) {
                        LinearLayout linearLayout2 = (LinearLayout)findViewById(R.id.ltoh);
                        linearLayout2.setBackgroundResource(R.drawable.notpress);
                    }
                }
            }
        });

        LinearLayout menu0 = (LinearLayout)findViewById(R.id.buttonpage0);
        menu0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(state0) setBoxvisibilityGone0();
                else setBoxvisibility0();
            }
        });
        LinearLayout menu1 = (LinearLayout)findViewById(R.id.buttonpage1);
        menu1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(state1) setBoxvisibilityGone1();
                else setBoxvisibility1();
            }
        });
        LinearLayout menu2 = (LinearLayout)findViewById(R.id.buttonpage2);
        menu2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(state2) setBoxvisibilityGone2();
                else setBoxvisibility2();
            }
        });
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
                    myRef.setValue("true");
                    changC(0);
                }
                else if(!(state[0])) {
                    myRef.setValue("false");
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
                    myRef.setValue("true");
                    changC(1);
                }
                else if(!(state[1])) {
                    myRef.setValue("false");
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
                    myRef.setValue("true");
                    changC(2);
                }
                else if(!(state[2])) {
                    myRef.setValue("false");
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
                    myRef.setValue("true");
                    changC(3);
                }
                else if(!(state[3])) {
                    myRef.setValue("false");
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
                    myRef.setValue("true");
                    changC(4);
                }
                else if(!(state[4])) {
                    myRef.setValue("false");
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
                    myRef.setValue("true");
                    changC(5);
                }
                else if(!(state[5])) {
                    myRef.setValue("false");
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
                    myRef.setValue("true");
                    changC(6);
                }
                else if(!(state[6])) {
                    myRef.setValue("false");
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
                    myRef.setValue("true");
                    changC(7);
                }
                else if(!(state[7])) {
                    myRef.setValue("false");
                    changC(7);
                }
            }
        });
        item9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                FirebaseDatabase database = FirebaseDatabase.getInstance();
                DatabaseReference myRef = database.getReference("ingredientinput/lemongrass");
                if(state[8]){
                    myRef.setValue("true");
                    changC(8);
                }
                else if(!(state[8])) {
                    myRef.setValue("false");
                    changC(8);
                }
            }
        });
        item10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                FirebaseDatabase database = FirebaseDatabase.getInstance();
                DatabaseReference myRef = database.getReference("ingredientinput/yardlongbeans");
                if(state[9]){
                    myRef.setValue("true");
                    changC(9);
                }
                else if(!(state[9])) {
                    myRef.setValue("false");
                    changC(9);
                }
            }
        });
        item11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                FirebaseDatabase database = FirebaseDatabase.getInstance();
                DatabaseReference myRef = database.getReference("ingredientinput/cucumber");
                if(state[10]){
                    myRef.setValue("true");
                    changC(10);
                }
                else if(!(state[10])) {
                    myRef.setValue("false");
                    changC(10);
                }
            }
        });
        item12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                FirebaseDatabase database = FirebaseDatabase.getInstance();
                DatabaseReference myRef = database.getReference("ingredientinput/blockkerry");
                if(state[11]){
                    myRef.setValue("true");
                    changC(11);
                }
                else if(!(state[11])) {
                    myRef.setValue("false");
                    changC(11);
                }
            }
        });
        item13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                FirebaseDatabase database = FirebaseDatabase.getInstance();
                DatabaseReference myRef = database.getReference("ingredientinput/kaffirlimeleaves");
                if(state[12]){
                    myRef.setValue("true");
                    changC(12);
                }
                else if(!(state[12])) {
                    myRef.setValue("false");
                    changC(12);
                }
            }
        });
        item14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                FirebaseDatabase database = FirebaseDatabase.getInstance();
                DatabaseReference myRef = database.getReference("ingredientinput/holybasil");
                if(state[13]){
                    myRef.setValue("true");
                    changC(13);
                }
                else if(!(state[13])) {
                    myRef.setValue("false");
                    changC(13);
                }
            }
        });
        item15.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                FirebaseDatabase database = FirebaseDatabase.getInstance();
                DatabaseReference myRef = database.getReference("ingredientinput/chinesecabbage");
                if(state[14]){
                    myRef.setValue("true");
                    changC(14);
                }
                else if(!(state[14])) {
                    myRef.setValue("false");
                    changC(14);
                }
            }
        });
        item16.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                FirebaseDatabase database = FirebaseDatabase.getInstance();
                DatabaseReference myRef = database.getReference("ingredientinput/coriander");
                if(state[15]){
                    myRef.setValue("true");
                    changC(15);
                }
                else if(!(state[15])) {
                    myRef.setValue("false");
                    changC(15);
                }
            }
        });
        item17.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                FirebaseDatabase database = FirebaseDatabase.getInstance();
                DatabaseReference myRef = database.getReference("ingredientinput/waterspinach");
                if(state[16]){
                    myRef.setValue("true");
                    changC(16);
                }
                else if(!(state[16])) {
                    myRef.setValue("false");
                    changC(16);
                }
            }
        });
        item18.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                FirebaseDatabase database = FirebaseDatabase.getInstance();
                DatabaseReference myRef = database.getReference("ingredientinput/chile");
                if(state[17]){
                    myRef.setValue("true");
                    changC(17);
                }
                else if(!(state[17])) {
                    myRef.setValue("false");
                    changC(17);
                }
            }
        });
        item19.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                FirebaseDatabase database = FirebaseDatabase.getInstance();
                DatabaseReference myRef = database.getReference("ingredientinput/tomato");
                if(state[18]){
                    myRef.setValue("true");
                    changC(18);
                }
                else if(!(state[18])) {
                    myRef.setValue("false");
                    changC(18);
                }
            }
        });
        item20.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                FirebaseDatabase database = FirebaseDatabase.getInstance();
                DatabaseReference myRef = database.getReference("ingredientinput/lemon");
                if(state[19]){
                    myRef.setValue("true");
                    changC(19);
                }
                else if(!(state[19])) {
                    myRef.setValue("false");
                    changC(19);
                }
            }
        });
        item21.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                FirebaseDatabase database = FirebaseDatabase.getInstance();
                DatabaseReference myRef = database.getReference("ingredientinput/onion");
                if(state[20]){
                    myRef.setValue("true");
                    changC(20);
                }
                else if(!(state[20])) {
                    myRef.setValue("false");
                    changC(20);
                }
            }
        });
        item22.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                FirebaseDatabase database = FirebaseDatabase.getInstance();
                DatabaseReference myRef = database.getReference("ingredientinput/shrimp");
                if(state[21]){
                    myRef.setValue("true");
                    changC(21);
                }
                else if(!(state[21])) {
                    myRef.setValue("false");
                    changC(21);
                }
            }
        });
        item23.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                FirebaseDatabase database = FirebaseDatabase.getInstance();
                DatabaseReference myRef = database.getReference("ingredientinput/egg");
                if(state[22]){
                    myRef.setValue("true");
                    changC(22);
                }
                else if(!(state[22])) {
                    myRef.setValue("false");
                    changC(22);
                }
            }
        });
        item24.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                FirebaseDatabase database = FirebaseDatabase.getInstance();
                DatabaseReference myRef = database.getReference("ingredientinput/chickenbreast");
                if(state[23]){
                    myRef.setValue("true");
                    changC(23);
                }
                else if(!(state[23])) {
                    myRef.setValue("false");
                    changC(23);
                }
            }
        });
        item25.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                FirebaseDatabase database = FirebaseDatabase.getInstance();
                DatabaseReference myRef = database.getReference("ingredientinput/porkmeat");
                if(state[24]){
                    myRef.setValue("true");
                    changC(24);
                }
                else if(!(state[24])) {
                    myRef.setValue("false");
                    changC(24);
                }
            }
        });

    }
    public void setBoxvisibilityGone0(){
        LinearLayout linearlayout = (LinearLayout) findViewById(R.id.page0);
        linearlayout.setVisibility(View.GONE);
        state0 = false;
    }
    public void setBoxvisibilityGone1(){
        LinearLayout linearlayout = (LinearLayout) findViewById(R.id.page1);
        linearlayout.setVisibility(View.GONE);
        state1 = false;
    }
    public void setBoxvisibilityGone2(){
        LinearLayout linearlayout = (LinearLayout) findViewById(R.id.page2);
        linearlayout.setVisibility(View.GONE);
        state2 = false;
    }
    public void setBoxvisibility0(){
        LinearLayout linearlayout = (LinearLayout) findViewById(R.id.page0);
        linearlayout.setVisibility(View.VISIBLE);
        state0 = true;
    }
    public void setBoxvisibility1(){
        LinearLayout linearlayout = (LinearLayout) findViewById(R.id.page1);
        linearlayout.setVisibility(View.VISIBLE);
        state1 = true;
    }
    public void setBoxvisibility2(){
        LinearLayout linearlayout = (LinearLayout) findViewById(R.id.page2);
        linearlayout.setVisibility(View.VISIBLE);
        state2 = true;
    }
    public void changC(int index){
        state[index] = !(state[index]);
    }
    public void setStatus(String name){
        String way = "ingredientinput/" + name;
        FirebaseDatabase database = FirebaseDatabase.getInstance();
        DatabaseReference myRef = database.getReference(way);
        myRef.setValue("false"); // แก้ตรงนี้
    }
    public void setStatusTrue(String name){
        String way = "ingredientinput/" + name;
        FirebaseDatabase database = FirebaseDatabase.getInstance();
        DatabaseReference myRef = database.getReference(way);
        myRef.setValue("true"); // แก้ตรงนี้
    }
    public void initialStatus(){
        String fruits[] = {"garlic",
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
            setStatus(fruit);
        }
    }

}


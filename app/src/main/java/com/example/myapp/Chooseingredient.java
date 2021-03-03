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

    String[] arringredient;

    boolean statebutton[] = {true,true}; //false โดนกด
    public void getData(){
        FirebaseDatabase database = FirebaseDatabase.getInstance();
        DatabaseReference myRef = database.getReference("setBT");
        myRef.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
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


                Button buttongarlic2 = (Button) findViewById(R.id.buttongarlic2);
                Button buttoncabbage2 = (Button) findViewById(R.id.buttoncabbage2);
                Button buttonginger2 = (Button) findViewById(R.id.buttonginger2);
                Button buttongalangal2 = (Button) findViewById(R.id.buttongalangal2);
                Button buttonbabycorn2 = (Button) findViewById(R.id.buttonbabycorn2);
                Button buttonkale2 = (Button) findViewById(R.id.buttonkale2);
                Button buttoncarrot2 = (Button) findViewById(R.id.buttoncarrot2);
                Button buttonspringonion2 = (Button) findViewById(R.id.buttonspringonion2);
                Button buttonlemongrass2 = (Button) findViewById(R.id.buttonlemongrass2);
                Button buttonyardlongbeans2 = (Button) findViewById(R.id.buttonyardlongbeans2);
                Button buttoncucumber2 = (Button) findViewById(R.id.buttoncucumber2);
                Button buttonblockkerry2 = (Button) findViewById(R.id.buttonblockkerry2);
                Button buttonkaffirlimeleaves2 = (Button) findViewById(R.id.buttonkaffirlimeleaves2);
                Button buttonholybasil2 = (Button) findViewById(R.id.buttonholybasil2);
                Button buttonchinesecabbage2 = (Button) findViewById(R.id.buttonchinesecabbage2);
                Button buttoncoriander2 = (Button) findViewById(R.id.buttoncoriander2);
                Button buttonwaterspinach2 = (Button) findViewById(R.id.buttonwaterspinach2);
                Button buttonchile2 = (Button) findViewById(R.id.buttonchile2);
                Button buttontomato2 = (Button) findViewById(R.id.buttontomato2);
                Button buttonlemon2 = (Button) findViewById(R.id.buttonlemon2);
                Button buttononion2 = (Button) findViewById(R.id.buttononion2);
                Button buttonshrimp2 = (Button) findViewById(R.id.buttonshrimp2);
                Button buttonegg2 = (Button) findViewById(R.id.buttonegg2);
                Button buttonchickenbreast2 = (Button) findViewById(R.id.buttonchickenbreast2);
                Button buttonporkmeat2 = (Button) findViewById(R.id.buttonporkmeat2);
                String Value = dataSnapshot.getValue(String.class);
                arringredient = Value.split("/");
                for(int index = 0 ; index < arringredient.length ; index++){
                    switch(arringredient[index])
                    {
                        case "garlic":
                            buttongarlic2.setVisibility(View.VISIBLE);
                            item1.setVisibility(View.GONE);
                            break;
                        case "lemongrass":
                            buttonlemongrass2.setVisibility(View.VISIBLE);
                            item9.setVisibility(View.GONE);
                            break;
                        case "tomato":
                            buttontomato2.setVisibility(View.VISIBLE);
                            item19.setVisibility(View.GONE);
                            break;
                        case "chinesecabbage":
                            buttonchinesecabbage2.setVisibility(View.VISIBLE);
                            item15.setVisibility(View.GONE);
                            break;
                        case "cabbage":
                            buttoncabbage2.setVisibility(View.VISIBLE);
                            item2.setVisibility(View.GONE);
                            break;
                        case "chile":
                            buttonchile2.setVisibility(View.VISIBLE);
                            item18.setVisibility(View.GONE);
                            break;
                        case "kaffirlimeleaves":
                            buttonkaffirlimeleaves2.setVisibility(View.VISIBLE);
                            item13.setVisibility(View.GONE);
                            break;
                        case "yardlongbeans":
                            buttonyardlongbeans2.setVisibility(View.VISIBLE);
                            item10.setVisibility(View.GONE);
                            break;
                        case "carrot":
                            buttoncarrot2.setVisibility(View.VISIBLE);
                            item7.setVisibility(View.GONE);
                            break;
                        case "lemon":
                            buttonlemon2.setVisibility(View.VISIBLE);
                            item20.setVisibility(View.GONE);
                            break;
                        case "babycorn":
                            buttonbabycorn2.setVisibility(View.VISIBLE);
                            item5.setVisibility(View.GONE);
                            break;
                        case "springonion":
                            buttonspringonion2.setVisibility(View.VISIBLE);
                            item8.setVisibility(View.GONE);
                            break;
                        case "kale":
                            buttonkale2.setVisibility(View.VISIBLE);
                            item6.setVisibility(View.GONE);
                            break;
                        case "onion":
                            buttononion2.setVisibility(View.VISIBLE);
                            item21.setVisibility(View.GONE);
                            break;
                        case "cucumber":
                            buttoncucumber2.setVisibility(View.VISIBLE);
                            item11.setVisibility(View.GONE);
                            break;
                        case "ginger":
                            buttonginger2.setVisibility(View.VISIBLE);
                            item3.setVisibility(View.GONE);
                            break;
                        case "galangal":
                            buttongalangal2.setVisibility(View.VISIBLE);
                            item4.setVisibility(View.GONE);
                            break;
                        case "broccoli":
                            buttonblockkerry2.setVisibility(View.VISIBLE);
                            item12.setVisibility(View.GONE);
                            break;
                        case "coriander":
                            buttoncoriander2.setVisibility(View.VISIBLE);
                            item16.setVisibility(View.GONE);
                            break;
                        case "holybasil":
                            buttonholybasil2.setVisibility(View.VISIBLE);
                            item14.setVisibility(View.GONE);
                            break;
                        case "waterspinach":
                            buttonwaterspinach2.setVisibility(View.VISIBLE);
                            item17.setVisibility(View.GONE);
                            break;
                        case "egg":
                            buttonegg2.setVisibility(View.VISIBLE);
                            item23.setVisibility(View.GONE);
                            break;
                        case "shrimp":
                            buttonshrimp2.setVisibility(View.VISIBLE);
                            item22.setVisibility(View.GONE);
                            break;
                        case "porkmeat":
                            buttonporkmeat2.setVisibility(View.VISIBLE);
                            item25.setVisibility(View.GONE);
                            break;
                        case "chickenbreast":
                            buttonchickenbreast2.setVisibility(View.VISIBLE);
                            item24.setVisibility(View.GONE);
                        default:
                            break;
                    }
                }
            }
            @Override
            public void onCancelled(DatabaseError error) {
                Toast.makeText(getApplicationContext(), "fail read date", Toast.LENGTH_LONG).show();
            }
        });
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.chooseingredient);
        getData();

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


        Button buttongarlic2 = (Button) findViewById(R.id.buttongarlic2);
        Button buttoncabbage2 = (Button) findViewById(R.id.buttoncabbage2);
        Button buttonginger2 = (Button) findViewById(R.id.buttonginger2);
        Button buttongalangal2 = (Button) findViewById(R.id.buttongalangal2);
        Button buttonbabycorn2 = (Button) findViewById(R.id.buttonbabycorn2);
        Button buttonkale2 = (Button) findViewById(R.id.buttonkale2);
        Button buttoncarrot2 = (Button) findViewById(R.id.buttoncarrot2);
        Button buttonspringonion2 = (Button) findViewById(R.id.buttonspringonion2);
        Button buttonlemongrass2 = (Button) findViewById(R.id.buttonlemongrass2);
        Button buttonyardlongbeans2 = (Button) findViewById(R.id.buttonyardlongbeans2);
        Button buttoncucumber2 = (Button) findViewById(R.id.buttoncucumber2);
        Button buttonblockkerry2 = (Button) findViewById(R.id.buttonblockkerry2);
        Button buttonkaffirlimeleaves2 = (Button) findViewById(R.id.buttonkaffirlimeleaves2);
        Button buttonholybasil2 = (Button) findViewById(R.id.buttonholybasil2);
        Button buttonchinesecabbage2 = (Button) findViewById(R.id.buttonchinesecabbage2);
        Button buttoncoriander2 = (Button) findViewById(R.id.buttoncoriander2);
        Button buttonwaterspinach2 = (Button) findViewById(R.id.buttonwaterspinach2);
        Button buttonchile2 = (Button) findViewById(R.id.buttonchile2);
        Button buttontomato2 = (Button) findViewById(R.id.buttontomato2);
        Button buttonlemon2 = (Button) findViewById(R.id.buttonlemon2);
        Button buttononion2 = (Button) findViewById(R.id.buttononion2);
        Button buttonshrimp2 = (Button) findViewById(R.id.buttonshrimp2);
        Button buttonegg2 = (Button) findViewById(R.id.buttonegg2);
        Button buttonchickenbreast2 = (Button) findViewById(R.id.buttonchickenbreast2);
        Button buttonporkmeat2 = (Button) findViewById(R.id.buttonporkmeat2);


        Button buttonShowmanu = (Button) findViewById(R.id.cooking);
        buttonShowmanu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(), popup_priority.class);
                startActivity(i);
            }
        });
        initialStatus();
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


        buttongarlic2.setOnClickListener(new View.OnClickListener() {
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
        buttoncabbage2.setOnClickListener(new View.OnClickListener() {
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
        buttonginger2.setOnClickListener(new View.OnClickListener() {
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
        buttongalangal2.setOnClickListener(new View.OnClickListener() {
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
        buttonbabycorn2.setOnClickListener(new View.OnClickListener() {
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
        buttonkale2.setOnClickListener(new View.OnClickListener() {
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
        buttoncarrot2.setOnClickListener(new View.OnClickListener() {
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
        buttonspringonion2.setOnClickListener(new View.OnClickListener() {
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
        buttonlemongrass2.setOnClickListener(new View.OnClickListener() {
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
        buttonyardlongbeans2.setOnClickListener(new View.OnClickListener() {
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
        buttoncucumber2.setOnClickListener(new View.OnClickListener() {
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
        buttonblockkerry2.setOnClickListener(new View.OnClickListener() {
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
        buttonkaffirlimeleaves2.setOnClickListener(new View.OnClickListener() {
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
        buttonholybasil2.setOnClickListener(new View.OnClickListener() {
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
        buttonchinesecabbage2.setOnClickListener(new View.OnClickListener() {
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
        buttoncoriander2.setOnClickListener(new View.OnClickListener() {
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
        buttonwaterspinach2.setOnClickListener(new View.OnClickListener() {
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
        buttonchile2.setOnClickListener(new View.OnClickListener() {
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
        buttontomato2.setOnClickListener(new View.OnClickListener() {
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
        buttonlemon2.setOnClickListener(new View.OnClickListener() {
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
        buttononion2.setOnClickListener(new View.OnClickListener() {
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
        buttonshrimp2.setOnClickListener(new View.OnClickListener() {
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
        buttonegg2.setOnClickListener(new View.OnClickListener() {
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
        buttonchickenbreast2.setOnClickListener(new View.OnClickListener() {
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
        buttonporkmeat2.setOnClickListener(new View.OnClickListener() {
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


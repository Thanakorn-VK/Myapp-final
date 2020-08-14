package com.example.myapp;

import android.content.Intent;
import android.os.Bundle;
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
import com.squareup.picasso.Picasso;

import java.util.ArrayList;
import java.util.HashSet;

public class Showmenufromdatabase extends AppCompatActivity {
    ArrayList<String> input = new ArrayList<String>();
    ArrayList<String> nameofmenu = new ArrayList<String>();
    HashSet<String> inputset = new HashSet <String>();
    HashSet <String> conpareset = new HashSet <String>();
    HashSet <String> resultset = new HashSet <String>();
    int [] imgmenu = new int[] {R.id.imgmenu,R.id.imgmenu2,R.id.imgmenu3,R.id.imgmenu4};
    int [] textmenu = new int[] {R.id.textmenu,R.id.textmenu2,R.id.textmenu3,R.id.textmenu4};
    public int index = 0;
    public int count = -1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.showmenufromdatabase);
        getAllingredient();
        compareandgetname("eggfriedrice");
        compareandgetname("ShrimpBasilFriedRice");
        compareandgetname("Porkbasilfriedrice");
        compareandgetname("Chickenbasilfriedrice");

        LinearLayout menu1 = (LinearLayout)findViewById(R.id.menu1);
        menu1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FirebaseDatabase database = FirebaseDatabase.getInstance();
                DatabaseReference myRef = database.getReference("nametoshow");
                myRef.setValue(nameofmenu.get(0));
                Intent i = new Intent(getApplicationContext(), Showrecipe.class);
                startActivity(i);
            }
        });
        LinearLayout menu2 = (LinearLayout)findViewById(R.id.menu2);
        menu2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FirebaseDatabase database = FirebaseDatabase.getInstance();
                DatabaseReference myRef = database.getReference("nametoshow");
                myRef.setValue(nameofmenu.get(1));
                Intent i = new Intent(getApplicationContext(), Showrecipe.class);
                startActivity(i);
            }
        });
        LinearLayout menu3 = (LinearLayout)findViewById(R.id.menu3);
        menu3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FirebaseDatabase database = FirebaseDatabase.getInstance();
                DatabaseReference myRef = database.getReference("nametoshow");
                myRef.setValue(nameofmenu.get(2));
                Intent i = new Intent(getApplicationContext(), Showrecipe.class);
                startActivity(i);
            }
        });
        LinearLayout menu4 = (LinearLayout)findViewById(R.id.menu4);
        menu4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FirebaseDatabase database = FirebaseDatabase.getInstance();
                DatabaseReference myRef = database.getReference("nametoshow");
                myRef.setValue(nameofmenu.get(3));
                Intent i = new Intent(getApplicationContext(), Showrecipe.class);
                startActivity(i);
            }
        });
    }
    public void showData(){
        for(int i = 0 ; i < nameofmenu.size() ; i++){
            Toast.makeText(getApplicationContext(), "name"+i+" = " + nameofmenu.get(i), Toast.LENGTH_LONG).show();
        }
    }
    public void getAllingredient(){
        getIngredient("garlic");
        getIngredient("lemongrass");
        getIngredient("tomato");
        getIngredient("chinesecabbage");
        getIngredient("cabbage");
        getIngredient("chile");
        getIngredient("kaffirlimeleaves");
        getIngredient("yardlongbeans");
        getIngredient("carrot");
        getIngredient("lemon");
        getIngredient("babycorn");
        getIngredient("springonion");
        getIngredient("kale");
        getIngredient("onion");
        getIngredient("cucumber");
        getIngredient("ginger");
        getIngredient("galangal");
        getIngredient("blockkerry");
        getIngredient("coriander");
        getIngredient("holybasil");
        getIngredient("waterspinach");
        getIngredient("egg");
        getIngredient("shrimp");
        getIngredient("porkmeat");
        getIngredient("chickenbreast");
    }



    public void getIngredient(final String name){
        String way = "ingredientinput/" + name;
        FirebaseDatabase database = FirebaseDatabase.getInstance();
        final DatabaseReference myRef = database.getReference(way); // "ingredientibput/garlic"

        myRef.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                String Value = dataSnapshot.getValue(String.class);
                if(Value.equals("yes")){
                    getInput(name);
                    changIndex();
                }

            }
            @Override
            public void onCancelled(DatabaseError error) {
                Toast.makeText(getApplicationContext(), "fail read date", Toast.LENGTH_LONG).show();
            }

        });
    }
    public void getInput(String name){
        input.add(name);
    }
    public void changIndex(){
        index = index+1;
    }
    public void loadInputtoset(){
        for(int i = 0 ; i < input.size() ; i++){
            inputset.add(input.get(i));
        }
    }



    public void compareandgetname(final String name){ // เอา input ที่ต้องการเปรียบเทียบมา
        String way = "menu/"+name+"/input";
        FirebaseDatabase database = FirebaseDatabase.getInstance();
        final DatabaseReference myRef = database.getReference(way); // "ingredientibput/garlic"

        myRef.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                String Value = dataSnapshot.getValue(String.class);
                String[] arr2 = Value.split("/");
                conpareset.clear(); // เคลียร์ค่า
                resultset.clear();
                loadcompare(arr2); //โหลดค่าที่ต้องการเปรียบเทียบกับ input ที่เรามี
                findName(name); // หาว่าค่าที่มีกับค่าที่ต้องการเปรียบเทียบว่าสามรถเอามาแสดงได้หรือไม้ **เมนูนั้นๆมีวัตถุดิบตรงตามที่เราเลือกครบทุกอัน
            }
            @Override
            public void onCancelled(DatabaseError error) {

            }

        });
    }
    public void findName(String name){
        loadInputtoset();
        resultset = inputset;
        resultset.retainAll(conpareset);
        if(resultset.equals(conpareset)){
            nameofmenu.add(name); // ถ้ามี จะต้องแอดชื่อเมนูนั้นๆไปยังอาเรย์ nameofmenu
            count++;
        }
        // for ตามอาเรย์ nameofmenu เพื่อแสดงทุกเมนูที่มี
        //setAllbox();
        setImg(count);
    }
    public void loadcompare(String[] arr2){
        for(int i = 0 ; i < arr2.length ; i++){
            conpareset.add(arr2[i]);
        }
    }



    public void setAllbox(){
        for(int i = 0 ; i < nameofmenu.size() ; i++){
            //setImg(i);
        }
    }
    public void setImg(final int index){
        String name = nameofmenu.get(index); // ถ้ามีข้อมูลที่ index 1 ต้องเปลี่ยน
        String way = "menu/"+ name +"/img";
        FirebaseDatabase database = FirebaseDatabase.getInstance();
        DatabaseReference myRef = database.getReference(way);
        myRef.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                String Value = dataSnapshot.getValue(String.class);
                Img(Value,index);

            }
            @Override
            public void onCancelled(DatabaseError error) {

            }
        });
    }
    public void Img(String urlImg, final int index){
        // ต้องเซ็ตตาม box ที่ต้องการ อาจจะใช้ index ในการอ้างอิงของ R.id.imgshowmenu

        ImageView imageView = (ImageView) findViewById(imgmenu[index]); // จะต้องเปลี่ยนตาม ช่องปัจจุบัน
        Picasso.with(this).load(urlImg).placeholder(R.mipmap.ic_loading)
                .error(R.mipmap.ic_loading)
                .into(imageView,new com.squareup.picasso.Callback(){

                    @Override
                    public void onSuccess() {
                        String name = nameofmenu.get(index); // ถ้ามีข้อมูลที่ index 1 ต้องเปลี่ยน
                        String way = "menu/"+ name +"/name";
                        FirebaseDatabase database = FirebaseDatabase.getInstance();
                        DatabaseReference myRef = database.getReference(way);
                        myRef.addValueEventListener(new ValueEventListener() {
                            @Override
                            public void onDataChange(DataSnapshot dataSnapshot) {
                                String Value = dataSnapshot.getValue(String.class);
                                TextView textView = (TextView) findViewById(textmenu[index]); // id จะต้องเปลี่ยนทุกครั้ง
                                textView.setText(Value);

                            }
                            @Override
                            public void onCancelled(DatabaseError error) {

                            }
                        });
                    }

                    @Override
                    public void onError() {
                    }
                });
    }/*
    public void setName(final int index){
        String name = nameofmenu.get(index); // ถ้ามีข้อมูลที่ index 1 ต้องเปลี่ยน
        String way = "menu/"+ name +"/name";
        FirebaseDatabase database = FirebaseDatabase.getInstance();
        DatabaseReference myRef = database.getReference(way);
        myRef.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                String Value = dataSnapshot.getValue(String.class);
                TextView textView = (TextView) findViewById(textmenu[index]); // id จะต้องเปลี่ยนทุกครั้ง
                textView.setText(Value);

            }
            @Override
            public void onCancelled(DatabaseError error) {

            }
        });
    }*/
}

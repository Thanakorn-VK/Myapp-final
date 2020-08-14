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

    public int index = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.showmenufromdatabase);
        getAllingredient();
        compareandgetname("eggfriedrice");
        LinearLayout menu_photos = (LinearLayout)findViewById(R.id.menu1);
        menu_photos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
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
    public void compareandgetname(final String name){
        String way = "menu/"+name+"/input";
        FirebaseDatabase database = FirebaseDatabase.getInstance();
        final DatabaseReference myRef = database.getReference(way); // "ingredientibput/garlic"

        myRef.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                String Value = dataSnapshot.getValue(String.class);
                String[] arr2 = Value.split("/");
                conpareset.clear();
                resultset.clear();
                loadcompare(arr2);
                findName(name);
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
            nameofmenu.add(name);
        }
        // for ตามอาเรย์ nameofmenu เพื่อแสดงทุกเมนูที่มี
        setImg();
    }
    public void loadcompare(String[] arr2){
        for(int i = 0 ; i < arr2.length ; i++){
            conpareset.add(arr2[i]);
        }
    }
    public void setImg(){
        String name = nameofmenu.get(0);
        String way = "menu/"+ name +"/img";
        FirebaseDatabase database = FirebaseDatabase.getInstance();
        DatabaseReference myRef = database.getReference(way);
        myRef.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                String Value = dataSnapshot.getValue(String.class);
                Img(Value);

            }
            @Override
            public void onCancelled(DatabaseError error) {

            }
        });
    }
    public void Img(String urlImg){
        // ต้องเซ็ตตาม box ที่ต้องการ อาจจะใช้ index ในการอ้างอิงของ R.id.imgshowmenu
        ImageView imageView = (ImageView) findViewById(R.id.imgmenu);
        Picasso.with(this).load(urlImg).placeholder(R.mipmap.ic_loading)
                .error(R.mipmap.ic_loading)
                .into(imageView,new com.squareup.picasso.Callback(){

                    @Override
                    public void onSuccess() {
                        setName();
                    }

                    @Override
                    public void onError() {
                    }
                });
    }
    public void setName(){
        String name = nameofmenu.get(0);
        String way = "menu/"+ name +"/name";
        FirebaseDatabase database = FirebaseDatabase.getInstance();
        DatabaseReference myRef = database.getReference(way);
        myRef.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                String Value = dataSnapshot.getValue(String.class);
                TextView textView = (TextView) findViewById(R.id.textmenu);
                textView.setText(Value);

            }
            @Override
            public void onCancelled(DatabaseError error) {

            }
        });
    }
}

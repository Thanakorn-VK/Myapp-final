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

public class Favourite extends AppCompatActivity {

    int [] imgmenu = new int[] {R.id.fimgmenu,R.id.fimgmenu2,R.id.fimgmenu3,R.id.fimgmenu4,
            R.id.fimgmenu5,R.id.fimgmenu6,R.id.fimgmenu7,R.id.fimgmenu8,
            R.id.fimgmenu9,R.id.fimgmenu10,R.id.fimgmenu11,R.id.fimgmenu12};

    int [] textmenu = new int[] {R.id.ftextmenu,R.id.ftextmenu2,R.id.ftextmenu3,R.id.ftextmenu4,
            R.id.ftextmenu5,R.id.ftextmenu6,R.id.ftextmenu7,R.id.ftextmenu8,
            R.id.ftextmenu9,R.id.ftextmenu10,R.id.ftextmenu11,R.id.ftextmenu12};

    int [] menu = new int[] {R.id.fmenu1,R.id.fmenu2,R.id.fmenu3,R.id.fmenu4, // 0 1 2 3
            R.id.fmenu5,R.id.fmenu6,R.id.fmenu7,R.id.fmenu8, // 4 5 6 7
            R.id.fmenu9,R.id.fmenu10,R.id.fmenu11,R.id.fmenu12}; // 8 9 10 11

    ArrayList<String> nameofmenu = new ArrayList<String>();
    public int count = -1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.favourite);
        try{
            this.getSupportActionBar().hide();
        }catch (NullPointerException e){

        }

        checkStatus("Porkbasilfriedrice");
        checkStatus("ShrimpBasilFriedRice");
        checkStatus("eggfriedrice");
        checkStatus("Chickenbasilfriedrice");
        checkStatus("Chickenrice");
        checkStatus("MincedPorkBoiledRice");
        checkStatus("Padthaiwithshrimp");
        checkStatus("Stirfriedmorningglory");
        checkStatus("Friedporkbelly");
        // ต้องการให้ฟังก์ชันทั้งหมดนี้ทำงานให้เสร็จก่อน

        LinearLayout menu1 = (LinearLayout)findViewById(R.id.fmenu1);
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
        LinearLayout menu2 = (LinearLayout)findViewById(R.id.fmenu2);
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
        LinearLayout menu3 = (LinearLayout)findViewById(R.id.fmenu3);
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
        LinearLayout menu4 = (LinearLayout)findViewById(R.id.fmenu4);
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
        LinearLayout menu5 = (LinearLayout)findViewById(R.id.fmenu5);
        menu5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FirebaseDatabase database = FirebaseDatabase.getInstance();
                DatabaseReference myRef = database.getReference("nametoshow");
                myRef.setValue(nameofmenu.get(4));
                Intent i = new Intent(getApplicationContext(), Showrecipe.class);
                startActivity(i);
            }
        });
        LinearLayout menu6 = (LinearLayout)findViewById(R.id.fmenu6);
        menu6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FirebaseDatabase database = FirebaseDatabase.getInstance();
                DatabaseReference myRef = database.getReference("nametoshow");
                myRef.setValue(nameofmenu.get(5));
                Intent i = new Intent(getApplicationContext(), Showrecipe.class);
                startActivity(i);
            }
        });
        LinearLayout menu7 = (LinearLayout)findViewById(R.id.fmenu7);
        menu7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FirebaseDatabase database = FirebaseDatabase.getInstance();
                DatabaseReference myRef = database.getReference("nametoshow");
                myRef.setValue(nameofmenu.get(6));
                Intent i = new Intent(getApplicationContext(), Showrecipe.class);
                startActivity(i);
            }
        });
        LinearLayout menu8 = (LinearLayout)findViewById(R.id.fmenu8);
        menu8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FirebaseDatabase database = FirebaseDatabase.getInstance();
                DatabaseReference myRef = database.getReference("nametoshow");
                myRef.setValue(nameofmenu.get(7));
                Intent i = new Intent(getApplicationContext(), Showrecipe.class);
                startActivity(i);
            }
        });
        LinearLayout menu9 = (LinearLayout)findViewById(R.id.fmenu9);
        menu9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FirebaseDatabase database = FirebaseDatabase.getInstance();
                DatabaseReference myRef = database.getReference("nametoshow");
                myRef.setValue(nameofmenu.get(8));
                Intent i = new Intent(getApplicationContext(), Showrecipe.class);
                startActivity(i);
            }
        });
        LinearLayout menu10 = (LinearLayout)findViewById(R.id.fmenu10);
        menu10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FirebaseDatabase database = FirebaseDatabase.getInstance();
                DatabaseReference myRef = database.getReference("nametoshow");
                myRef.setValue(nameofmenu.get(9));
                Intent i = new Intent(getApplicationContext(), Showrecipe.class);
                startActivity(i);
            }
        });
        LinearLayout menu11 = (LinearLayout)findViewById(R.id.fmenu11);
        menu11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FirebaseDatabase database = FirebaseDatabase.getInstance();
                DatabaseReference myRef = database.getReference("nametoshow");
                myRef.setValue(nameofmenu.get(10));
                Intent i = new Intent(getApplicationContext(), Showrecipe.class);
                startActivity(i);
            }
        });
        LinearLayout menu12 = (LinearLayout)findViewById(R.id.fmenu12);
        menu12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FirebaseDatabase database = FirebaseDatabase.getInstance();
                DatabaseReference myRef = database.getReference("nametoshow");
                myRef.setValue(nameofmenu.get(11));
                Intent i = new Intent(getApplicationContext(), Showrecipe.class);
                startActivity(i);
            }
        });
    }

    public void checkStatus(final String name){
        String way = "menu/" + name +"/status";
        setBoxvisibilityVisible();
        FirebaseDatabase database = FirebaseDatabase.getInstance();
        final DatabaseReference myRef = database.getReference(way);

        myRef.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                String Value = dataSnapshot.getValue(String.class);
                if(Value.equals("like")){
                    nameofmenu.add(name);
                    count++;
                }
                if(count != -1){
                    setImg(count);
                }
            }
            @Override
            public void onCancelled(DatabaseError error) {
                Toast.makeText(getApplicationContext(), "fail read date", Toast.LENGTH_LONG).show();
            }

        });
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
                                setBoxvisibilityGone();

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
    }
    public void setBoxvisibilityGone(){
        for(int index = nameofmenu.size() ; index < 12 ; index++){
            LinearLayout linearlayout = (LinearLayout) findViewById(menu[index]);
            linearlayout.setVisibility(View.GONE);
        }
    }
    public void setBoxvisibilityVisible(){
        for(int index = 0 ; index < 12 ; index++){
            LinearLayout linearlayout = (LinearLayout) findViewById(menu[index]);
            linearlayout.setVisibility(View.VISIBLE);
        }
    }
}


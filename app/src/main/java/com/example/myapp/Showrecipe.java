package com.example.myapp;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;
import com.google.android.material.tabs.TabLayout;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;
import com.squareup.picasso.Picasso;

import java.util.ArrayList;

public class Showrecipe extends AppCompatActivity {
    String[] arr;
    String[] arrText2;
    String Menu = ""; // ตรงนี้ต้องเป็นตัวแปรที่มาจากการเลือกเมนูอาหารจากหน้าที่แล้ว
    int [] Img = new int[] {R.mipmap.ic_pan,R.mipmap.ic_pot};
    int [] IndexText = new int[] {R.id.textdata0,R.id.textdata1,R.id.textdata2,R.id.textdata3,R.id.textdata4,
                                  R.id.textdata5,R.id.textdata6,R.id.textdata7,R.id.textdata8,R.id.textdata9,
                                  R.id.textdata10,R.id.textdata11,R.id.textdata12,R.id.textdata13,R.id.textdata14,
                                  R.id.textdata15,R.id.textdata16,R.id.textdata17,R.id.textdata18,R.id.textdata19,R.id.textdata20};

    int [] IndexText2 = new int[] {R.id.textdata21,R.id.textdata22,R.id.textdata23,R.id.textdata24,R.id.textdata25,
                                   R.id.textdata26,R.id.textdata27,R.id.textdata28,R.id.textdata29,R.id.textdata30};
    ImageView imageView;
    TabLayout tabLayout;
    ViewPager viewPager;
    String urlImg = "";
    private Object ViewPagerAdapter;
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.showrecipe);

        getMenu();
        imageView = (ImageView)findViewById(R.id.imgshowmenu);
        tabLayout = findViewById(R.id.tablayout);
        viewPager = findViewById(R.id.viewpager);
        getTab();
        Button back = (Button) findViewById(R.id.back);
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(), Showmenufromdatabase.class);
                startActivity(i);
            }
        });
    }

    public void getMenu(){
        FirebaseDatabase database = FirebaseDatabase.getInstance();
        DatabaseReference myRef = database.getReference("nametoshow");
        myRef.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                String Value = dataSnapshot.getValue(String.class);
                getUrl(Value);
                getName(Value);
                getType(Value);
                getData(Value);
                getDataText(Value);
            }
            @Override
            public void onCancelled(DatabaseError error) {
                Toast.makeText(getApplicationContext(), "fail read date", Toast.LENGTH_LONG).show();
            }

        });
    }
    private void loadImageFromUrl(String urlImg) {
        Picasso.with(this).load(urlImg).placeholder(R.mipmap.ic_loading)
        .error(R.mipmap.ic_loading)
        .into(imageView,new com.squareup.picasso.Callback(){
            @Override
            public void onSuccess() {
            }

            @Override
            public void onError() {

            }
        });
    }
    public void getTab(){
        final ViewPagerAdapter viewPagerAdapter;
        ViewPagerAdapter = viewPagerAdapter = new ViewPagerAdapter(getSupportFragmentManager());

        new Handler().post(new Runnable() {
            @Override
            public void run() {
            viewPagerAdapter.addFragment(Fragment.getInstance(),"ส่วนผสม");
            viewPagerAdapter.addFragment(StatusFragment.getInstance(),"วิธีทำ");
            viewPager.setAdapter(viewPagerAdapter);
            tabLayout.setupWithViewPager(viewPager);
            }
        });
    }
    public void getUrl(final String name){
        String way = "menu/"+ name +"/img";
        FirebaseDatabase database = FirebaseDatabase.getInstance();
        DatabaseReference myRef = database.getReference(way);
        myRef.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                String Value = dataSnapshot.getValue(String.class);
                setUrl(Value);
            }
            @Override
            public void onCancelled(DatabaseError error) {
                Toast.makeText(getApplicationContext(), "fail read date", Toast.LENGTH_LONG).show();
            }

        });
    }
    public void setUrl(String url){
        urlImg = url;
        loadImageFromUrl(urlImg);
    }

    public void showDetail(String name,String type){
        TextView textView1 = (TextView) findViewById(R.id.namemenu);
        textView1.setText(name);
        TextView textView2 = (TextView) findViewById(R.id.type);

        if(type.equals("yes")) {
            ImageView imageView1 = (ImageView) findViewById(R.id.typeimg);
            imageView1.setImageResource(Img[0]);
            textView2.setText("เมนูผัด");
        }
        if(type.equals("no")) {
            ImageView imageView2 = (ImageView) findViewById(R.id.typeimg);
            imageView2.setImageResource(Img[1]);
            textView2.setText("เมนูต้ม");
        }

    }
    public void getName(final String name){
        String way = "menu/"+ name +"/name";
        FirebaseDatabase database = FirebaseDatabase.getInstance();
        DatabaseReference myRef = database.getReference(way);
        myRef.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                String Value = dataSnapshot.getValue(String.class);
                TextView textView1 = (TextView) findViewById(R.id.namemenu);
                textView1.setText(Value);
            }
            @Override
            public void onCancelled(DatabaseError error) {
                Toast.makeText(getApplicationContext(), "fail read date", Toast.LENGTH_LONG).show();
            }

        });
    }

    public void getType(final String name){
        String way = "menu/"+ name +"/type";
        FirebaseDatabase database = FirebaseDatabase.getInstance();
        DatabaseReference myRef = database.getReference(way);
        myRef.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                String Value = dataSnapshot.getValue(String.class);
                TextView textView2 = (TextView) findViewById(R.id.type);

                if(Value.equals("yes")) {
                    ImageView imageView1 = (ImageView) findViewById(R.id.typeimg);
                    imageView1.setImageResource(Img[0]);
                    textView2.setText("เมนูผัด");
                }
                if(Value.equals("no")) {
                    ImageView imageView2 = (ImageView) findViewById(R.id.typeimg);
                    imageView2.setImageResource(Img[1]);
                    textView2.setText("เมนูต้ม");
                }
            }
            @Override
            public void onCancelled(DatabaseError error) {
                Toast.makeText(getApplicationContext(), "fail read date", Toast.LENGTH_LONG).show();
            }

        });
    }




    public void getData(final String name){
        String way = "menu/"+ name +"/text1";
        FirebaseDatabase database = FirebaseDatabase.getInstance();
        DatabaseReference myRef = database.getReference(way);
        myRef.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                String Value = dataSnapshot.getValue(String.class);
                arr = Value.split("/");
                showData(arr); //บัคตรงนี้ถ้าย้อนกลับไปดูเมนูอื่น
            }
            @Override
            public void onCancelled(DatabaseError error) {

            }
        });
    }
    public void showData(String[] arr){
        for(int index = 0 ; index < arr.length ; index++){
            TextView textView = (TextView) findViewById(IndexText[index]);
            textView.setText((index+1)+". "+arr[index]); //บัคตรงนี้ถ้าย้อนกลับไปดูเมนูอื่น
        }
        for(int index = arr.length ; index < IndexText.length ; index++){
            TextView textView = (TextView) findViewById(IndexText[index]);
            textView.setVisibility(View.GONE);
        }
    }
    public void getDataText(final String name){
        String way = "menu/"+ name +"/text2";
        FirebaseDatabase database = FirebaseDatabase.getInstance();
        DatabaseReference myRef = database.getReference(way);
        myRef.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                String Value = dataSnapshot.getValue(String.class);
                arrText2 = Value.split("/");
                showText(arrText2);
            }
            @Override
            public void onCancelled(DatabaseError error) {

            }
        });
    }
    public void showText(String[] arr){
        for(int index = 0 ; index < arr.length ; index++){
            TextView textView = (TextView) findViewById(IndexText2[index]);
            textView.setText((index+1)+". "+arr[index]);
        }

        for(int index = arr.length ; index < IndexText2.length ; index++){
            TextView textView = (TextView) findViewById(IndexText2[index]);
            textView.setVisibility(View.GONE);
        }
    }
}

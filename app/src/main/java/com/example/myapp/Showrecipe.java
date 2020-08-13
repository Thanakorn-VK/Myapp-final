package com.example.myapp;

import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.ImageView;
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
    String Menu = "eggfriedrice"; // ตรงนี้ต้องเป็นตัวแปรที่มาจากการเลือกเมนูอาหารจากหน้าที่แล้ว
    int [] Img = new int[] {R.mipmap.ic_pan,R.mipmap.ic_pot};
    int [] IndexText = new int[] {R.id.textdata0,R.id.textdata1,R.id.textdata2,R.id.textdata3,R.id.textdata4,
                                  R.id.textdata5,R.id.textdata6,R.id.textdata7,R.id.textdata8,R.id.textdata9,
                                  R.id.textdata10,R.id.textdata11,R.id.textdata12,R.id.textdata13,R.id.textdata14};
    int [] IndexText2 = new int[] {R.id.textdata15,R.id.textdata16,R.id.textdata17,R.id.textdata18,R.id.textdata19,
                                   R.id.textdata20};
    ImageView imageView;
    TabLayout tabLayout;
    ViewPager viewPager;
    String urlImg = "";
    public String nameMenu = "";
    public String typeMenu = "";
    private Object ViewPagerAdapter;
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.showrecipe);
        getUrl(Menu);
        getName(Menu);
        getType(Menu);
        getData(Menu);
        getDataText(Menu);
        imageView = (ImageView)findViewById(R.id.imgshowmenu);
        tabLayout = findViewById(R.id.tablayout);
        viewPager = findViewById(R.id.viewpager);
        getTab();
    }
    private void loadImageFromUrl(String urlImg) {
        Picasso.with(this).load(urlImg).placeholder(R.mipmap.ic_loading)
        .error(R.mipmap.ic_loading)
        .into(imageView,new com.squareup.picasso.Callback(){

            @Override
            public void onSuccess() {
                showDetail(nameMenu,typeMenu);
            }

            @Override
            public void onError() {

            }
        });
    }
    public void showDetail(String name,String type){
        TextView textView1 = (TextView) findViewById(R.id.namemenu);
        TextView textView2 = (TextView) findViewById(R.id.type);
        textView1.setText(name);

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
    public void getName(final String name){
        String way = "menu/"+ name +"/name";
        FirebaseDatabase database = FirebaseDatabase.getInstance();
        DatabaseReference myRef = database.getReference(way);
        myRef.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                String Value = dataSnapshot.getValue(String.class);
                setName(Value);
            }
            @Override
            public void onCancelled(DatabaseError error) {
                Toast.makeText(getApplicationContext(), "fail read date", Toast.LENGTH_LONG).show();
            }

        });
    }
    public void setName(String name){
        nameMenu = name;
    }
    public void getType(final String name){
        String way = "menu/"+ name +"/type";
        FirebaseDatabase database = FirebaseDatabase.getInstance();
        DatabaseReference myRef = database.getReference(way);
        myRef.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                String Value = dataSnapshot.getValue(String.class);
                setType(Value);
            }
            @Override
            public void onCancelled(DatabaseError error) {
                Toast.makeText(getApplicationContext(), "fail read date", Toast.LENGTH_LONG).show();
            }

        });
    }
    public void setType(String type){
        typeMenu = type;
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
                showData(arr);
            }
            @Override
            public void onCancelled(DatabaseError error) {

            }
        });
    }
    public void showData(String[] arr){
        for(int index = 0 ; index < arr.length ; index++){
            TextView textView = (TextView) findViewById(IndexText[index]);
            textView.setText((index+1)+". "+arr[index]);
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

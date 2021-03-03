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
    String[] arrbuffer;
    String[] arrText2;
    String[] arrText2buffer;
    String Menu = ""; // ตรงนี้ต้องเป็นตัวแปรที่มาจากการเลือกเมนูอาหารจากหน้าที่แล้ว
    public int current_img;
    String currentName;
    int [] Img = new int[] {R.mipmap.ic_pan_foreground,R.mipmap.ic_pot_foreground};
    int [] IndexText = new int[] {R.id.textdata0};

    int [] IndexText2 = new int[] {R.id.textdata21};

    int [] ImgStatus = new int [] {R.mipmap.ic_unlike_foreground,R.mipmap.ic_like_foreground};
    ImageView imageView;
    TabLayout tabLayout;
    ViewPager viewPager;
    String urlImg = "";
    private Object ViewPagerAdapter;
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.showrecipe);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        getMenu();
        imageView = (ImageView)findViewById(R.id.imgshowmenu);
        tabLayout = findViewById(R.id.tablayout);
        viewPager = findViewById(R.id.viewpager);
        getTab();
        LinearLayout statuslayout = (LinearLayout)findViewById(R.id.statuslayout);
        statuslayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                    statusClick();
            }
        });
    }
    public void statusClick(){
        current_img++;
        current_img = current_img % ImgStatus.length;
        ImageView imageView3 = (ImageView) findViewById(R.id.status);
        imageView3.setImageResource(ImgStatus[current_img]);

        String way = "menu/"+ currentName +"/status";
        FirebaseDatabase database = FirebaseDatabase.getInstance();
        DatabaseReference myRef = database.getReference(way);
        if(current_img == 0){
            myRef.setValue("unlike");
        }
        else if(current_img == 1) {
            myRef.setValue("like");
        }
    }
    public void getMenu(){

        Bundle extras = getIntent().getExtras();
        String Value = extras.getString("name");

        currentName = Value;
        getUrl(Value);
        getName(Value);
        getType(Value);
        getData(Value);
        getDataText(Value);
        getStatus(Value);

    }
    public void getStatus(final String name){
        String way = "menu/"+ name +"/status";
        FirebaseDatabase database = FirebaseDatabase.getInstance();
        DatabaseReference myRef = database.getReference(way);
        myRef.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                String Value = dataSnapshot.getValue(String.class);

                if(Value.equals("unlike")) {
                    current_img = 0;
                    ImageView imageView1 = (ImageView) findViewById(R.id.status);
                    imageView1.setImageResource(ImgStatus[0]);
                }
                if(Value.equals("like")) {
                    current_img = 1;
                    ImageView imageView2 = (ImageView) findViewById(R.id.status);
                    imageView2.setImageResource(ImgStatus[1]);
                }
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

                showData2(arr); //บัคตรงนี้ถ้าย้อนกลับไปดูเมนูอื่น
            }
            @Override
            public void onCancelled(DatabaseError error) {

            }
        });
    }
    public void showData2(String[] arr){
        TextView textView = (TextView) findViewById(IndexText[0]);
        String str = "";

        for(int index = 0 ; index < arr.length ; index++){
            str+= (index+1)+". "+arr[index] + "\n\n";
        }

        textView.setText(str);
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
                showText2(arrText2);
            }
            @Override
            public void onCancelled(DatabaseError error) {

            }
        });
    }
    public void showText2(String[] arr){
        TextView textView2 = (TextView) findViewById(IndexText2[0]);
        String str = "";

        for(int index = 0 ; index < arr.length ; index++){
            str+= (index+1)+". "+arr[index] + "\n\n";
        }
        textView2.setText(str);
    }

}

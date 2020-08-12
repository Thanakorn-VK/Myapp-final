package com.example.myapp;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import com.google.android.material.tabs.TabItem;
import com.google.android.material.tabs.TabLayout;

public class Showrecipe extends AppCompatActivity {
    TabLayout tabLayout;
    ViewPager viewPager;
    private Object ViewPagerAdapter;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.showrecipe);

        tabLayout = findViewById(R.id.tablayout);
        viewPager = findViewById(R.id.viewpager);
        getTab();

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
}

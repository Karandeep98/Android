package com.karandeep.viewpager;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;


import com.google.android.material.tabs.TabLayout;

public class MainActivity extends AppCompatActivity {
private void setupViewpager(ViewPager viewpager){
    PagerAdapter adapter=new PagerAdapter(getSupportFragmentManager());
    adapter.addFragment(new Tab1(),"One");
    adapter.addFragment(new Tab2(),"Two");
    adapter.addFragment(new Tab3(),"Three");
    viewpager.setAdapter(adapter);
}
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TabLayout tablayout= findViewById(R.id.tabs);
        Toolbar toolbar=findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setTitle("Home");
        ViewPager viewpager=findViewById(R.id.viewpager);
        setupViewpager(viewpager);
        tablayout.setupWithViewPager(viewpager);

    }
}

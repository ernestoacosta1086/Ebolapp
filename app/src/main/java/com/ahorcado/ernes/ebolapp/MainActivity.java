package com.ahorcado.ernes.ebolapp;

import android.support.v4.view.*;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    ViewPager mainViewPager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mainViewPager = (ViewPager) findViewById(R.id.main_view_pager);
        Adapters.PagerAdapter adapter = new Adapters.PagerAdapter(getSupportFragmentManager());
        mainViewPager.setAdapter(adapter);

    }
}

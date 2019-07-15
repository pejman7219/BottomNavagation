package com.example.pejman.bottomnavagation;

import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.pejman.bottomnavagation.Frogments.FureFragment;
import com.example.pejman.bottomnavagation.Frogments.OneFrogment;
import com.example.pejman.bottomnavagation.Frogments.ThreeFragment;
import com.example.pejman.bottomnavagation.Frogments.TowFragment;

import wiadevelopers.com.bottomnavigationlib.BottomNav.BottomNavigationView;
import wiadevelopers.com.bottomnavigationlib.Utils;

public class MainActivity extends AppCompatActivity {

    ViewPager viewPager;
    BottomNavigationView bottomNavigationView;

    OneFrogment oneFrogment = new OneFrogment();
    TowFragment towFragment = new TowFragment();
    ThreeFragment threeFragment = new ThreeFragment();
    FureFragment fureFragment = new FureFragment();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        viewPager = findViewById(R.id.viewPager);
        bottomNavigationView = findViewById(R.id.bottomNavaagationView);
        setupViewPager(viewPager);
    }

    private void setupViewPager(final ViewPager viewPager)
    {
        Utils.ViewPagerAdapter adapter = new Utils.ViewPagerAdapter(getSupportFragmentManager());
        adapter.addFragment(oneFrogment);
        adapter.addFragment(towFragment);
        adapter.addFragment(threeFragment);
        adapter.addFragment(fureFragment);
        Utils.setUpViewPager(MainActivity.this,viewPager,adapter,bottomNavigationView,R.menu.bottom_navigation_items,3,0);
    }
}

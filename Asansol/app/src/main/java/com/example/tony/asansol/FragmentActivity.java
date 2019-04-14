package com.example.tony.asansol;

import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;

public class FragmentActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fragment);


        ViewPager viewPager = (ViewPager) findViewById(R.id.ViewPager);
        TabLayout tabLayout = (TabLayout) findViewById(R.id.Sliding_tabs);

        tabLayout.setupWithViewPager(viewPager);

        SimpleFragmentPagerAdapter adapter = new SimpleFragmentPagerAdapter(getSupportFragmentManager());
        adapter.add(getResources().getString(R.string.explore));
        adapter.add(getResources().getString(R.string.temple));
        adapter.add(getResources().getString(R.string.park));
        adapter.add(getResources().getString(R.string.hotel));
        viewPager.setAdapter(adapter);

    }
}

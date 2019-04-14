package com.example.tony.asansol;

import android.support.v4.app.FragmentPagerAdapter;

import java.util.ArrayList;
import java.util.List;

public class SimpleFragmentPagerAdapter extends FragmentPagerAdapter {
    public SimpleFragmentPagerAdapter(android.support.v4.app.FragmentManager fm) {
        super(fm);
    }

    //int pageTitle[] = {R.string.explore,R.string.park,R.string.temple,R.string.hotel};
    private List<String> mFragmentTitleList = new ArrayList<>();
    @Override
    public android.support.v4.app.Fragment getItem(int position) {
        if (position == 0)
            return new ExploreFragment();
        else if (position == 1)
            return new TempleFragment();
        else if (position == 2)
            return new ParkFragment();
        else
            return new HotelFragment();
    }
    @Override
    public int getCount() {
        return 4;
    }

    void add(String title)
    {
        mFragmentTitleList.add(title);
    }

    @Override
    public CharSequence getPageTitle(int position) {
            return mFragmentTitleList.get(position);
    }

}
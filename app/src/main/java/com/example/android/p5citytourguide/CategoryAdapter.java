package com.example.android.p5citytourguide;


import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

class CategoryAdapter extends FragmentPagerAdapter {

    public CategoryAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        if (position == 0) {
            return new FunPlacesFragment();
        }else if (position == 1) {
                return new HotelsFragment();
        } else if (position == 2) {
                return new MuseumsFragment();
        } else {
                return new RestaurantsFragment();
        }
    }

    @Override
    public int getCount() {
        return 4;
    }

}













package com.hkm.oc.preF.root;

import android.app.Fragment;
import android.app.FragmentManager;
import android.support.v13.app.FragmentPagerAdapter;

import java.util.ArrayList;

public class FPAManager extends FragmentPagerAdapter {
    private ArrayList<Fragment> fragmentsList;

    public FPAManager(FragmentManager fm) {
        super(fm);
    }

    public FPAManager(FragmentManager fm, ArrayList<Fragment> fragments) {
        super(fm);
        this.fragmentsList = fragments;
    }

    @Override
    public int getCount() {
        return fragmentsList.size();
    }

    @Override
    public Fragment getItem(int arg0) {
        return fragmentsList.get(arg0);
    }

    @Override
    public int getItemPosition(Object object) {
        return super.getItemPosition(object);
    }

}

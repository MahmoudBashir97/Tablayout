package com.besheer.mahmoud.e_learning;

import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import java.util.ArrayList;
import java.util.List;

public class ViewpageAdapter extends FragmentPagerAdapter {

    private final List<Fragment> fragmentlist=new ArrayList<>();
    private final List<String> fragmentlisttitels=new ArrayList<>();

    public ViewpageAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        return fragmentlist.get(position);
    }

    @Override
    public int getCount() {
        return fragmentlisttitels.size();
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        return fragmentlisttitels.get(position);
    }
    public void addFragment (Fragment fragment , String Title){
        fragmentlist.add(fragment);
        fragmentlisttitels.add(Title);
    }
}

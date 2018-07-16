package com.anonymi.anonymi.Fragments;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

import com.anonymi.anonymi.Tabs.AnoChatsTab;
import com.anonymi.anonymi.Tabs.AnoHubTab;


public class MainAdaptor extends FragmentStatePagerAdapter {
    int mNumOfTabs;

    public MainAdaptor(FragmentManager fm, int NumOfTabs) {
        super(fm);
        this.mNumOfTabs = NumOfTabs;
    }

    @Override
    public Fragment getItem(int position) {

        switch (position) {
            case 0:
                AnoHubTab tab1 = new AnoHubTab();
                return tab1;
            case 1:
                AnoChatsTab tab2 = new AnoChatsTab();
                return tab2;


            default:
                return null;
        }
    }

    @Override
    public int getCount() {
        return mNumOfTabs;
    }
}

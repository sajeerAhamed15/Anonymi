package com.anonymi.anonymi.Fragments;

import android.content.Intent;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.anonymi.anonymi.Fragments.Contact.ContactActivity;
import com.anonymi.anonymi.R;
import com.anonymi.anonymi.Tabs.NewStatus;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        TabLayout tabLayout = (TabLayout) findViewById(R.id.tab_layoutt);
        tabLayout.setTabMode(TabLayout.MODE_SCROLLABLE);
        tabLayout.addTab(tabLayout.newTab().setText("Ano Hub"));
        tabLayout.addTab(tabLayout.newTab().setText("Ano Chat"));
        tabLayout.setTabGravity(TabLayout.GRAVITY_FILL);

        final ViewPager viewPager = (ViewPager) findViewById(R.id.pagerr);
        final MainAdaptor a = new MainAdaptor(getSupportFragmentManager(), tabLayout.getTabCount());
        viewPager.setAdapter(a);
        viewPager.addOnPageChangeListener(new TabLayout.TabLayoutOnPageChangeListener(tabLayout));
        tabLayout.setOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {
                viewPager.setCurrentItem(tab.getPosition());

            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {

            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {

            }
        });
    }


    public void contactBtn(View view) {
        startActivity(new Intent(getApplicationContext(), ContactActivity.class));
    }
    public void newPost(View view) {
        startActivity(new Intent(getApplicationContext(),NewStatus.class));
    }

}

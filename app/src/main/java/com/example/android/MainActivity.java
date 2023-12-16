package com.example.android;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TabHost;

import com.google.android.material.tabs.TabLayout;

import me.ibrahimsn.lib.OnItemSelectedListener;
import me.ibrahimsn.lib.SmoothBottomBar;

public class MainActivity extends AppCompatActivity {

    SmoothBottomBar smoothBottomBar;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        smoothBottomBar = findViewById(R.id.bottomNav);
        loadFragment(new Home());

        smoothBottomBar.setOnItemSelectedListener(new OnItemSelectedListener() {
            @Override
            public boolean onItemSelect(int i) {

                if (i == 0){
                    loadFragment(new Home());
                } else if (i == 1) {
                    loadFragment(new Forum());
                } else if (i == 2) {
                    loadFragment(new AddPost());
                } else {
                    loadFragment(new Profile());
                }

                return true;
            }
        });

    }

    private void loadFragment(Fragment fragment){

        FragmentManager fragmentManager = getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        fragmentTransaction.replace(R.id.frameLayout, fragment).commit();

    }
    private void tabLayout(TabHost tabHost){

        tabHost = findViewById(R.id.tabHost);

        tabHost.setup();
        TabHost.TabSpec tabSpec = tabHost.newTabSpec("Tab One");
        tabSpec.setContent(R.id.Tab1);
        tabSpec.setIndicator("Tab One");
        tabHost.addTab(tabSpec);

        // Code for adding Tab 2 to the tabhost
        tabSpec = tabHost.newTabSpec("Tab Two");
        tabSpec.setContent(R.id.tab2);

        // setting the name of the tab 1 as "Tab Two"
        tabSpec.setIndicator("Tab Two");
        tabHost.addTab(tabSpec);

        // Code for adding Tab 3 to the tabhost
        tabSpec = tabHost.newTabSpec("Tab Three");
        tabSpec.setContent(R.id.tab3);
        tabSpec.setIndicator("Tab Three");
        tabHost.addTab(tabSpec);
    }


}

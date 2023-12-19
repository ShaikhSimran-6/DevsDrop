package com.example.android;

import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.widget.ViewPager2;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TabHost;

import com.google.android.material.tabs.TabLayout;
import com.google.android.material.tabs.TabLayoutMediator;

import java.util.ArrayList;
import java.util.List;

public class Forum extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_forum, container, false);
        ViewPager2 viewPager = rootView.findViewById (R.id.viewPager);
        TabLayout tabLayout = rootView.findViewById(R.id.tabLayout);


        List<Fragment> fragments = new ArrayList<>();
        fragments.add(new Question());
        fragments.add(new Discussion());

        MyPagerAdapter pagerAdapter = new MyPagerAdapter(getActivity(), fragments);
        viewPager.setAdapter(pagerAdapter);

        new TabLayoutMediator(tabLayout, viewPager,
                (tab, position) -> tab.setText(getTabTitle(position))
        ).attach();


        // Inflate the layout for this fragment


        return  rootView;

    }
    private String getTabTitle(int position) {
        switch (position) {
            case 0:
                return "Question";
            case 1:
                return "Discussion";
            default:
                return null;
        }
    }
}
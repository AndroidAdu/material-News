package com.mindimps.test;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.mindimps.R;
import com.mindimps.control.fragment.TestFragment;

import java.util.ArrayList;

/**
 * 为了实现Material design 实现的CoordinatorLayout
 */

public class MaterialFragmentActivity extends AppCompatActivity {
    ArrayList<Fragment> fragmentList=new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_material_fragment);


        TestFragment fragment1=new TestFragment();
        TestFragment fragment2=new TestFragment();


        fragmentList.add(fragment1);
        fragmentList.add(fragment2);

        ViewPager viewpager=(ViewPager)findViewById(R.id.viewpager);
        viewpager.setAdapter(new FragmentPagerAdapter(getSupportFragmentManager()) {
            @Override
            public Fragment getItem(int position) {
                return fragmentList.get(position);
            }

            @Override
            public int getCount() {
                return fragmentList.size();
            }
        });
    }
}

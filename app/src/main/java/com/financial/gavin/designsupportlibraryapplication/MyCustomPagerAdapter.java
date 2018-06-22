package com.financial.gavin.designsupportlibraryapplication;

import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

public class MyCustomPagerAdapter extends FragmentPagerAdapter {
	
	public static final int PAGE_NUM = 10;
	
	public MyCustomPagerAdapter(FragmentManager fm) {
		super(fm);
	}
	
	@Override
	public Fragment getItem(int position) {
		return PageFragment.getInstance(position + 1);
	}
	
	@Override
	public int getCount() {
		return PAGE_NUM;
	}
	
	@Nullable
	@Override
	public CharSequence getPageTitle(int position) {
		return "Tab" + (position + 1);
	}
}

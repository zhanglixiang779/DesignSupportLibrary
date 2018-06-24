package com.financial.gavin.designsupportlibraryapplication;

import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

public class MyCustomPagerAdapter extends FragmentPagerAdapter {
	
	private static final int PAGE_NUM = 3;
	
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
		if (position == 0) {
			return "Profile";
		}
		
		if (position == 1) {
			return "Services";
		}
		
		if (position == 2) {
			return "Settings";
		}
		
		return null;
	}
}

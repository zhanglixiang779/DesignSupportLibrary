package com.financial.gavin.designsupportlibraryapplication;

import android.graphics.Color;
import android.os.Bundle;
import android.support.design.widget.CollapsingToolbarLayout;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;

public class MainActivity extends AppCompatActivity {
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		final Toolbar toolbar = findViewById(R.id.toolBar);
		setSupportActionBar(toolbar);
		
		CollapsingToolbarLayout collapsingToolbar = findViewById(R.id.collapsing_tool_bar);
		collapsingToolbar.setTitle("Gavin L. Zhang");
		collapsingToolbar.setExpandedTitleColor(Color.WHITE);
		
		ViewPager viewPager = findViewById(R.id.viewPager);
		MyCustomPagerAdapter adapter = new MyCustomPagerAdapter(getSupportFragmentManager());
		viewPager.setAdapter(adapter);
		
		TabLayout tabLayout = findViewById(R.id.tabLayout);
		tabLayout.setupWithViewPager(viewPager);
	}
}

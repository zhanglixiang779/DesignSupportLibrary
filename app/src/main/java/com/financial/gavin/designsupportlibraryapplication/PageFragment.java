package com.financial.gavin.designsupportlibraryapplication;


import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v4.app.Fragment;
import android.support.v4.widget.SwipeRefreshLayout;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;


public class PageFragment extends Fragment {
	
	public static final String PAGE_NUMBER = "page_number";
	
	SwipeRefreshLayout swipeRefreshLayout;
	
	public PageFragment() {
	}
	
	public static PageFragment getInstance(int pageNumber) {
		PageFragment fragment = new PageFragment();
		Bundle args = new Bundle();
		args.putInt(PAGE_NUMBER, pageNumber);
		fragment.setArguments(args);
		return fragment;
	}
	
	@Override
	public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container,
							 Bundle savedInstanceState) {
		View view = inflater.inflate(R.layout.fragment_page, container, false);
		TextView textView = view.findViewById(R.id.id_tv);
		if (getArguments() != null) {
			String scrollViewText = getString(R.string.nested_scroll_view_text);
			textView.setText(String.format("fragment%s%s", String.valueOf(getArguments().getInt(PAGE_NUMBER)), scrollViewText));
		}
		
		swipeRefreshLayout = view.findViewById(R.id.swipe_refresh_layout);
		swipeRefreshLayout.setOnRefreshListener(new SwipeRefreshLayout.OnRefreshListener() {
			@Override
			public void onRefresh() {
				updateData();
			}
		});
		
		return view;
	}
	
	private void updateData() {
		new Thread(new Runnable() {
			@Override
			public void run() {
				for (int i = 0; i < 50000000; i++) {
					for (int j = 0; j < 10; j++) {
					
					}
				}
				swipeRefreshLayout.post(new Runnable() {
					@Override
					public void run() {
						swipeRefreshLayout.setRefreshing(false);
					}
				});
			}
		}).start();
	}
	
}

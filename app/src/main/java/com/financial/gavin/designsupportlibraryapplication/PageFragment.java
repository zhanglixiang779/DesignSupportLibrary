package com.financial.gavin.designsupportlibraryapplication;


import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;


public class PageFragment extends Fragment {
	
	public static final String PAGE_NUMBER = "page_number";
	
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
			textView.setText(String.format("fragment %s", String.valueOf(getArguments().getInt(PAGE_NUMBER))));
		}
		
		return view;
	}
	
}

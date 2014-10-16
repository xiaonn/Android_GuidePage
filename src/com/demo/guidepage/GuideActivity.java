package com.demo.guidepage;

import java.util.ArrayList;
import java.util.List;

import android.app.Activity;
import android.os.Bundle;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;

public class GuideActivity extends Activity {

	private ViewPager viewPager;
	private ViewPagerAdapter viewPagerAdapter;
	private List<View> views;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.guide);
		initViewPager();
	}

	private void initViewPager() {
		LayoutInflater inflater = LayoutInflater.from(this);

		views = new ArrayList<View>();
		views.add(inflater.inflate(R.layout.one, null));
		views.add(inflater.inflate(R.layout.two, null));
		viewPagerAdapter = new ViewPagerAdapter(views);
		viewPager = (ViewPager) findViewById(R.id.viewPager);
		viewPager.setAdapter(viewPagerAdapter);
	}
}

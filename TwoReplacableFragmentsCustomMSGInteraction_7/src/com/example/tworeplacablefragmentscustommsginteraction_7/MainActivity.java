package com.example.tworeplacablefragmentscustommsginteraction_7;

import android.os.Bundle;
import android.app.Activity;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.view.Menu;

public class MainActivity extends FragmentActivity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

	public void go() {
		FragmentManager fm = getSupportFragmentManager();
		Fragment second = new SecondFragment();
		FragmentTransaction ft = fm.beginTransaction();
		ft.replace(R.id.FirstFragmentHolder, second);
		ft.commit();
		
		
	}

}

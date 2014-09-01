package com.example.twofragmentscustommsginteraction_6;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.view.Menu;

public class MainActivity extends FragmentActivity {

    FragmentManager fm = getSupportFragmentManager();
	@Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
   
    Fragment one = new FirstFragment();
    FragmentTransaction ft = fm.beginTransaction();
    ft.add(R.id.firstHolder, one);
    ft.commit();
    
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }
    
//    void go(){
//    	Fragment second = new SecondFragment();
//    	FragmentTransaction ft = fm.beginTransaction();
//    	ft.replace(R.id.secondHolder, second);
//    	ft.commit();
//    }
    
}

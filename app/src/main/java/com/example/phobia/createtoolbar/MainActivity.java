package com.example.phobia.createtoolbar;

import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v4.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;

public class MainActivity extends AppCompatActivity {
private BottomNavigationView.OnNavigationItemSelectedListener mOnNavigationItemSelectedListener = new BottomNavigationView.OnNavigationItemSelectedListener() {
    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()) {
            case R.id.ic_home://id form directory menu
                HomeFragment homeFragment = new HomeFragment();//Class fragment
                android.app.FragmentManager manager = getFragmentManager();
                manager.beginTransaction().replace(R.id.Content,homeFragment,homeFragment.getTag()).commit();//id form FrameLayout
                return true;
            case R.id.ic_back:
                return true;
            case R.id.ic_setting:
                return true;
        }
        return false;
    }
};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        BottomNavigationView navigationView = (BottomNavigationView) findViewById(R.id.bottomNavView_bar);//by widget bottomNavView_bar
        navigationView.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener);// form private
    }
}

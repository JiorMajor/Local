package com.chanpyaeaung.local.activity;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;
import android.widget.TextView;

import com.chanpyaeaung.local.R;
import com.chanpyaeaung.local.SuperActivity;
import com.chanpyaeaung.local.view.fragment.ExploreFragment;

public class MainActivity extends SuperActivity {

    private BottomNavigationView.OnNavigationItemSelectedListener mOnNavigationItemSelectedListener
            = new BottomNavigationView.OnNavigationItemSelectedListener() {

        @Override
        public boolean onNavigationItemSelected(@NonNull MenuItem item) {
            switch (item.getItemId()) {
                case R.id.navigation_home:
                    return true;
                case R.id.navigation_dashboard:

                    return true;
                case R.id.navigation_notifications:

                    return true;
                case R.id.nav_explore:
                    getSupportFragmentManager().beginTransaction()
                            .replace(R.id.content, new ExploreFragment())
                            .commit();
                    return true;
                case R.id.nav_favourite:

                    return true;
                case R.id.nav_my_trip:

                    return true;
                case R.id.nav_myprofile:

                    return true;

            }
            return false;
        }

    };



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        BottomNavigationView navigation = (BottomNavigationView) findViewById(R.id.navigation);
        navigation.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener);

        navigation.setSelectedItemId(R.id.nav_explore);
    }

}

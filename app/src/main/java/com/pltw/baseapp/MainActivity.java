package com.pltw.baseapp;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView mTextMessage;

    private BottomNavigationView.OnNavigationItemSelectedListener mOnNavigationItemSelectedListener
            = new BottomNavigationView.OnNavigationItemSelectedListener() {

        @Override
        public boolean onNavigationItemSelected(@NonNull MenuItem item) {
            switch (item.getItemId()) {
                case R.id.navigation_home:
                    mTextMessage.setText(R.string.title_home);
                    return true;
                case R.id.navigation_dashboard:
                    mTextMessage.setText(R.string.title_dashboard);
                    return true;
                case R.id.navigation_notifications:
                    mTextMessage.setText(R.string.title_notifications);
                    return true;
            }
            return false;
        }
    };

    public class ourButtons {

        private int a1;

        public ourButtons(int input) {
            a1 = input;
        }

        public int x() {
            return a1;
        }
    }

    ourButtons suwoo = new ourButtons(1);
    

//    public BottomNavigationView.OnNavigationItemSelectedListener ourButtons
//            = new BottomNavigationView.OnNavigationItemSelectedListener() {
//
//    };


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //mTextMessage = (TextView) findViewById(R.id.message);
        BottomNOavigationView navigation = (BottomNavigationView) findViewById(R.id.navigation);
        navigation.setnNavigationItemSelectedListener(mOnNavigationItemSelectedListener);
    }

}

package com.james.android_uilayouttest;

import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_activity_layout);
        ActionBar actionBar=getSupportActionBar();
        if(actionBar!=null){
            actionBar.hide();//隐藏标题栏
        }
    }
}

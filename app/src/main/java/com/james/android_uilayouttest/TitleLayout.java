package com.james.android_uilayouttest;

import android.app.Activity;
import android.content.Context;
import android.support.v7.widget.LinearLayoutCompat;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.Toast;

import java.util.jar.Attributes;

/**
 * Created by fsuser on 2017-08-18.
 */

public class TitleLayout extends LinearLayout {

    public TitleLayout(Context context, AttributeSet attrs){
        super(context,attrs);
        LayoutInflater.from(context).inflate(R.layout.title,this);
        Button back=(Button)findViewById(R.id.title_back);
        Button edit=(Button)findViewById(R.id.title_edit);
        back.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText((Activity)getContext(),"you click back button",Toast.LENGTH_SHORT).show();
            }
        });
        edit.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText((Activity)getContext(),"you click edit button",Toast.LENGTH_SHORT).show();
            }
        });
    }
}

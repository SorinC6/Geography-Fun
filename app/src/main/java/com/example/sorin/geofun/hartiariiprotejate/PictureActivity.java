package com.example.sorin.geofun.hartiariiprotejate;

import android.os.Bundle;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;

import com.example.sorin.geofun.R;


public class PictureActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
//

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_harti);

        ViewPager viewPager=findViewById(R.id.imageViewHarti);
        ImageAdapter adapter=new ImageAdapter(this);
        viewPager.setAdapter(adapter);
    }
}

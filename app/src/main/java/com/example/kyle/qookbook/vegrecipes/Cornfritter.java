package com.example.kyle.qookbook.vegrecipes;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import com.example.kyle.qookbook.R;


import java.lang.Object;
import java.util.Random;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import com.example.kyle.qookbook.R;


public class Cornfritter extends AppCompatActivity {
    ListView listView ;
    ListView listView2 ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.cornfritters);

    }
}
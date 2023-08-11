package com.github.jaykkumar01.lib1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.github.jaykkumar01.mylibrary1.Toaster;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toaster.show(this);
    }
}
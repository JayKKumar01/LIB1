package com.github.jaykkumar01.mylibrary1;

import android.content.Context;
import android.widget.Toast;

public class Toaster {
    public static void show(Context context){
        Toast.makeText(context, "hi", Toast.LENGTH_SHORT).show();
    }
}

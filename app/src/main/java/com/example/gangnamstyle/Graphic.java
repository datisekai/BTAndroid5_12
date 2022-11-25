package com.example.gangnamstyle;

import android.app.Activity;
import android.os.Bundle;

public class Graphic extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(new GraphicView(this));

    }
}
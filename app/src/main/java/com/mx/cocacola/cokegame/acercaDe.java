package com.mx.cocacola.cokegame;

import android.app.Activity;
import android.content.SharedPreferences;
import android.os.Bundle;

/**
 * Created by delangel on 16/08/17.
 */

public class acercaDe extends Activity {


    @Override
    public void onCreate(Bundle savedInstanceState) {
        SharedPreferences settings;
        // Set Theme According to Settings
        settings = getSharedPreferences("settings", 0);
        if(settings.getInt("theme",0) == 1) setTheme(android.R.style.Theme_Holo);

        super.onCreate(savedInstanceState);
        setContentView(R.layout.acercade);
    }
}

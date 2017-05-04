package com.chanpyaeaung.local;

import android.app.Application;

import uk.co.chrisjenx.calligraphy.CalligraphyConfig;

/**
 * Created by Chan Pyae Aung on 23/4/17.
 */

public class LocalApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        CalligraphyConfig.initDefault(new CalligraphyConfig.Builder()
            .setDefaultFontPath("fonts/Slabo27px-Regular.ttf")
            .setFontAttrId(R.attr.fontPath)
            .build());
    }
}
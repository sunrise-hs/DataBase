package com.example.hanshu.database;

import android.app.Application;

import com.facebook.stetho.Stetho;

/**
 * Created by HanShu on 2016/7/14.
 */
public class MyApplication extends Application {
    public void onCreate() {
        super.onCreate();
        Stetho.initializeWithDefaults(this);
    }
}

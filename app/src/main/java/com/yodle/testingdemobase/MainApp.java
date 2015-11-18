package com.yodle.testingdemobase;

import android.app.Application;

import com.google.gson.Gson;
import com.yodle.testingdemobase.persistence.SharedPrefsDatastore;

public class MainApp extends Application {
    private Gson gson;
    private SharedPrefsDatastore sharedPrefsDatastore;

    @Override
    public void onCreate() {
        super.onCreate();
        gson = new Gson();
        sharedPrefsDatastore = new SharedPrefsDatastore(this, gson);
    }

    public Gson getGson() {
        return gson;
    }

    public SharedPrefsDatastore getSharedPrefsDatastore() {
        return sharedPrefsDatastore;
    }
}

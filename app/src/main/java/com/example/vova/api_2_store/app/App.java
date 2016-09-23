package com.example.vova.api_2_store.app;

import android.app.Application;

/**
 * Created by Vova on 21.09.2016.
 */

public class App extends Application {
    @Override
    public void onCreate() {
        ApiClient.init(this);
        super.onCreate();
    }
}

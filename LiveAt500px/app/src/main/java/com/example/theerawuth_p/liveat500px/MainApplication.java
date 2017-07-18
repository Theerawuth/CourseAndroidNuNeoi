package com.example.theerawuth_p.liveat500px;

import android.app.Application;

import com.example.theerawuth_p.liveat500px.manager.Contextor;

/**
 * Created by theerawuth_p on 7/18/17.
 */

public class MainApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();

        Contextor.getInstance().init(getApplicationContext());

    }

    @Override
    public void onTerminate() {
        super.onTerminate();
    }


}

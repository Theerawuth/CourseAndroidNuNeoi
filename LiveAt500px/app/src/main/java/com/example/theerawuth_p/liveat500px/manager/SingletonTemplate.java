package com.example.theerawuth_p.liveat500px.manager;

import android.content.Context;

/**
 * Created by theerawuth_p on 7/18/17.
 */

public class SingletonTemplate {

    private static SingletonTemplate instance;

    public static  SingletonTemplate getInstance() {
        if (instance == null)
            instance = new SingletonTemplate();
        return instance;
    }

    private Context mContext;

    private SingletonTemplate() {
        mContext = Contextor.getInstance().getContext();
    }

}
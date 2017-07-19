package com.example.theerawuth_p.liveat500px.manager;

import android.content.Context;

import com.example.theerawuth_p.liveat500px.dao.PhotoItemCollectionDao;

/**
 * Created by theerawuth_p on 7/18/17.
 */

public class PhotoListManager {

    private static PhotoListManager instance;

    public static PhotoListManager getInstance() {
        if (instance == null)
            instance = new PhotoListManager();
        return instance;
    }

    private Context mContext;

    private PhotoItemCollectionDao dao;

    private PhotoListManager() {
        mContext = Contextor.getInstance().getContext();
    }

    public PhotoItemCollectionDao getDao() {
        return dao;
    }

    public void setDao(PhotoItemCollectionDao dao) {
        this.dao = dao;
    }

}
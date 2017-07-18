package com.example.theerawuth_p.liveat500px.manager.http;

import com.example.theerawuth_p.liveat500px.dao.PhotoItemCollectionDao;

import retrofit2.Call;
import retrofit2.http.POST;

/**
 * Created by theerawuth_p on 7/18/17.
 */

public interface ApiService {

    @POST("list")
    Call<PhotoItemCollectionDao> loadPhotoList();

}

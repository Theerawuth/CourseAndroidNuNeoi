package com.example.theerawuth_p.liveat500px.dao;

import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * Created by theerawuth_p on 7/18/17.
 */

public class PhotoItemCollectionDao {
    @SerializedName("success")
    private boolean success;
    @SerializedName("data")
    private List<PhotoitemDao> data;

    public boolean isSuccess() {
        return success;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }

    public List<PhotoitemDao> getData() {
        return data;
    }

    public void setData(List<PhotoitemDao> data) {
        this.data = data;
    }
}

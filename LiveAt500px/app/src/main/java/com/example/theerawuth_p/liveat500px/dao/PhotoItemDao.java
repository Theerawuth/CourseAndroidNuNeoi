package com.example.theerawuth_p.liveat500px.dao;

import android.os.Parcel;
import android.os.Parcelable;

import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * Created by theerawuth_p on 7/18/17.
 */

public class PhotoItemDao implements Parcelable {

    @SerializedName("id")
    private int id;
    @SerializedName("link")
    private String link;
    @SerializedName("image_url")
    private String imageUrl;
    @SerializedName("caption")
    private String caption;
    @SerializedName("user_id")
    private Integer userId;
    @SerializedName("username")
    private String username;
    @SerializedName("profile_picture")
    private String profilePicture;
    @SerializedName("tags")
    private List<String> tagList = new ArrayList<>();
    @SerializedName("create_time")
    private Date createTime;
    @SerializedName("camera")
    private String camera;
    @SerializedName("lens")
    private String lens;
    @SerializedName("focal_lenght")
    private String focalLenght;
    @SerializedName("iso")
    private String iso;
    @SerializedName("shutter_speed")
    private String shutterSpeed;
    @SerializedName("aperture")
    private String aperture;

    public PhotoItemDao() {

    }

    protected PhotoItemDao(Parcel in) {
        id = in.readInt();
        link = in.readString();
        imageUrl = in.readString();
        caption = in.readString();
        username = in.readString();
        profilePicture = in.readString();
        tagList = in.createStringArrayList();
        camera = in.readString();
        lens = in.readString();
        focalLenght = in.readString();
        iso = in.readString();
        shutterSpeed = in.readString();
        aperture = in.readString();
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeInt(id);
        dest.writeString(link);
        dest.writeString(imageUrl);
        dest.writeString(caption);
        dest.writeString(username);
        dest.writeString(profilePicture);
        dest.writeStringList(tagList);
        dest.writeString(camera);
        dest.writeString(lens);
        dest.writeString(focalLenght);
        dest.writeString(iso);
        dest.writeString(shutterSpeed);
        dest.writeString(aperture);
    }

    @Override
    public int describeContents() {
        return 0;
    }

    public static final Creator<PhotoItemDao> CREATOR = new Creator<PhotoItemDao>() {
        @Override
        public PhotoItemDao createFromParcel(Parcel in) {
            return new PhotoItemDao(in);
        }

        @Override
        public PhotoItemDao[] newArray(int size) {
            return new PhotoItemDao[size];
        }
    };

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public String getCaption() {
        return caption;
    }

    public void setCaption(String caption) {
        this.caption = caption;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getProfilePicture() {
        return profilePicture;
    }

    public void setProfilePicture(String profilePicture) {
        this.profilePicture = profilePicture;
    }

    public List<String> getTagList() {
        return tagList;
    }

    public void setTagList(List<String> tagList) {
        this.tagList = tagList;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public String getCamera() {
        return camera;
    }

    public void setCamera(String camera) {
        this.camera = camera;
    }

    public String getLens() {
        return lens;
    }

    public void setLens(String lens) {
        this.lens = lens;
    }

    public String getFocalLenght() {
        return focalLenght;
    }

    public void setFocalLenght(String focalLenght) {
        this.focalLenght = focalLenght;
    }

    public String getIso() {
        return iso;
    }

    public void setIso(String iso) {
        this.iso = iso;
    }

    public String getShutterSpeed() {
        return shutterSpeed;
    }

    public void setShutterSpeed(String shutterSpeed) {
        this.shutterSpeed = shutterSpeed;
    }

    public String getAperture() {
        return aperture;
    }

    public void setAperture(String aperture) {
        this.aperture = aperture;
    }
}

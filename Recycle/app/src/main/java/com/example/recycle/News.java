package com.example.recycle;

import android.media.Image;
import android.os.Parcel;
import android.os.Parcelable;

import androidx.annotation.NonNull;

import java.util.ArrayList;

public class News extends ArrayList<News> implements Parcelable {

    private int mainImage;

    private int group;
    private String groupName;
    private String date;
    private String theme0;
    private String detail;
    private String shareCount;
    private String likeCount;
    private String viewsCount;
    private String commentsCount;
    private static Image share;
    private static Image views;
    private static Image likes;
    private static Image comments;
    private static Image just;

    protected News(Parcel in) {
        mainImage = in.readInt();
        group = in.readInt();
        groupName = in.readString();
        date = in.readString();
        theme0 = in.readString();
        shareCount = in.readString();
        likeCount = in.readString();
        viewsCount = in.readString();
        commentsCount = in.readString();
        detail = in.readString();
    }

    public static final Creator<News> CREATOR = new Creator<News>() {
        @Override
        public News createFromParcel(Parcel in) {
            return new News(in);
        }

        @Override
        public News[] newArray(int size) {
            return new News[size];
        }
    };


    public String getDetail() {
        return detail;
    }

    public void setDetail(String detail) {
        this.detail = detail;
    }


    public int getMainImage() {
        return mainImage;
    }

    public void setMainImage(int mainImage) {
        this.mainImage = mainImage;
    }



    public int getGroup() {
        return group;
    }

    public  void setGroup(int group) {
        this.group = group;
    }

    public String getGroupName() {
        return groupName;
    }

    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }

    public String getShareCount() {
        return shareCount;
    }

    public void setShareCount(String shareCount) {
        this.shareCount = shareCount;
    }



    public String getTheme0() {
        return theme0;
    }

    public void setTheme0(String theme0) {
        this.theme0 = theme0;
    }

    public String getViewsCount() {
        return viewsCount;
    }

    public void setViewsCount(String viewsCount) {
        this.viewsCount = viewsCount;
    }

    public String getLikeCount() {
        return likeCount;
    }

    public void setLikeCount(String likeCount) {
        this.likeCount = likeCount;
    }





    public String getCommentsCount() {
        return commentsCount;
    }

    public void setCommentsCount(String commentsCount) {
        this.commentsCount = commentsCount;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }





    public News(String groupName,
                String date,
                String theme0,
                String shareCount,
                String likeCount,
                String viewsCount,
                String commentsCount,

                int group,
                int mainImage,
                String detail) {
        this.commentsCount = commentsCount;
        this.date = date;
        this.detail = detail;
        this.groupName = groupName;
        this.likeCount = likeCount;
        this.shareCount = shareCount;
        this.theme0 = theme0;
        this.group = group;
        this.mainImage = mainImage;
        this.viewsCount = viewsCount;
    }


    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeInt(mainImage);
        dest.writeInt(group);
        dest.writeString(groupName);
        dest.writeString(date);
        dest.writeString(theme0);
        dest.writeString(shareCount);
        dest.writeString(likeCount);
        dest.writeString(viewsCount);
        dest.writeString(commentsCount);
        dest.writeString(detail);
    }




}

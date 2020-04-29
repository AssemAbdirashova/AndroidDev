package com.example.recycle;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toolbar;


public class NewsDetailActivity extends AppCompatActivity {
    @Nullable
    private TextView tvNewsDetail;
    private TextView groupName;
    private TextView date;
    private TextView theme0;
    private TextView likeCount;
    private TextView commentCount;
    private TextView shareCount;
    private TextView viewCount;
    private ImageView group;
    private ImageView mainImage;
    private ImageButton like;
    private ImageButton back;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_news_detail);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        tvNewsDetail = findViewById(R.id.theme);
        like =findViewById(R.id.likes);
        group = findViewById(R.id.group);
        mainImage = findViewById(R.id.mainImage);
        groupName = findViewById(R.id.groupName);
        date = findViewById(R.id.date);
        likeCount = findViewById(R.id.likeCount);
        commentCount = findViewById(R.id.commentsCount);
        shareCount = findViewById(R.id.shareCount);
        viewCount = findViewById(R.id.viewsCount);




        News news = (News) getIntent().getParcelableExtra("news");
        tvNewsDetail.setText(news.getDetail());
        likeCount.setText(news.getLikeCount());
        commentCount.setText(news.getCommentsCount());
        shareCount.setText(news.getShareCount());
        viewCount.setText(news.getViewsCount());
        date.setText(news.getDate());
        groupName.setText(news.getGroupName());
        group.setImageResource(news.getGroup());
        mainImage.setImageResource(news.getMainImage());



    }
}
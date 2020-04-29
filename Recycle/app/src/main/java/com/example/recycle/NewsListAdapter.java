package com.example.recycle;

import android.content.Context;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;


import android.widget.ImageView;
import android.widget.Toast;

public class NewsListAdapter extends RecyclerView.Adapter<NewsListAdapter.NewsViewHolder > {

    private List<News> newsList;

    @Nullable
    Context context;
    private ItemClickListener listener;
    private String what;

    public NewsListAdapter(List<News> newsList, @Nullable ItemClickListener listener, Context context, String what) {
        this.what = what;
        this.newsList = newsList;
        this.listener = listener;
        this.context = context;
    }

    @NonNull
    @Override
    public NewsViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.news, null, false);

//        RecyclerView.LayoutParams params = new RecyclerView.LayoutParams(
//                ViewGroup.LayoutParams.MATCH_PARENT,
//                ViewGroup.LayoutParams.WRAP_CONTENT
//        );
//        view.setLayoutParams(params);
        return new NewsViewHolder(view);
    }


    @Override
    public void onBindViewHolder(@NonNull NewsViewHolder holder, final int position) {
        final News news = newsList.get(position);
        holder.likeCount.setText(news.getLikeCount());
        holder.commentCount.setText(news.getCommentsCount());
        holder.shareCount.setText(news.getShareCount());
        holder.viewCount.setText(news.getViewsCount());
        holder.theme0.setText(news.getTheme0());
        holder.date.setText(news.getDate());
        holder.groupName.setText(news.getGroupName());
        holder.group.setImageResource(news.getGroup());
        holder.mainImage.setImageResource(news.getMainImage());
        //holder.textView.setText(news.getDetail());
        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (listener != null) {
                    listener.itemClick(position, news);
                }
            }
        });
        holder.like.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Toast.makeText(context, "You added this news", Toast.LENGTH_LONG).show();
            }
        });

    }

    @Override
    public int getItemCount() {
        return newsList.size();
    }

    public class NewsViewHolder extends RecyclerView.ViewHolder {
        TextView groupName;
        TextView date;
        TextView theme0;
        TextView likeCount;
        TextView commentCount;
        TextView shareCount;
        TextView viewCount;
        ImageView group;
        ImageView mainImage;
        ImageButton like;

        public NewsViewHolder(@NonNull View itemView) {
            super(itemView);

            like = itemView.findViewById(R.id.likes);
            group = itemView.findViewById(R.id.group);
            mainImage = itemView.findViewById(R.id.mainImage);
            groupName = itemView.findViewById(R.id.groupName);
            date = itemView.findViewById(R.id.date);
            theme0 = itemView.findViewById(R.id.theme);
            likeCount = itemView.findViewById(R.id.likeCount);
            commentCount = itemView.findViewById(R.id.commentsCount);
            shareCount = itemView.findViewById(R.id.shareCount);
            viewCount = itemView.findViewById(R.id.viewsCount);
        }
    }

    interface ItemClickListener {
        void itemClick(int position, News item);
    }
}


//    RecyclerView.LayoutParams params = new RecyclerView.LayoutParams(
//            ViewGroup.LayoutParams.MATCH_PARENT,
//            ViewGroup.LayoutParams.WRAP_CONTENT
//    );
//


package com.example.flixster.adapter;

import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class MovieAdapter {

    public class ViewHolder extends RecyclerView.ViewHolder{
        TextView tvTitle;
        TextView tvOverview;
        ImageView ivPoster;
        public ViewHolder(NonNull View itemView){
            super(itemView);
        }
    }
}

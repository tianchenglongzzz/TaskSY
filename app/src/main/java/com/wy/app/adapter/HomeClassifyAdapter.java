package com.wy.app.adapter;

import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class HomeClassifyAdapter extends RecyclerView.Adapter {

    private int[]url;

    public HomeClassifyAdapter(int[] url) {
         this.url=url;

    }

    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return null;
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 0;
    }

    private class ViewHoder  extends RecyclerView.ViewHolder {

        public ViewHoder(@NonNull View itemView) {
            super(itemView);
        }
    }



}

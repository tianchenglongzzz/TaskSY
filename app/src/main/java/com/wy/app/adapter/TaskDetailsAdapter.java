package com.wy.app.adapter;

import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;
import com.chad.library.adapter.base.BaseQuickAdapter;
import com.chad.library.adapter.base.BaseViewHolder;
import com.wy.app.R;
import com.wy.app.bean.NewTaskBean;
import com.wy.app.util.Utils;

import java.util.List;

public class TaskDetailsAdapter extends BaseQuickAdapter <NewTaskBean,BaseViewHolder>{
    public TaskDetailsAdapter(int layoutResId, @Nullable List data) {
        super(layoutResId, data);
    }


    @Override
    protected void convert(BaseViewHolder helper, NewTaskBean item) {
            RecyclerView recyclerView =  helper.getView(R.id.rv);
            recyclerView.setLayoutManager(new GridLayoutManager(mContext,3));
            recyclerView.setAdapter(new ImgAdapter(R.layout.rv_img_item,item.getImgs()));


    }
   private class ImgAdapter extends BaseQuickAdapter<String,BaseViewHolder>{

       public ImgAdapter(int layoutResId, @Nullable List<String> data) {
           super(layoutResId, data);
       }

       @Override
       protected void convert(BaseViewHolder helper, String item) {
           ImageView imageView=helper.getView(R.id.img_header);
           RequestOptions options = Utils.getOptions(helper.getView(R.id.img_header));
           Glide.with(mContext).load(item).apply(options).into(imageView);
       }
   }
}

package com.wy.app.adapter;

import android.view.View;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.load.resource.bitmap.RoundedCorners;
import com.bumptech.glide.request.RequestOptions;
import com.chad.library.adapter.base.BaseQuickAdapter;
import com.chad.library.adapter.base.BaseViewHolder;
import com.lc.myretrofit.http.Constants;
import com.wy.app.R;
import com.wy.app.util.Utils;

import java.util.List;

public class TaskAdapter extends BaseQuickAdapter {
    public TaskAdapter(int layoutResId, @Nullable List data) {
        super(layoutResId, data);
    }

    @Override
    protected void convert(BaseViewHolder helper, Object item) {
        ImageView view = helper.getView(R.id.img_header);
        //设置图片圆角角度
        RoundedCorners roundedCorners = new RoundedCorners(10);
        //通过RequestOptions扩展功能
        RequestOptions options = Utils.getOptions(view).bitmapTransform(roundedCorners);
        Glide.with(mContext).load(item).apply(options).into(view);

    }



}

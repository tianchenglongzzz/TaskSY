package com.wy.app.adapter;

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
import com.wy.app.bean.TaskReleaseBean;
import com.wy.app.util.Utils;

import java.util.List;

public class HomeAdapter extends BaseQuickAdapter <TaskReleaseBean.DataBeanX.DataBean,BaseViewHolder> {


    public HomeAdapter(int layoutResId, @Nullable List data) {
        super(layoutResId, data);
    }

    @Override
    protected void convert(BaseViewHolder helper, TaskReleaseBean.DataBeanX.DataBean item) {
         ImageView imageView= helper.getView(R.id.img_header);
        RoundedCorners roundedCorners = new RoundedCorners(10);
        RequestOptions options = Utils.getOptions(imageView).bitmapTransform(roundedCorners);
        Glide.with(mContext).load(Constants.HOST+item.getImage()).apply(options).into(imageView);
       helper.setText(R.id.tv_title,item.getTitle());
       helper.setText(R.id.tv_money,"赏"+item.getPrice()+"元");
       helper.setText(R.id.tv_zhuanqianren,item.getNum()+"人以赚");
       helper.setText(R.id.tv_shengyuren,"剩余"+(item.getZong_num()-item.getNum())+"人");

    }
}

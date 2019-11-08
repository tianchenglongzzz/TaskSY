package com.wy.app.adapter;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.RecyclerView;

import com.chad.library.adapter.base.BaseQuickAdapter;
import com.chad.library.adapter.base.BaseViewHolder;
import com.wy.app.R;

import java.util.List;

public class PaiHangAdapter extends BaseQuickAdapter {
    public PaiHangAdapter(int layoutResId, @Nullable List data) {
        super(layoutResId, data);
    }

    @Override
    protected void convert(BaseViewHolder helper, Object item) {
        int position = helper.getPosition();
        if (position<3){
             helper.setVisible(R.id.img_cont,true);
            helper.setVisible(R.id.tv_cont,false);
             if (position==0){
                 helper.setImageResource(R.id.img_cont,R.mipmap.one);
             }
             if (position==1){
                 helper.setImageResource(R.id.img_cont,R.mipmap.tow);
             }
             if (position==2){
                 helper.setImageResource(R.id.img_cont,R.mipmap.three);
             }
        }else {
            helper.setVisible(R.id.img_cont,false);
            helper.setVisible(R.id.tv_cont,true);
            helper.setText(R.id.tv_cont,position+1+"");
        }
    }


}

package com.wy.app.adapter;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.RecyclerView;

import com.chad.library.adapter.base.BaseQuickAdapter;
import com.chad.library.adapter.base.BaseViewHolder;
import com.wy.app.R;

import java.util.List;

public class ReportAdapter extends BaseQuickAdapter {
    public ReportAdapter(int layoutResId, @Nullable List data) {
        super(layoutResId, data);
    }

    @Override
    protected void convert(BaseViewHolder helper, Object item) {
        int size = getData().size();
        if (helper.getPosition()==size-1){
            helper.setVisible(R.id.v_1,false);
        }else {
            helper.setVisible(R.id.v_1,true);
        }
    }


}

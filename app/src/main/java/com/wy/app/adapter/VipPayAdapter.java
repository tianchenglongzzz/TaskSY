package com.wy.app.adapter;

import com.chad.library.adapter.base.BaseQuickAdapter;
import com.chad.library.adapter.base.BaseViewHolder;
import com.wy.app.R;

import java.util.List;

import io.reactivex.annotations.Nullable;

public class VipPayAdapter extends BaseQuickAdapter {
        //当前点击的是哪条条目
        private   int clicp=0;
        //第一次初始化
        private   boolean is=true;

    public int getClicp() {
        return clicp;
    }

    public void setClicp(int clicp) {
        this.clicp = clicp;
    }

    public boolean isIs() {
        return is;
    }

    public void setIs(boolean is) {
        this.is = is;
    }

    public VipPayAdapter(int layoutResId, @Nullable List data) {
            super(layoutResId, data);
        }

        @Override
        protected void convert(BaseViewHolder helper, Object item) {


               if (is){
                   if (helper.getPosition()==0) {
                       helper.setVisible(R.id.rl_a, true);
                       helper.setVisible(R.id.rl_b, false);
                   }else {
                       helper.setVisible(R.id.rl_a,false);
                       helper.setVisible(R.id.rl_b,true);
                   }

                   return;
               }
                 if (helper.getPosition()==clicp){
                       helper.setVisible(R.id.rl_a,true);
                     helper.setVisible(R.id.rl_b,false);

                 }else {
                     helper.setVisible(R.id.rl_a,false);
                     helper.setVisible(R.id.rl_b,true);
                 }

        }

    
        
    } 
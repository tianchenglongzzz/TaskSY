package com.wy.app.ui.activity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.wy.app.R;
import com.wy.app.base.BaseActivity;
import com.wy.app.base.BasePresenter;
import com.wy.app.base.IBaseView;

import butterknife.BindView;

/*
* 充值页面
*
* */
public class RechargeActivity extends BaseActivity {
   @BindView(R.id.img_msg)
   ImageView imagview;
   @BindView(R.id.img_yuan_dian)
   ImageView img_yuan_dian;
    @Override
    public int setViewId() {
        return R.layout.activity_recharge;
    }

    @Override
    public BasePresenter getPresenter() {
        return null;
    }

    @Override
    public void showLoading() {

    }

    @Override
    public void dismissLoading() {

    }

    @Override
    public void init(Bundle savedInstanceState) {
        imagview.setVisibility(View.GONE);
        img_yuan_dian.setVisibility(View.GONE);
    }

    @Override
    public Context getContext() {
        return this;
    }

    @Override
    public void initData() {

    }
}

package com.wy.app.ui.activity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.jaeger.library.StatusBarUtil;
import com.wy.app.R;
import com.wy.app.base.BaseActivity;
import com.wy.app.base.BasePresenter;

import butterknife.BindView;
import butterknife.OnClick;

public class VipActivity extends BaseActivity {


    @Override
    public int setViewId() {
        return R.layout.activity_vip;
    }

    @Override
    public BasePresenter getPresenter() {
        return null;
    }

    @Override
    public void showLoading() {

    }
   @OnClick({R.id.tv_pay})
   public  void onClick(View view){
        switch (view.getId()){
            case R.id.tv_pay:
                startActivity(new Intent(this,VipPayActivity.class));
                break;

        }

   }
    @Override
    public void dismissLoading() {

    }

    @Override
    public void init(Bundle savedInstanceState) {

    }

    @Override
    public Context getContext() {
        return null;
    }

    @Override
    public void initData() {

    }

    @Override
    public void setBar() {
        super.setBar();
        StatusBarUtil.setTransparent(this);
    }
}

package com.wy.app.ui.activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.androidkun.xtablayout.XTabLayout;
import com.wy.app.R;
import com.wy.app.base.BaseActivity;
import com.wy.app.imvp.RegisterContract;
import com.wy.app.presenter.RegisterPresenter;

import butterknife.BindView;
import butterknife.OnClick;

public class RegisterActivity extends BaseActivity<RegisterPresenter> implements RegisterContract.View {



    @Override
    public int setViewId() {
        return R.layout.activity_register;
    }

    @Override
    public RegisterPresenter getPresenter() {
        return new RegisterPresenter();
    }

    @Override
    public void register() {

    }

    @Override
    public void showLoading() {

    }
    @OnClick({R.id.img_return})
    public  void onClick(View view){
        switch (view.getId()){
            case R.id.img_return:
                finish();
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
        return this;
    }

    @Override
    public void initData() {

    }
}

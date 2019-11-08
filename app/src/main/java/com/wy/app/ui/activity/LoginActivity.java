package com.wy.app.ui.activity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.wy.app.MainActivity;
import com.wy.app.R;
import com.wy.app.base.BaseActivity;
import com.wy.app.imvp.LoginContract;
import com.wy.app.presenter.LoginPresenter;

import butterknife.OnClick;

public class LoginActivity extends BaseActivity<LoginPresenter> implements LoginContract.View {


    @Override
    public int setViewId() {
        return R.layout.activity_login;
    }
    @Override
    public void init(Bundle savedInstanceState) {

    }
    @Override
    public LoginPresenter getPresenter() {
        return new LoginPresenter();
    }

    @Override
    public void showLoading() {

    }

    @Override
    public void dismissLoading() {

    }

    @OnClick({R.id.img_return,R.id.tv_register
    ,R.id.btn_login})
    public  void onClick(View view){
        switch (view.getId()){
            case R.id.img_return:
                finish();
                break;
            case R.id.tv_register:
                startActivity(new Intent(this,RegisterActivity.class));
                break;
            case R.id.btn_login:
                startActivity(new Intent(this, MainActivity.class));
                break;
        }
    }

    @Override
    public Context getContext() {
        return this;
    }

    @Override
    public void initData() {

    }


    @Override
    public void login() {

    }
}

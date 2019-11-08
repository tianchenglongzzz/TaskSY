package com.wy.app.ui.activity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;

import com.wy.app.R;
import com.wy.app.base.BaseActivity;
import com.wy.app.base.BasePresenter;

public class MsgActivity extends BaseActivity {

    @Override
    public int setViewId() {
        return R.layout.activity_msg;
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

    }

    @Override
    public Context getContext() {
        return null;
    }

    @Override
    public void initData() {

    }
}

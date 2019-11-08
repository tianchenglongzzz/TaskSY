package com.wy.app.ui.activity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.view.View;

import com.wy.app.R;
import com.wy.app.base.BaseActivity;
import com.wy.app.base.BasePresenter;
import com.wy.app.ui.BalanceDialog;

import butterknife.OnClick;

public class BalanceActivity extends BaseActivity {

    @OnClick({R.id.btn_lijitixian})
    public void onClick(View view){
        BalanceDialog balanceDialog = new BalanceDialog();
        balanceDialog.show(getSupportFragmentManager(),"");
    }
    @Override
    public int setViewId() {
        return R.layout.activity_balance;
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
        return this;
    }

    @Override
    public void initData() {

    }
}

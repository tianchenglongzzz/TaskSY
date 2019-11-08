package com.wy.app.ui.activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.androidkun.xtablayout.XTabLayout;
import com.jaeger.library.StatusBarUtil;
import com.wy.app.R;
import com.wy.app.adapter.PaiHangAdapter;
import com.wy.app.base.BaseActivity;
import com.wy.app.base.BasePresenter;

import java.util.ArrayList;

import butterknife.BindView;
import butterknife.OnClick;

public class RankingActivity extends BaseActivity {
    @BindView(R.id.tab)
    XTabLayout mxTabLayout;
    @BindView(R.id.rv)
    RecyclerView mRv;

    @Override
    public int setViewId() {
        return R.layout.activity_ranking;
    }

    @Override
    public BasePresenter getPresenter() {
        return null;
    }


    @Override
    public void setBar() {
        super.setBar();
        StatusBarUtil.setTranslucent(this);
    }

    @Override
    public void showLoading() {

    }

    @Override
    public void dismissLoading() {

    }

    @Override
    public void init(Bundle savedInstanceState) {

        XTabLayout.Tab taba = mxTabLayout.newTab();
        taba.setText("接单榜");
        mxTabLayout.addTab(taba);
        XTabLayout.Tab tab = mxTabLayout.newTab();
        tab.setText("推广榜");
        mxTabLayout.addTab(tab);
        ArrayList<String> strings = new ArrayList<>();
        for (int i = 0; i <6 ; i++) {
            strings.add("");
        }
        PaiHangAdapter paiHangAdapter = new PaiHangAdapter(R.layout.rv_item_paihang, strings);
        mRv.setLayoutManager(new LinearLayoutManager(this));
        mRv.addItemDecoration(new DividerItemDecoration(this,DividerItemDecoration.VERTICAL));
        mRv.setAdapter(paiHangAdapter);
    }

    @OnClick({R.id.goback})
    public  void onClick(View view){
        switch (view.getId()){
            case R.id.goback:
                 finish();
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
}

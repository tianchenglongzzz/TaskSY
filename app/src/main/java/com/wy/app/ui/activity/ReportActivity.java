package com.wy.app.ui.activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.RadioGroup;

import com.jaeger.library.StatusBarUtil;
import com.wy.app.R;
import com.wy.app.adapter.ReportAdapter;
import com.wy.app.base.BaseActivity;
import com.wy.app.base.BasePresenter;

import java.util.ArrayList;

import butterknife.BindView;

public class ReportActivity extends BaseActivity {

  @BindView(R.id.rv)
    RecyclerView mRv;
  @BindView(R.id.img_msg)
    ImageView mMsg;
  @BindView(R.id.rg)
    RadioGroup radioGroup;
/*  @BindView(R.id.img_yuan_dian)
  ImageView mYuanDian;*/
    @Override
    public int setViewId() {
        return R.layout.activity_report;
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
        radioGroup.check(R.id.rb_a);
        StatusBarUtil.setColorNoTranslucent(this,0xffff);
        mMsg.setVisibility(View.GONE);
       /* mYuanDian.setVisibility(View.GONE);*/
        ArrayList<String> strings = new ArrayList<>();
        for (int i = 0; i <20 ; i++) {
            strings.add("");
        }
        ReportAdapter reportAdapter = new ReportAdapter(R.layout.rv_item_weiquan, strings);
        mRv.setLayoutManager(new LinearLayoutManager(this));
        mRv.setAdapter(reportAdapter);
    }

    @Override
    public Context getContext() {
        return null;
    }

    @Override
    public void initData() {

    }
}

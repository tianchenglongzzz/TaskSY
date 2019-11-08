package com.wy.app.ui.activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Context;
import android.os.Bundle;
import android.widget.TextView;

import com.wy.app.R;
import com.wy.app.adapter.EarningsAdapter;
import com.wy.app.base.BaseActivity;
import com.wy.app.base.BasePresenter;

import java.util.ArrayList;

import butterknife.BindView;

public class EarningsActivity extends BaseActivity {
   @BindView(R.id.rv)
    RecyclerView mrv;
   @BindView(R.id.acton_title)
    TextView textView;


    @Override
    public int setViewId() {
        return R.layout.activity_earnings;
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
         textView.setText("收益明细");
    }

    @Override
    public Context getContext() {
        return null;
    }

    @Override
    public void initData() {
        ArrayList<String> strings = new ArrayList<>();
        for (int i = 0; i <10 ; i++) {
            strings.add("");
        }
        EarningsAdapter earningsAdapter = new EarningsAdapter(R.layout.rv_item_earnings, strings);
        mrv.setLayoutManager(new LinearLayoutManager(this));
        mrv.setAdapter(earningsAdapter);
    }
}

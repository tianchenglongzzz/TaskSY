package com.wy.app.ui.activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Context;
import android.os.Bundle;
import android.view.View;

import com.chad.library.adapter.base.BaseQuickAdapter;
import com.jaeger.library.StatusBarUtil;
import com.wy.app.R;
import com.wy.app.adapter.GoodRefreshAdapter;
import com.wy.app.adapter.VipPayAdapter;
import com.wy.app.base.BaseActivity;
import com.wy.app.base.BasePresenter;

import java.util.ArrayList;

import butterknife.BindView;

public class VipPayActivity extends BaseActivity {


    private VipPayAdapter vipPayAdapter;
    @BindView(R.id.rv)
    RecyclerView mRv;
    @Override
    public int setViewId() {
        return R.layout.activity_vip_pay;
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
        ArrayList<String> strings = new ArrayList<>();
        for (int i = 0; i <3 ; i++) {
            strings.add("我我我我我");
        }
        vipPayAdapter = new VipPayAdapter(R.layout.rv_vip_item, strings);
        mRv.setLayoutManager(new LinearLayoutManager(this));
        mRv.setAdapter(vipPayAdapter);
        vipPayAdapter.setOnItemClickListener(new BaseQuickAdapter.OnItemClickListener() {
            @Override
            public void onItemClick(BaseQuickAdapter adapter, View view, int position) {
                vipPayAdapter.setClicp(position);
                vipPayAdapter.setIs(false);
                vipPayAdapter.notifyDataSetChanged();
            }
        });
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

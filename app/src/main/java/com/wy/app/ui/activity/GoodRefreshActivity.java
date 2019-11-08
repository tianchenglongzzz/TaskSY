package com.wy.app.ui.activity;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.chad.library.adapter.base.BaseQuickAdapter;
import com.chad.library.adapter.base.BaseViewHolder;
import com.wy.app.R;
import com.wy.app.adapter.GoodRefreshAdapter;
import com.wy.app.base.BaseActivity;
import com.wy.app.base.BasePresenter;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;

public class GoodRefreshActivity extends BaseActivity {

    @BindView(R.id.acton_title)
    TextView title;
    @BindView(R.id.img_msg)
    ImageView img;
    @BindView(R.id.rv)
    RecyclerView mrv;
    private GoodRefreshAdapter goodRefreshAdapter;

    @Override
    public int setViewId() {
        return R.layout.activity_good_refresh;
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
        title.setText("购买刷新");
        img.setVisibility(View.GONE);
    }

    @Override
    public Context getContext() {
        return this;
    }

    @Override
    public void initData() {
        ArrayList<String> strings = new ArrayList<>();
        for (int i = 0; i <10 ; i++) {
            strings.add("我我我我我");
        }
        goodRefreshAdapter = new GoodRefreshAdapter(R.layout.rv_refresh_item, strings);
        mrv.setLayoutManager(new LinearLayoutManager(this));
        mrv.setAdapter(goodRefreshAdapter);
        goodRefreshAdapter.setOnItemClickListener(new BaseQuickAdapter.OnItemClickListener() {
            @Override
            public void onItemClick(BaseQuickAdapter adapter, View view, int position) {
                  goodRefreshAdapter.setClicp(position);
                  goodRefreshAdapter.setIs(false);
                  goodRefreshAdapter.notifyDataSetChanged();
             }
        });

    }



}

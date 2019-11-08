package com.wy.app.ui.activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.wy.app.R;
import com.wy.app.adapter.BlackListAdapterAdapter;
import com.wy.app.adapter.TaskDetailsAdapter;
import com.wy.app.base.BaseActivity;
import com.wy.app.base.BasePresenter;
import com.wy.app.bean.NewTaskBean;

import java.util.ArrayList;

import butterknife.BindView;

public class BlackListActivity extends BaseActivity {

    @BindView(R.id.acton_title)
    TextView title;
    @BindView(R.id.img_msg)
    ImageView img;
    @BindView(R.id.rv)
    RecyclerView mrv;

    @Override
    public int setViewId() {
        return R.layout.activity_black_list;
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
        title.setText("订单详情");
        img.setVisibility(View.GONE);
        ArrayList<String> items = new ArrayList<>();
        for (int i = 0; i <10 ; i++) {
            items.add("");
        }
        BlackListAdapterAdapter blackListAdapterAdapter = new BlackListAdapterAdapter(R.layout.rv_hmd_item, items);
        mrv.setLayoutManager(new LinearLayoutManager(this));
        mrv.setAdapter(blackListAdapterAdapter);
    }
}

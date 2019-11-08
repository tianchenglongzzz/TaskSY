package com.wy.app.ui.activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.androidkun.xtablayout.XTabLayout;
import com.wy.app.R;
import com.wy.app.adapter.TaskAdapter;
import com.wy.app.adapter.TaskMangeAdapter;
import com.wy.app.base.BaseActivity;
import com.wy.app.base.BasePresenter;

import java.util.ArrayList;

import butterknife.BindView;
import butterknife.OnClick;

public class TaskManageActivity extends BaseActivity {

    @BindView(R.id.acton_title)
    TextView title;
    @BindView(R.id.img_msg)
    ImageView img;
    @BindView(R.id.xtab)
    XTabLayout xTabLayout;
    @BindView(R.id.rv)
    RecyclerView mrv;
    @Override
    public int setViewId() {
        return R.layout.activity_task_manage;
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
        title.setText("管理任务");
        img.setVisibility(View.GONE);
        xTabLayout.removeAllTabs();
        XTabLayout.Tab taba = xTabLayout.newTab();

        taba.setText("未上线");
        XTabLayout.Tab tabb = xTabLayout.newTab();
        tabb.setText("进行中");
        XTabLayout.Tab tab = xTabLayout.newTab();
        tab.setText("以结束");
        xTabLayout.addTab(taba);
        xTabLayout.addTab(tabb);
        xTabLayout.addTab(tab);
        ArrayList<String> strings = new ArrayList<>();
        for (int i = 0; i <10 ; i++) {
            strings.add("http://i0.hdslb.com/bfs/article/a8744a615dedf9faeb9f7cc51192635de8a1abeb.jpg");
        }
        TaskMangeAdapter taskAdapter = new TaskMangeAdapter(R.layout.layout_manger_rv, strings);
        mrv.setLayoutManager(new LinearLayoutManager(getContext()));
    //    mrv.addItemDecoration(new DividerItemDecoration(getContext(),DividerItemDecoration.VERTICAL));
        mrv.setAdapter(taskAdapter);
    }

    @Override
    public Context getContext() {
        return null;
    }

    @Override
    public void initData() {

    }
    @OnClick({R.id.tv_fab})
    public  void onClick(View view){
        switch (view.getId()){
            case R.id.tv_fab:
                startActivity(new Intent(this,NewTaskActivity.class));
                break;
        }

    }
}

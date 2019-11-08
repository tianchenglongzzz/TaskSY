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
import com.wy.app.adapter.TaskAdapter;
import com.wy.app.adapter.TaskDetailsAdapter;
import com.wy.app.base.BaseActivity;
import com.wy.app.base.BasePresenter;
import com.wy.app.bean.NewTaskBean;

import java.util.ArrayList;

import butterknife.BindView;

public class TaskDetailsActivity extends BaseActivity {

   @BindView(R.id.acton_title)
    TextView title;
    @BindView(R.id.img_msg)
    ImageView img;
    @BindView(R.id.rv)
    RecyclerView mrv;
    @Override
    public int setViewId() {
        return R.layout.activity_task_details;
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
          title.setText("订单详情");
          img.setVisibility(View.GONE);
        ArrayList<NewTaskBean> newTaskBeans = new ArrayList<>();
        ArrayList<String> pathch = new ArrayList<>();
        pathch.add("https://c-ssl.duitang.com/uploads/item/201504/16/20150416H5521_K5mJs.thumb.700_0.jpeg");
        newTaskBeans.add(new NewTaskBean("","",pathch,new ArrayList<>()));
        TaskDetailsAdapter taskAdapter = new TaskDetailsAdapter(R.layout.rv_task_details, newTaskBeans);
        mrv.setLayoutManager(new LinearLayoutManager(this));
        mrv.setAdapter(taskAdapter);
    }

    @Override
    public Context getContext() {
        return this;
    }

    @Override
    public void initData() {

    }
}

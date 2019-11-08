package com.wy.app.ui.fragement;


import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.androidkun.xtablayout.XTabLayout;
import com.chad.library.adapter.base.BaseQuickAdapter;
import com.wy.app.R;
import com.wy.app.adapter.TaskAdapter;
import com.wy.app.base.BaseFragment;
import com.wy.app.base.BasePresenter;
import com.wy.app.ui.activity.TaskDetailsActivity;

import java.util.ArrayList;

import butterknife.BindView;

/**
 * A simple {@link Fragment} subclass.
 */
public class TaskFragment extends BaseFragment {
@BindView(R.id.acton_title)
TextView acton_title;
      @BindView(R.id.xtab)
    XTabLayout xTabLayout;
      @BindView(R.id.rv)
    RecyclerView mrv;
    @Override
    public int setViewId() {
        return R.layout.fragment_task;
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
        XTabLayout.Tab tabtijiao = xTabLayout.newTab();
        tabtijiao.setText("未提交");
        xTabLayout.addTab(tabtijiao);
        XTabLayout.Tab tabshenhe = xTabLayout.newTab();
        tabshenhe.setText("审核中");
        xTabLayout.addTab(tabshenhe);
        XTabLayout.Tab tabweitongguo = xTabLayout.newTab();
        tabweitongguo.setText("未通过");
        xTabLayout.addTab(tabweitongguo);
        XTabLayout.Tab yitongguo = xTabLayout.newTab();
        yitongguo.setText("以通过");
        xTabLayout.addTab(yitongguo);
        acton_title.setText("任务袋");
        ArrayList<String> strings = new ArrayList<>();
        for (int i = 0; i <10 ; i++) {
            strings.add("http://i0.hdslb.com/bfs/article/a8744a615dedf9faeb9f7cc51192635de8a1abeb.jpg");
        }
        TaskAdapter taskAdapter = new TaskAdapter(R.layout.layout_rv_my_task, strings);
        mrv.setLayoutManager(new LinearLayoutManager(getContext()));
        mrv.addItemDecoration(new DividerItemDecoration(getContext(),DividerItemDecoration.VERTICAL));
        mrv.setAdapter(taskAdapter);
        taskAdapter.setOnItemClickListener(new BaseQuickAdapter.OnItemClickListener() {
            @Override
            public void onItemClick(BaseQuickAdapter adapter, View view, int position) {
                  getContext().  startActivity(new Intent(getContext(), TaskDetailsActivity.class));
            }
        });
    }

    @Override
    public void initData() {

    }
}

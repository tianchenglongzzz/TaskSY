package com.wy.app.ui.activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Context;
import android.os.Bundle;

import com.wy.app.R;
import com.wy.app.adapter.UserAdapter;
import com.wy.app.base.BaseActivity;
import com.wy.app.base.BasePresenter;

import java.util.ArrayList;

import butterknife.BindView;

public class UserActivity extends BaseActivity {
   @BindView(R.id.rv)
    RecyclerView mrv;
    private UserAdapter userAdapter;


    @Override
    public int setViewId() {
        return R.layout.activity_user;
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
        ArrayList<String> strings = new ArrayList<>();
        strings.add("");
        strings.add("");
        userAdapter = new UserAdapter(R.layout.rv_item_user, strings);
        mrv.setLayoutManager(new LinearLayoutManager(this));
        mrv.setAdapter(userAdapter);
    }
}

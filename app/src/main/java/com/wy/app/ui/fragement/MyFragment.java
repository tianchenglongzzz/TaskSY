package com.wy.app.ui.fragement;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.wy.app.R;
import com.wy.app.base.BaseFragment;
import com.wy.app.base.BasePresenter;
import com.wy.app.ui.activity.BalanceActivity;
import com.wy.app.ui.activity.BlackListActivity;
import com.wy.app.ui.activity.NewTaskActivity;
import com.wy.app.ui.activity.RankingActivity;
import com.wy.app.ui.activity.RechargeActivity;
import com.wy.app.ui.activity.RegisterActivity;
import com.wy.app.ui.activity.ReportActivity;
import com.wy.app.ui.activity.TaskDetailsActivity;
import com.wy.app.ui.activity.TaskManageActivity;
import com.wy.app.ui.activity.UserActivity;
import com.wy.app.ui.activity.VipActivity;

import butterknife.BindView;
import butterknife.OnClick;


public class MyFragment extends BaseFragment {


    public MyFragment() {
        // Required empty public constructor
    }

    @Override
    public int setViewId() {
        return R.layout.fragment_my;
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
    public void initData() {

    }
    @OnClick({R.id.rl_faburenwu,R.id.rl_heimingdan,R.id.rl_huiyuan,R.id.rl_jubaoweiquan,R.id.rl_paiming,R.id.img_header,R.id.tixian})
    public  void onClick(View view){
        switch (view.getId()){
            case R.id.rl_faburenwu:
                startActivity(new Intent(getContext(), TaskManageActivity.class));
                break;
            case R.id.rl_heimingdan:
                startActivity(new Intent(getContext(), BlackListActivity.class));
                break;
            case R.id.rl_huiyuan:
                startActivity(new Intent(getContext(), VipActivity.class));
                break;
            case R.id.rl_jubaoweiquan:
                startActivity(new Intent(getContext(), ReportActivity.class));
                break;
            case R.id.rl_paiming:
                startActivity(new Intent(getContext(), RankingActivity.class));
                break;
            case R.id.img_header:
                startActivity(new Intent(getContext(), UserActivity.class));
                break;
            case R.id.tixian:
                startActivity(new Intent(getContext(), BalanceActivity.class));
                break;


        }
    }

}

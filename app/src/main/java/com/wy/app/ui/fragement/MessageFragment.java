package com.wy.app.ui.fragement;


import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.wy.app.R;
import com.wy.app.base.BaseFragment;
import com.wy.app.base.BasePresenter;

/**
 * A simple {@link Fragment} subclass.
 */
public class MessageFragment extends BaseFragment {


    @Override
    public int setViewId() {
        return R.layout.fragment_message;
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
}

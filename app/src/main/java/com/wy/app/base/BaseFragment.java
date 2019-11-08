package com.wy.app.base;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import java.util.IllegalFormatCodePointException;

import butterknife.ButterKnife;
import butterknife.Unbinder;

public abstract class BaseFragment<P extends BasePresenter> extends Fragment implements IBaseView {

    public P mPresenter;
    private Unbinder unbinder;
    public int page=1;

    public abstract int setViewId();
    @Override
    public void toast(String toast){
        Toast.makeText(getContext(),toast,Toast.LENGTH_SHORT).show();
    }

    public abstract P  getPresenter();

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View inflate = inflater.inflate(setViewId(), container, false);
        unbinder = ButterKnife.bind(this, inflate);
        mPresenter=getPresenter();
        if (mPresenter!=null) {
            mPresenter.attachView(this);
        }
        return inflate;
    }

    @Override
    public void onResume() {
        super.onResume();
       initData();
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        init(savedInstanceState);

    }



    @Override
    public void onDestroyView() {
        super.onDestroyView();
        if (mPresenter!=null) {
            mPresenter.detachView();
        }
    }
}

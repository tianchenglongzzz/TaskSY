package com.wy.app.presenter;

import com.wy.app.MainActivity;
import com.wy.app.base.BasePresenter;
import com.wy.app.imvp.MainContract;

public class MainPresenter extends BasePresenter<MainContract.view> implements MainContract.Presenter {

    @Override
    public void main() {
           mView.show();
    }
}

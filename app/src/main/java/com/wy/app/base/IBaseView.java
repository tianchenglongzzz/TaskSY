package com.wy.app.base;

import android.content.Context;
import android.os.Bundle;

public interface IBaseView {
    /**
     * 显示加载框
     */
    void showLoading();

    /**
     * 隐藏加载框
     */
    void dismissLoading();

    void init(Bundle savedInstanceState);
    void toast(String msg);
    /**
     * 上下文
     *
     * @return context
     */
    Context getContext();
    void initData();
}

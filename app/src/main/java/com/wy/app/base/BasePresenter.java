package com.wy.app.base;

import java.lang.ref.WeakReference;

public abstract class BasePresenter<V extends IBaseView>  {
    private WeakReference<V> mvpView;
    public V   mView;
     public  void attachView(V v){
         mvpView = new WeakReference<>(v);
         mView=mvpView.get();
     }
    /**
     * 解绑View
     */
    public void detachView() {
        if (null != mvpView) {
            mvpView.clear();
            mvpView = null;
            mView=null;
        }
    }

}

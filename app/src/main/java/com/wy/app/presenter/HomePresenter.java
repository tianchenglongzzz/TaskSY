package com.wy.app.presenter;

import android.content.Context;

import com.lc.myretrofit.rxjava.DefaultObserver;
import com.lc.myretrofit.utils.RxUtil;
import com.trello.rxlifecycle2.components.support.RxAppCompatActivity;
import com.wy.app.base.BasePresenter;
import com.wy.app.bean.LoopIndexBean;
import com.wy.app.bean.TaskReleaseBean;
import com.wy.app.http.RetrofitHelper;
import com.wy.app.imvp.HomeContract;

import java.util.ArrayList;

public class HomePresenter extends BasePresenter<HomeContract.View> implements HomeContract.Presenter {
    @Override
    public void getBanner() {
        RetrofitHelper.getApiService().getIndex().compose(RxUtil.rxSchedulerHelper())
                            .safeSubscribe(new DefaultObserver<LoopIndexBean>() {
                        @Override
                        public void onSuccess(LoopIndexBean response) {
                                if (response.getCode()==1){
                                    mView.showBanner((ArrayList<LoopIndexBean.DataBean.BannerBean>) response.getData().getBanner());
                                }else {
                                     mView.toast(response.getMsg());
                                }
                        }

                });

    }

    @Override
    public void getTaskRelease(int page) {
          RetrofitHelper.getApiService().getTask(page)
                  .compose(RxUtil.rxSchedulerHelper())
                  .subscribe(new DefaultObserver<TaskReleaseBean>() {
                      @Override
                      public void onSuccess(TaskReleaseBean response) {
                           if (response.getCode()==1){
                               mView.shoTask(response);
                           }else {
                               mView.toast(response.getMsg());
                           }
                      }
                  });
    }
}

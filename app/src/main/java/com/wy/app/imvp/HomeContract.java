package com.wy.app.imvp;

import android.content.Context;

import com.wy.app.base.IBaseView;
import com.wy.app.bean.LoopIndexBean;
import com.wy.app.bean.TaskReleaseBean;

import java.util.ArrayList;

public interface HomeContract {
    interface View extends IBaseView {
            void  showBanner(ArrayList<LoopIndexBean.DataBean.BannerBean> loopIndexBean);
            void  shoTask(TaskReleaseBean taskReleaseBean);
    }
    interface Presenter{
        void getBanner();
        void getTaskRelease(int page);
    }
}

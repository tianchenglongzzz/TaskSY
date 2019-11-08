package com.wy.app.imvp;

import com.wy.app.base.IBaseView;

public interface RegisterContract {
    interface View extends IBaseView {
        void  register();
    }
    interface Presenter{
        void register();
    }
}

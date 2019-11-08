package com.wy.app.imvp;

import com.wy.app.base.IBaseView;

public interface LoginContract  {

    interface View extends IBaseView {
         void  login();
    }
    interface Presenter{
        void login();
    }

}

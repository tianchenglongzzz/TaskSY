package com.wy.app.app;

import android.app.Application;

import com.lc.myretrofit.utils.Utils;
import com.wy.app.util.ScreenUtil;

public class App extends Application {
    public  static String BUNDLE="Bundle";
    @Override
    public void onCreate() {
        super.onCreate();
        ScreenUtil.resetDensity(this);
        Utils.init(this);
    }
}

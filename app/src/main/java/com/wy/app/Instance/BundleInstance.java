package com.wy.app.Instance;

import android.os.Bundle;

public class BundleInstance {
 private  static   Bundle mBundle;

    public static Bundle getInstance() {
        if (mBundle == null) {
            synchronized (BundleInstance.class) {
                if (mBundle == null) {
                    mBundle = new Bundle();
                }
            }
        }
        return mBundle;
    }
}

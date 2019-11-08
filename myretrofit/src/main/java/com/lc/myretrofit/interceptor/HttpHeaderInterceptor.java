package com.lc.myretrofit.interceptor;

import android.util.Log;

import com.lc.myretrofit.utils.SharedPreferencesHelper;
import com.lc.myretrofit.utils.Utils;

import java.io.IOException;

import okhttp3.Interceptor;
import okhttp3.Request;
import okhttp3.Response;

/**
 * Created by zhpan on 2018/3/21.
 */

public class HttpHeaderInterceptor implements Interceptor {
    @Override
    public Response intercept(Chain chain) throws IOException {
        //  配置请求头

        String accessToken = "user-token";
        String tokenType = "tokenType";
        String token1= (String)SharedPreferencesHelper.get(Utils.getContext(),"token","");
        Log.d("TOKENtIAN",token1);
        Request request = chain.request().newBuilder()
                /*.addHeader("Connection", "keep-alive")
                .addHeader("Accept-Encoding", "identity")

               */
                 .addHeader(accessToken,"533B30822C77CCBFCAC52CE1909801CF")
                .addHeader("Content-Type","text/json")
                .build();
        return chain.proceed(request);
}

    }
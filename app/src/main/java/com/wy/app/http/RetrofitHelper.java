package com.wy.app.http;


import com.lc.myretrofit.http.Constants;
import com.lc.myretrofit.http.IdeaApi;


public class RetrofitHelper {
    private static IdeaApiService mIdeaApiService;

    public static IdeaApiService getApiService() {
        if (mIdeaApiService == null)
            mIdeaApiService = IdeaApi.getApiService(IdeaApiService.class, Constants.API_SERVER_URL);
        return mIdeaApiService;
    }
}

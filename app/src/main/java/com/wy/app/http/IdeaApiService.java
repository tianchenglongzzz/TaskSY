package com.wy.app.http;

import com.lc.myretrofit.http.Constants;
import com.wy.app.bean.LoopIndexBean;
import com.wy.app.bean.TaskReleaseBean;

import java.util.Map;

import io.reactivex.Observable;
import retrofit2.http.Field;
import retrofit2.http.FieldMap;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.POST;

/**
 * 项目名称：MyModel
 * 创建人：刘
 * 创建时间：2019-08-15 10:17
 * 功能描述：
 */
public interface IdeaApiService {


    //首页轮播
   @POST(Constants.API_SERVER_URL+"index")
   Observable<LoopIndexBean> getIndex();

   //获得首页任务列表
    @POST(Constants.API_SERVER_URL+"TaskRelease")
    @FormUrlEncoded
    Observable<TaskReleaseBean>getTask(@Field("PageNo") int page);

}

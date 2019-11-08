package com.lc.myretrofit.http;

import com.google.gson.TypeAdapter;
import com.lc.myretrofit.baseresponse.BasicResponse;
import com.lc.myretrofit.exception.ServerResponseException;

import java.io.IOException;

import okhttp3.ResponseBody;
import retrofit2.Converter;

/**
 * 项目名称：MyModel
 * 创建人：刘
 * 创建时间：2019-08-15 09:05
 * 功能描述：
 */
final class GsonResponseBodyConverter<T> implements Converter<ResponseBody, Object> {

    private final TypeAdapter<T> adapter;

    GsonResponseBodyConverter(TypeAdapter<T> adapter) {
        this.adapter = adapter;
    }
    @Override
    public Object convert(ResponseBody value) throws IOException {
        try {
            BasicResponse response = (BasicResponse) adapter.fromJson(value.charStream());
            if (response.getCode()==200) {
                return response.getContent();
            } else {
                // 特定 API 的错误，在相应的 DefaultObserver 的 onError 的方法中进行处理
                throw new ServerResponseException(response.getCode(), response.getMessage());
            }
        } finally {
            value.close();
        }

    }


}

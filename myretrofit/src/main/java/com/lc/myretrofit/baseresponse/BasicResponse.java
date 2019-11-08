package com.lc.myretrofit.baseresponse;

/**
 * 项目名称：MyModel
 * 创建人：刘
 * 创建时间：2019-08-15 08:58
 * 功能描述：
 */
public class BasicResponse <T>{
    private int code;
    private String message;
    private T content;

    public int getCode() {
        return code;
    }

    public String getMessage() {
        return message;
    }

    public T getContent() {
        return content;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public void setContent(T content) {
        this.content = content;
    }
}

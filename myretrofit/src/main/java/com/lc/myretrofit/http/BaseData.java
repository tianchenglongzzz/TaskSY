package com.lc.myretrofit.http;

/**
 * 项目名称：FXRobot
 * 创建人：刘
 * 创建时间：2019-09-11 10:35
 * 功能描述：
 */
public class BaseData<T> {

    /**
     * code : 100
     * message : 发送成功
     * path :
     * data : {"code":378569}
     * extra : {}
     * timestamp : 1568164785812
     */

    private int code;
    private String message;
    private String path;
    private T data;
    private ExtraBean extra;
    private String timestamp;

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public ExtraBean getExtra() {
        return extra;
    }

    public void setExtra(ExtraBean extra) {
        this.extra = extra;
    }

    public String getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(String timestamp) {
        this.timestamp = timestamp;
    }


    public static class ExtraBean {
    }
}

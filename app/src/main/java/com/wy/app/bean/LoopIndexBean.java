package com.wy.app.bean;

import java.util.List;

public class LoopIndexBean {


    /**
     * code : 1
     * msg : 获取成功
     * data : {"banner":[{"image":"\\uploads/banner/20191026\\9068e3e2d3e5cb041169201899bc5233.jpg","bind_id":4},{"image":"\\uploads/banner/20191026\\6c88b67e09eed27674bbf8a2c60df5f5.jpg","bind_id":3}]}
     * url :
     * wait : 3
     */

    private int code;
    private String msg;
    private DataBean data;
    private String url;
    private int wait;

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public DataBean getData() {
        return data;
    }

    public void setData(DataBean data) {
        this.data = data;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public int getWait() {
        return wait;
    }

    public void setWait(int wait) {
        this.wait = wait;
    }

    public static class DataBean {
        private List<BannerBean> banner;

        public List<BannerBean> getBanner() {
            return banner;
        }

        public void setBanner(List<BannerBean> banner) {
            this.banner = banner;
        }

        public static class BannerBean {

            private String image;
            private int bind_id;

            public String getImage() {
                return image;
            }

            public void setImage(String image) {
                this.image = image;
            }

            public int getBind_id() {
                return bind_id;
            }

            public void setBind_id(int bind_id) {
                this.bind_id = bind_id;
            }
        }
    }
}

package com.wy.app.bean;

import java.util.List;

public class TaskReleaseBean {

    /**
     * code : 1
     * msg : 获取成功
     * data : {"data":[{"id":1,"uid":1,"task_id":9,"state":2,"title":"app注册","zong_num":10,"num":5,"price":"1.20","j_state":1,"image":"level/20190812/60c175448b8879ef23d2f33f74c884d0.png","task_title":"app注册"}]}
     * url :
     * wait : 3
     */

    private int code;
    private String msg;
    private DataBeanX data;
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

    public DataBeanX getData() {
        return data;
    }

    public void setData(DataBeanX data) {
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

    public static class DataBeanX {
        private List<DataBean> data;

        public List<DataBean> getData() {
            return data;
        }

        public void setData(List<DataBean> data) {
            this.data = data;
        }

        public static class DataBean {
            /**
             * id : 1
             * uid : 1
             * task_id : 9
             * state : 2
             * title : app注册
             * zong_num : 10
             * num : 5
             * price : 1.20
             * j_state : 1
             * image : level/20190812/60c175448b8879ef23d2f33f74c884d0.png
             * task_title : app注册
             */

            private int id;
            private int uid;
            private int task_id;
            private int state;
            private String title;
            private int zong_num;
            private int num;
            private String price;
            private int j_state;
            private String image;
            private String task_title;

            public int getId() {
                return id;
            }

            public void setId(int id) {
                this.id = id;
            }

            public int getUid() {
                return uid;
            }

            public void setUid(int uid) {
                this.uid = uid;
            }

            public int getTask_id() {
                return task_id;
            }

            public void setTask_id(int task_id) {
                this.task_id = task_id;
            }

            public int getState() {
                return state;
            }

            public void setState(int state) {
                this.state = state;
            }

            public String getTitle() {
                return title;
            }

            public void setTitle(String title) {
                this.title = title;
            }

            public int getZong_num() {
                return zong_num;
            }

            public void setZong_num(int zong_num) {
                this.zong_num = zong_num;
            }

            public int getNum() {
                return num;
            }

            public void setNum(int num) {
                this.num = num;
            }

            public String getPrice() {
                return price;
            }

            public void setPrice(String price) {
                this.price = price;
            }

            public int getJ_state() {
                return j_state;
            }

            public void setJ_state(int j_state) {
                this.j_state = j_state;
            }

            public String getImage() {
                return image;
            }

            public void setImage(String image) {
                this.image = image;
            }

            public String getTask_title() {
                return task_title;
            }

            public void setTask_title(String task_title) {
                this.task_title = task_title;
            }
        }
    }
}

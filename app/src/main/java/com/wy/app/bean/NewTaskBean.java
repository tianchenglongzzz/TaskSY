package com.wy.app.bean;

import java.io.File;
import java.util.ArrayList;

public class NewTaskBean {

    private String title;
  private  String content;
  private    ArrayList<String> imgs;
  private   ArrayList<File> files;

    public NewTaskBean(String title, String content, ArrayList<String> imgs, ArrayList<File> files) {
        this.title = title;
        this.content = content;
        this.imgs = imgs;
        this.files = files;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public void setImgs(ArrayList<String> imgs) {
        this.imgs = imgs;
    }

    public void setFiles(ArrayList<File> files) {
        this.files = files;
    }

    public String getTitle() {
        return title;
    }

    public String getContent() {
        return content;
    }

    public ArrayList<String> getImgs() {
        return imgs;
    }

    public ArrayList<File> getFiles() {
        return files;
    }
}

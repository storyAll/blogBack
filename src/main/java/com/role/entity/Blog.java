package com.role.entity;

import java.util.Date;

public class Blog {
    private int id;
    private String username;
    private String title;
    private String content;
    private String imgUrl;
    private String releaseTime;

    public Blog() {
    }

    public Blog(int id, String username, String title, String content, String imgUrl, String releaseTime) {
        this.id = id;
        this.username = username;
        this.title = title;
        this.content = content;
        this.imgUrl = imgUrl;
        this.releaseTime = releaseTime;
    }

    public int getId() {
        return id;
    }

    public String getUsername() {
        return username;
    }

    public String getTitle() {
        return title;
    }

    public String getContent() {
        return content;
    }

    public String getImgUrl() {
        return imgUrl;
    }

    public String getReleaseTime() {
        return releaseTime;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public void setImgUrl(String imgUrl) {
        this.imgUrl = imgUrl;
    }

    public void setReleaseTime(String releaseTime) {
        this.releaseTime = releaseTime;
    }

    @Override
    public String toString() {
        return "Blog{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", title='" + title + '\'' +
                ", content='" + content + '\'' +
                ", imgUrl='" + imgUrl + '\'' +
                ", releaseTime=" + releaseTime +
                '}';
    }
}

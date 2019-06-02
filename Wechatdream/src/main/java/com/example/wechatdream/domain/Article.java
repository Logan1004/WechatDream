package com.example.wechatdream.domain;

import javax.persistence.Transient;
import java.util.Date;

public class Article {
    private Integer id;

    private String content;

    private Date time;

    private Integer userId;

    private Integer status;

    private Integer classId;

    private String title;

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    private String type;
    @Transient
    private String userName;


    public Article(Integer id, String content, Date time, Integer userId, Integer status, Integer classId, String title, String type) {
        this.id = id;
        this.content = content;
        this.time = time;
        this.userId = userId;
        this.status = status;
        this.classId = classId;
        this.title = title;
        this.type = type;
    }

    public Article() {
        super();
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content == null ? null : content.trim();
    }

    public Date getTime() {
        return time;
    }

    public void setTime(Date time) {
        this.time = time;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Integer getClassId() {
        return classId;
    }

    public void setClassId(Integer classId) {
        this.classId = classId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title == null ? null : title.trim();
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type == null ? null : type.trim();
    }
}
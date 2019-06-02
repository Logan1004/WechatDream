package com.example.wechatdream.domain;

import javax.persistence.Transient;
import java.util.Date;

public class Request {
    private Integer classId;

    private Integer userId;

    private Date time;

    private String description;

    @Transient
    private String className;
    @Transient
    private String userName;



    public Request(Integer classId, Integer userId, Date time, String description) {
        this.classId = classId;
        this.userId = userId;
        this.time = time;
        this.description = description;
    }

    public Request() {
        super();
    }

    public Integer getClassId() {
        return classId;
    }

    public void setClassId(Integer classId) {
        this.classId = classId;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Date getTime() {
        return time;
    }

    public void setTime(Date time) {
        this.time = time;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description == null ? null : description.trim();
    }
    @Transient
    public String getClassName() {
        return className;
    }

    @Transient
    public void setClassName(String className) {
        this.className = className;
    }

    @Transient
    public String getUserName() {
        return userName;
    }

    @Transient
    public void setUserName(String userName) {
        this.userName = userName;
    }
}
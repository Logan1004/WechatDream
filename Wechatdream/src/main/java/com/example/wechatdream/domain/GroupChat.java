package com.example.wechatdream.domain;

import java.util.Date;

public class GroupChat {
    private Date time;

    private Integer classId;

    private Integer userId;

    private String message;

    public GroupChat(Date time, Integer classId, Integer userId, String message) {
        this.time = time;
        this.classId = classId;
        this.userId = userId;
        this.message = message;
    }

    public GroupChat() {
        super();
    }

    public Date getTime() {
        return time;
    }

    public void setTime(Date time) {
        this.time = time;
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

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message == null ? null : message.trim();
    }
}
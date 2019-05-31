package com.example.wechatdream.domain;

import java.util.Date;

public class Message {
    private Integer userIdFrom;

    private Integer userIdTo;

    private Date time;

    private String message;

    private Integer status;

    private String subject;

    public Message(Integer userIdFrom, Integer userIdTo, Date time, String message, Integer status, String subject) {
        this.userIdFrom = userIdFrom;
        this.userIdTo = userIdTo;
        this.time = time;
        this.message = message;
        this.status = status;
        this.subject = subject;
    }

    public Message() {
        super();
    }

    public Integer getUserIdFrom() {
        return userIdFrom;
    }

    public void setUserIdFrom(Integer userIdFrom) {
        this.userIdFrom = userIdFrom;
    }

    public Integer getUserIdTo() {
        return userIdTo;
    }

    public void setUserIdTo(Integer userIdTo) {
        this.userIdTo = userIdTo;
    }

    public Date getTime() {
        return time;
    }

    public void setTime(Date time) {
        this.time = time;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message == null ? null : message.trim();
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject == null ? null : subject.trim();
    }
}
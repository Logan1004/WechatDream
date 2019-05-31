package com.example.wechatdream.domain;

public class ClassHasUser {
    private Integer userId;

    private Integer classId;

    public ClassHasUser(Integer userId, Integer classId) {
        this.userId = userId;
        this.classId = classId;
    }

    public ClassHasUser() {
        super();
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Integer getClassId() {
        return classId;
    }

    public void setClassId(Integer classId) {
        this.classId = classId;
    }
}
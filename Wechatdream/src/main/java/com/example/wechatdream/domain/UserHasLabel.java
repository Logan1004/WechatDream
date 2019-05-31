package com.example.wechatdream.domain;

public class UserHasLabel {
    private Integer userId;

    private Integer labelId;

    public UserHasLabel(Integer userId, Integer labelId) {
        this.userId = userId;
        this.labelId = labelId;
    }

    public UserHasLabel() {
        super();
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Integer getLabelId() {
        return labelId;
    }

    public void setLabelId(Integer labelId) {
        this.labelId = labelId;
    }
}
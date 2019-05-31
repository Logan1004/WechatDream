package com.example.wechatdream.domain;

import java.util.Date;

public class EmailValidation {
    private Integer userId;

    private String validationCode;

    private Date time;

    public EmailValidation(Integer userId, String validationCode, Date time) {
        this.userId = userId;
        this.validationCode = validationCode;
        this.time = time;
    }

    public EmailValidation() {
        super();
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getValidationCode() {
        return validationCode;
    }

    public void setValidationCode(String validationCode) {
        this.validationCode = validationCode == null ? null : validationCode.trim();
    }

    public Date getTime() {
        return time;
    }

    public void setTime(Date time) {
        this.time = time;
    }
}
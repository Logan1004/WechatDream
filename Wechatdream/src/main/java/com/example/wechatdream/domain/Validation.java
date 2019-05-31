package com.example.wechatdream.domain;

import java.util.Date;

public class Validation {
    private String phone;

    private String value;

    private Date time;

    public Validation(String phone, String value, Date time) {
        this.phone = phone;
        this.value = value;
        this.time = time;
    }

    public Validation() {
        super();
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone == null ? null : phone.trim();
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value == null ? null : value.trim();
    }

    public Date getTime() {
        return time;
    }

    public void setTime(Date time) {
        this.time = time;
    }
}
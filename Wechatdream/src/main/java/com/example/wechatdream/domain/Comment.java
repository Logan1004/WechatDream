package com.example.wechatdream.domain;

import java.util.Date;

public class Comment {
    private Integer articleId;

    private Integer userId;

    private Date time;

    private String content;

    public Comment(Integer articleId, Integer userId, Date time, String content) {
        this.articleId = articleId;
        this.userId = userId;
        this.time = time;
        this.content = content;
    }

    public Comment() {
        super();
    }

    public Integer getArticleId() {
        return articleId;
    }

    public void setArticleId(Integer articleId) {
        this.articleId = articleId;
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

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content == null ? null : content.trim();
    }
}
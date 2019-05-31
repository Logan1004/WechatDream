package com.example.wechatdream.domain;

public class RecommendMember {
    private Integer teamId;

    private Integer userId;

    public RecommendMember(Integer teamId, Integer userId) {
        this.teamId = teamId;
        this.userId = userId;
    }

    public RecommendMember() {
        super();
    }

    public Integer getTeamId() {
        return teamId;
    }

    public void setTeamId(Integer teamId) {
        this.teamId = teamId;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }
}
package com.example.wechatdream.domain;

public class RecommendTeam {
    private Integer userId;

    private Integer teamId;

    public RecommendTeam(Integer userId, Integer teamId) {
        this.userId = userId;
        this.teamId = teamId;
    }

    public RecommendTeam() {
        super();
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Integer getTeamId() {
        return teamId;
    }

    public void setTeamId(Integer teamId) {
        this.teamId = teamId;
    }
}
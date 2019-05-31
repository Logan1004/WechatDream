package com.example.wechatdream.domain;

public class TeamMember {
    private Integer userId;

    private Integer teamId;

    private Integer role;

    public TeamMember(Integer userId, Integer teamId, Integer role) {
        this.userId = userId;
        this.teamId = teamId;
        this.role = role;
    }

    public TeamMember() {
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

    public Integer getRole() {
        return role;
    }

    public void setRole(Integer role) {
        this.role = role;
    }
}
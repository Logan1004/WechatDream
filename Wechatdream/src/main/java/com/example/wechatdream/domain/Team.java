package com.example.wechatdream.domain;

public class Team {
    private Integer id;

    private Integer leaderId;

    private String description;

    public Team(Integer id, Integer leaderId, String description) {
        this.id = id;
        this.leaderId = leaderId;
        this.description = description;
    }

    public Team() {
        super();
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getLeaderId() {
        return leaderId;
    }

    public void setLeaderId(Integer leaderId) {
        this.leaderId = leaderId;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description == null ? null : description.trim();
    }
}
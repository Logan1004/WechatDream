package com.example.wechatdream.domain;

public class TeamHasLabel {
    private Integer teamId;

    private Integer labelId;

    public TeamHasLabel(Integer teamId, Integer labelId) {
        this.teamId = teamId;
        this.labelId = labelId;
    }

    public TeamHasLabel() {
        super();
    }

    public Integer getTeamId() {
        return teamId;
    }

    public void setTeamId(Integer teamId) {
        this.teamId = teamId;
    }

    public Integer getLabelId() {
        return labelId;
    }

    public void setLabelId(Integer labelId) {
        this.labelId = labelId;
    }
}
package com.example.wechatdream.domain;

import java.util.Date;

public class Class {
    private Integer id;

    private Integer schoolId;

    private Integer schoolRegionId;

    private String name;

    private Date startTime;

    private Date endTime;

    private Integer leaderId;

    private String labels;

    public Class(Integer id, Integer schoolId, Integer schoolRegionId, String name, Date startTime, Date endTime, Integer leaderId, String labels) {
        this.id = id;
        this.schoolId = schoolId;
        this.schoolRegionId = schoolRegionId;
        this.name = name;
        this.startTime = startTime;
        this.endTime = endTime;
        this.leaderId = leaderId;
        this.labels = labels;
    }

    public Class() {
        super();
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getSchoolId() {
        return schoolId;
    }

    public void setSchoolId(Integer schoolId) {
        this.schoolId = schoolId;
    }

    public Integer getSchoolRegionId() {
        return schoolRegionId;
    }

    public void setSchoolRegionId(Integer schoolRegionId) {
        this.schoolRegionId = schoolRegionId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public Date getStartTime() {
        return startTime;
    }

    public void setStartTime(Date startTime) {
        this.startTime = startTime;
    }

    public Date getEndTime() {
        return endTime;
    }

    public void setEndTime(Date endTime) {
        this.endTime = endTime;
    }

    public Integer getLeaderId() {
        return leaderId;
    }

    public void setLeaderId(Integer leaderId) {
        this.leaderId = leaderId;
    }

    public String getLabels() {
        return labels;
    }

    public void setLabels(String labels) {
        this.labels = labels == null ? null : labels.trim();
    }
}
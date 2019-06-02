package com.example.wechatdream.domain;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Transient;
import java.util.ArrayList;
import java.util.Date;

public class Class {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    @Transient
    private ArrayList<String> label;

    @Transient
    private String leaderName;

    @Transient
    private int memberNum;

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

    @Transient
    public ArrayList<String> getLabel() {
        return label;
    }
    @Transient
    public void setLabel(ArrayList<String> label) {
        this.label = label;
    }

    @Transient
    public String getLeaderName() {
        return leaderName;
    }

    @Transient
    public int getMemberNum() {
        return memberNum;
    }
    @Transient
    public void setMemberNum(int memberNum) {
        this.memberNum = memberNum;
    }

    @Transient
    public void setLeaderName(String leaderName) {
        this.leaderName = leaderName;
    }



}
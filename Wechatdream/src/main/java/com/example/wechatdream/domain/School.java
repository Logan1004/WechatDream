package com.example.wechatdream.domain;

public class School {
    private Integer id;

    private Integer regionId;

    private String name;

    public School(Integer id, Integer regionId, String name) {
        this.id = id;
        this.regionId = regionId;
        this.name = name;
    }

    public School() {
        super();
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getRegionId() {
        return regionId;
    }

    public void setRegionId(Integer regionId) {
        this.regionId = regionId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }
}
package com.example.wechatdream.domain;

public class File {
    private Integer id;

    private String info;

    private String name;

    private String path;

    private Integer downloadNum;

    private Integer userId;

    private Integer status;

    private Integer classId;

    public File(Integer id, String info, String name, String path, Integer downloadNum, Integer userId, Integer status, Integer classId) {
        this.id = id;
        this.info = info;
        this.name = name;
        this.path = path;
        this.downloadNum = downloadNum;
        this.userId = userId;
        this.status = status;
        this.classId = classId;
    }

    public File() {
        super();
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info == null ? null : info.trim();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path == null ? null : path.trim();
    }

    public Integer getDownloadNum() {
        return downloadNum;
    }

    public void setDownloadNum(Integer downloadNum) {
        this.downloadNum = downloadNum;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Integer getClassId() {
        return classId;
    }

    public void setClassId(Integer classId) {
        this.classId = classId;
    }
}
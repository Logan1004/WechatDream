package com.example.wechatdream.domain;

public class Label {
    private Integer id;

    private String label;

    public Label(Integer id, String label) {
        this.id = id;
        this.label = label;
    }

    public Label() {
        super();
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label == null ? null : label.trim();
    }
}
package com.dy.myboot.model;

public class Role {
    private Integer id;

    private String name;

    private String nameZh;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getNamezh() {
        return nameZh;
    }

    public void setNamezh(String namezh) {
        this.nameZh = namezh == null ? null : namezh.trim();
    }
}
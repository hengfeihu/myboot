package com.dy.myboot.model;

import com.dy.myboot.core.annotation.po.FieldName;
import com.dy.myboot.core.annotation.po.TableName;
import com.dy.myboot.core.beans.Po;

@TableName(name = "t_user")
public class User extends Po {
    private Long id;
    @FieldName(name = "userName")
    private String userName;
    private String password;
    private String phone;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", userName='" + userName + '\'' +
                ", password='" + password + '\'' +
                ", phone='" + phone + '\'' +
                '}';
    }
}

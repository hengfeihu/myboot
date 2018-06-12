package com.dy.myboot.model;

import com.dy.myboot.core.annotation.po.FieldName;
import com.dy.myboot.core.annotation.po.TableName;
import com.dy.myboot.core.beans.Po;
import lombok.Data;

@Data
@TableName(name = "t_user")
public class User extends Po {
    private Long id;
    @FieldName(name = "userName")
    private String userName;
    private String password;
    private String phone;
}

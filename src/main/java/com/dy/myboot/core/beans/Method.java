package com.dy.myboot.core.beans;

import java.io.Serializable;

import com.dy.myboot.core.sql.where.C;

public class Method {
    /**
     * where重写
     *
     * @param pram
     * @return
     */
    public static WherePrams where(String file, String where, Serializable value) {
        return new WherePrams(file, where, value);
    }

    public static WherePrams where(String file, C c, Serializable value) {
        String where = C.getSqlWhere(c);
        return where(file, where, value);
    }

    public static WherePrams createDefault() {
        return new WherePrams(null, null, null);
    }

    public static WherePrams where() {
        return new WherePrams(null, null, null);
    }

}

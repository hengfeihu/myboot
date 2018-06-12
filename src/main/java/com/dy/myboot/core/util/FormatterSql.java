package com.dy.myboot.core.util;

import java.util.ArrayList;
import java.util.List;

import com.dy.myboot.core.beans.FmtParm;
import com.dy.myboot.core.beans.Po;
import com.dy.myboot.core.beans.WherePrams;

/**
 * SQL查询格式化工具类
 *
 * @author 郭胜凯
 * @time 2016年6月14日下午4:33:29
 * @email 719348277@qq.com
 */
public class FormatterSql implements SqlFormatter {

    /**
     * 格式化条件
     */
    private List<FmtParm> fmtParms = new ArrayList<>();

    @Override
    public void addFmt(String fieldName, String select, Class<? extends Po> po, WherePrams where) {
        fmtParms.add(new FmtParm(fieldName, select, po, where));
    }

    @Override
    public void addFmt(FmtParm parm) {
        fmtParms.add(parm);
    }

    @Override
    public List<FmtParm> listFmtParm() {
        return fmtParms;
    }
}

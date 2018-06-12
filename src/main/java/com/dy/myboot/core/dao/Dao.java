package com.dy.myboot.core.dao;

import com.dy.myboot.core.beans.Po;
import com.dy.myboot.core.beans.WherePrams;

import java.io.Serializable;
import java.util.List;
import java.util.Map;

public interface Dao<T extends Po, PK extends Serializable> {

    /**
     * 添加不为空的记录（只将不为空字段入库，效率高）
     *
     * @param po
     * @return 受改变的记录数
     */
    int addLocal(T po);

    /**
     * 记录添加（所有字段入库，效率中）
     *
     * @param po
     * @return
     */
    int add(T po);

    /**
     * 通过主键获取某个记录
     *
     * @param id 主键
     * @return PO
     */
    T get(PK id);

    /**
     * 通过主键获取某个字段的值
     *
     * @param id
     * @param fileName
     * @return
     */
    Serializable getField(PK id, String fileName);

    /**
     * 条件获取一条记录
     *
     * @param t
     * @param 条件表达式
     * @return PO
     */
    T get(WherePrams where);

    /**
     * 条件获取某个记录字段
     *
     * @param where
     * @param fileName
     * @return
     */
    Serializable getFile(WherePrams where, String fileName);

    /**
     * 条件查询列表
     *
     * @param where 条件表达式
     * @return PO列表
     */
    List<T> list(WherePrams where);

    /**
     * 查询某个字段列表
     *
     * @param where    条件表达式
     * @param fileName 要查询的字段
     * @return
     */
    Serializable[] listFile(WherePrams where, String fileName);

    /**
     * 查询某些字段
     *
     * @param where 条件表达式
     * @param files 要查询的字段集
     * @return 查询的PO字段列表
     */
    List<Map<String, Serializable>> listFiles(WherePrams where, String[] files);

    /**
     * 更新不为null的PO字段
     *
     * @param po
     * @return 受影响的行数
     */
    int updateLocal(T po);

    /**
     * 更新PO的所有字段
     *
     * @param po
     * @return 受影响的行数
     */
    int update(T po);

    /**
     * 条件更新不为null的字段
     *
     * @param po
     * @param 条件表达式
     * @return 受影响的行数
     */
    int updateLocal(T po, WherePrams where);

    /**
     * 条件更新所有字段
     *
     * @param po
     * @param 条件表达式
     * @return 受影响的行数
     */
    int update(T po, WherePrams where);

    /**
     * 删除某个记录
     *
     * @param id 主键
     * @return 受影响的行数
     */
    int del(PK id);

    /**
     * 条件删除某个记录
     *
     * @param where 条件表达式
     * @return 受影响的行数
     */
    int del(WherePrams where);

    /**
     * 自定义sql查询
     *
     * @param po   用于封装返回结果的Bean
     * @param sql  用于执行查询的Sql
     * @param args Sql占位付对应的参数
     * @return 结果集合
     */
    List<Map<String, Object>> listBySql(String sql);

    /**
     * 执行自定义sql
     *
     * @param sql  用于执行的Sql
     * @param args Sql占位付对应的参数
     * @return 受影响的行数
     */
    int excuse(String sql);

    /**
     * 获取指定条件的记录数
     *
     * @param where 条件表达式
     * @return 查询到的记录数
     */
    long count(WherePrams where);

    /**
     * 获取对应表中的记录数
     *
     * @return 表中的条数
     */
    long size();

    /**
     * 是否存在字段相同的记录（ID以及不为空的字段除外）
     *
     * @param po 参照实体
     * @return
     */
    boolean isExist(T po);

    /**
     * 是否存在指定条件的记录
     *
     * @param where 条件表达式
     * @return
     */
    boolean isExist(WherePrams where);

    /**
     * 内查询
     *
     * @param fileName 用于内查询的字段
     * @param values   字段的值
     * @return 查询到的结果集
     */
    List<T> in(String fileName, Serializable[] values);

    /**
     * 获得下一个序列的值
     *
     * @return
     */
    long nextId();
}
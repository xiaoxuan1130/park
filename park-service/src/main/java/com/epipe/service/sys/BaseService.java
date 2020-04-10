package com.epipe.service.sys;

import java.util.List;

/**
 * @author liyuexuan
 * @date 2019-04-09 16:10
 **/
public interface BaseService<T> {

    /**
     * 保存
     * @param t
     * @return 行数
     */
    int save(T t);

    /**
     * 对注入的字段全部更新
     * @param t
     * @return 行数
     */
    int updateByPrimaryKey(T t);

    /**
     * 会对字段进行判断再更新(如果为Null就忽略更新)，如果你只想更新某一字段，可以用这个方法。
     * @param t
     * @return 行数
     */
    int updateByPrimaryKeySelective(T t);

    /**
     * 删除
     * @param t
     * @return 行数
     */
    int delete(T t);

    /**
     * 根据主键删除
     * @param id
     * @return 行数
     */
    int delete(String id);

    /**
     * 查询单个对象
     * @param t
     * @return 对象
     */
    T findOne(T t);

    /**
     * 查询多个对象
     * @param t
     * @return 多个对象
     */
    List<T> findList(T t);

    T get(T t);

    /**
     * 根据id查询
     * @param id
     * @return
     */
    T get(String id);

}

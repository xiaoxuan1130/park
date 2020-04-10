package com.epipe.common.base;

import tk.mybatis.mapper.common.Mapper;

import java.util.List;

/**
 * @author liyuexuan
 * @date 2019-04-09 16:10
 **/
public interface BaseMapper<T> extends Mapper<T> {

    /**
     * 保存
     * @param t
     * @return 行数
     */
    int save(T t);

    int update(T t);

    /**
     * 查询单个对象
     * @param t
     * @return 对象
     */
    T findOne(T t);

    /**
     * 查询列表
     * @param t
     * @return
     */
    List<T> findList(T t);


    /**
     * 单表查询
     * @param t
     * @return
     */
    T findOnly(T t);

    /**
     * 逻辑删除，需要手动实现
     *      * @param id
     * @return
     */
    int deleteByLogic(String id);
}

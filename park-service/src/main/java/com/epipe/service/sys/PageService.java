package com.epipe.service.sys;

/**
 * @author liyuexuan
 * @date 2019-04-09 16:10
 **/
public interface PageService<T> {

    /**
     * 分页查询
     * @param t 排序参数
     * @param pageAndSort 分页和排序参数
     * @return
     */
    PageResult<T> findByPage(T t, PageAndSort pageAndSort);

}

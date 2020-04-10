package com.epipe.utils;

import com.epipe.service.sys.PageResult;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageInfo;

import java.util.ArrayList;
import java.util.List;

/**
 * @author liyuexuan
 * @date 2019-04-09 16:10
 **/
public class PageUtils {

    /**
     * 数据转换
     * @param page
     * @param <T>
     * @return
     */
    public static <T> PageResult<T> convert(Page<T> page){
        PageResult<T> pageResult = new PageResult<>();
        pageResult.setPageNo(page.getPageNum());
        pageResult.setPageSize(page.getPageSize());
        pageResult.setTotalPages(page.getPages());
        pageResult.setTotalItems(page.getTotal());
        List<T> list = new ArrayList<>(page.getResult());
        pageResult.setDataList(list);
        return pageResult;
    }

    public static <T> PageResult<T> convert(PageInfo<T> page){
        PageResult<T> pageResult = new PageResult<>();
        pageResult.setPageNo(page.getPageNum());
        pageResult.setPageSize(page.getPageSize());
        pageResult.setTotalPages(page.getPages());
        pageResult.setTotalItems(page.getTotal());
        List<T> list = new ArrayList<>(page.getList());
        pageResult.setDataList(list);
        return pageResult;
    }

}

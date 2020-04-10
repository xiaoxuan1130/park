package com.epipe.service.sys;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 * @author liyuexuan
 * @date 2019-04-09 16:10
 **/
@Getter
@Setter
@ToString
public class PageResult<T> implements Serializable {

    private static final long serialVersionUID = 6356677905514261820L;
    /**
     * 当前页数
     */
    private int pageNo;

    /**
     * 当前显示行数
     */
    private int pageSize;

    /**
     * 总页数
     */
    private int totalPages;

    /**
     * 数据总行数
     */
    private long totalItems;

    /**
     * 数据
     */
    private List<T> dataList;

    public List<T> getDataList() {
        return dataList == null ? new ArrayList<T>() : dataList;
    }
}

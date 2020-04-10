package com.epipe.service.sys;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.io.Serializable;

/**
 * @author liyuexuan
 * @date 2019-04-09 16:10
 **/
@ToString
@Getter
@Setter
public class PageAndSort implements Serializable {


    private static final long serialVersionUID = -7021012677592621473L;
    /**
     * 分页号
     */
    int pageNo;

    /**
     * 分页数
     */
    int pageSize;

    /**
     * 排序
     */
    String sortBy;


    public void setPageSize(int pageSize) {
        this.pageSize = Math.min(pageSize, 10);
    }

    public PageAndSort() {
        this.pageNo = 1;
        this.pageSize = 10;
    }

    public PageAndSort(int pageNo, int pageSize) {
        this.pageNo = pageNo;
        this.pageSize = pageSize;
    }

    public String getSortBy() {
        return sortBy;
    }

    public void setSortBy(String sortBy) {
        this.sortBy = sortBy;
    }

    public PageAndSort sortBy(String sortBy){
        this.sortBy = sortBy;
        return this;
    }
}

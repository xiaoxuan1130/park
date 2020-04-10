package com.epipe.common.base;

import com.epipe.entity.sys.BaseEntity;
import com.epipe.service.sys.PageAndSort;
import com.epipe.service.sys.PageResult;
import com.epipe.service.sys.PageService;
import com.epipe.utils.PageUtils;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.apache.commons.lang3.StringUtils;

/**
 * @author liyuexuan
 * @date 2019-04-09 16:10
 **/

public class BaseServiceImpl<T extends BaseEntity> extends CurdServiceImpl<T> implements PageService<T> {


    @Override
    public PageResult<T> findByPage(T t, PageAndSort pageAndSort) {
        String sortBy = pageAndSort.getSortBy();
        PageInfo<T> pageInfo;
        pageInfo = getPageInfo(t, pageAndSort, sortBy);
        return PageUtils.convert(pageInfo);
    }

    private PageInfo<T> getPageInfo(T t, PageAndSort pageAndSort, String sortBy) {
        PageInfo<T> pageInfo;
        if (StringUtils.isEmpty(sortBy)) {
            pageInfo = PageHelper.startPage(pageAndSort.getPageNo(), pageAndSort.getPageSize())
                    .doSelectPageInfo(() -> super.findList(t));
        } else {
            pageInfo = PageHelper.startPage(pageAndSort.getPageNo(), pageAndSort.getPageSize(), sortBy)
                    .doSelectPageInfo(() -> super.findList(t));
        }
        return pageInfo;
    }
}

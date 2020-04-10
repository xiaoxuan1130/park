package com.epipe.mapper.sys;


import com.epipe.common.base.BaseMapper;
import com.epipe.entity.Menu;

import java.util.List;

/**
* 通用 Mapper 代码生成器
*
* @author mapper-generator
*/
public interface MenuMapper extends BaseMapper<Menu> {

    List<Menu> findByCondition(Menu menu);



}





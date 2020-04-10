package com.epipe.service.modules;


import com.epipe.entity.Menu;
import com.epipe.service.sys.BaseService;

import java.util.List;

public interface MenuService extends BaseService<Menu> {

    List<Menu> findByCondition(Menu menu);

}

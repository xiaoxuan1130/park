package com.epipe.impl.modules;

import com.epipe.common.base.BaseServiceImpl;
import com.epipe.entity.Menu;
import com.epipe.mapper.sys.MenuMapper;
import com.epipe.service.modules.MenuService;
import org.apache.dubbo.config.annotation.Service;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

@Service(version="1.0.0")
public class MenuServiceImpl extends BaseServiceImpl<Menu> implements MenuService {

    @Autowired
    private MenuMapper menuMapper;


    @Override
    public List<Menu> findByCondition(Menu menu) {
        return menuMapper.findByCondition(menu);
    }
}

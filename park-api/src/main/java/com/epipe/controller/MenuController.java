package com.epipe.controller;

import com.epipe.entity.Menu;
import com.epipe.parkcommon.entity.Resp;
import com.epipe.service.modules.MenuService;
import lombok.extern.slf4j.Slf4j;
import org.apache.dubbo.config.annotation.Reference;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * 测试使用
 */
@Controller
@RequestMapping("v1/menu")
@Slf4j
public class MenuController {

    @Reference
    private MenuService menuService;

    /**
     * 获取菜单
     * @return
     */
    @RequestMapping("get")
    @ResponseBody
    public Resp getMenus(){
        Menu menu=new Menu();
        menu.setId("1111");
        List<Menu> list= menuService.findByCondition(menu);
        return Resp.success(list);
    }


}

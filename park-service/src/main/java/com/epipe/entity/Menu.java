/**
 * Copyright &copy; 2015-2020 <a href="http://www.jeeplus.org/">JeePlus</a> All rights reserved.
 */
package com.epipe.entity;

import com.epipe.entity.sys.BaseEntity;
import lombok.Data;

import java.util.List;

/**
 * 菜单Entity
 * @author jeeplus
 * @version 2016-05-15
 */
@Data
public class Menu extends BaseEntity {

	private static final long serialVersionUID = 1L;
	private Menu parent;	// 父级菜单
	private String parentIds; // 所有父级编号
	private List<Menu> children;	// 父级菜单
	private String name; 	// 名称
	private String href; 	// 链接
	private String target; 	// 目标（ mainFrame、_blank、_self、_parent、_top）
	private String icon; 	// 图标
	private Integer sort; 	// 排序
	private String isShow; 	// 是否在菜单中显示（1：显示；0：不显示）
	private String type; //按钮类型
	private String permission; // 权限标识
	private boolean hasChildren;
	private String userId;
	private String id;

}
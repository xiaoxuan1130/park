/**
 * Copyright &copy; 2015-2020 <a href="http://www.jeeplus.org/">JeePlus</a> All rights reserved.
 */
package com.epipe.entity.sys;



import java.io.Serializable;

/**
 * Entity支持类
 * @author jeeplus
 * @version 2017-05-16
 */
public abstract class BaseEntity<T> implements Serializable {

	private static final long serialVersionUID = 1L;

	/**
	 * 实体编号（唯一标识）
	 */

	protected String id;
	
}

/**
 * Copyright (c) 2013-Now http://jeesite.com All rights reserved.
 */
package com.jeesite.modules.app.entity;

import org.hibernate.validator.constraints.Length;

import com.jeesite.common.entity.DataEntity;
import com.jeesite.common.mybatis.annotation.Column;
import com.jeesite.common.mybatis.annotation.Table;
import com.jeesite.common.mybatis.mapper.query.QueryType;

/**
 * app_testEntity
 * @author v
 * @version 2018-05-14
 */
@Table(name="app_test", alias="a", columns={
		@Column(name="id", attrName="id", label="id", isPK=true),
		@Column(name="name", attrName="name", label="name", queryType=QueryType.LIKE),
		@Column(name="description", attrName="description", label="description"),
	}, orderBy="a.id DESC"
)
public class AppTest extends DataEntity<AppTest> {
	
	private static final long serialVersionUID = 1L;
	private String name;		// name
	private String description;		// description
	
	public AppTest() {
		this(null);
	}

	public AppTest(String id){
		super(id);
	}
	
	@Length(min=0, max=255, message="name长度不能超过 255 个字符")
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	@Length(min=0, max=255, message="description长度不能超过 255 个字符")
	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}
	
}
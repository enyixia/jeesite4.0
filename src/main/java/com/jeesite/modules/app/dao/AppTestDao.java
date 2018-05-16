/**
 * Copyright (c) 2013-Now http://jeesite.com All rights reserved.
 */
package com.jeesite.modules.app.dao;

import com.jeesite.common.dao.CrudDao;
import com.jeesite.common.mybatis.annotation.MyBatisDao;
import com.jeesite.modules.app.entity.AppTest;

/**
 * app_testDAO接口
 * @author v
 * @version 2018-05-14
 */
@MyBatisDao
public interface AppTestDao extends CrudDao<AppTest> {
	
}
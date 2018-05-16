/**
 * Copyright (c) 2013-Now http://jeesite.com All rights reserved.
 */
package com.jeesite.modules.app.service;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.jeesite.common.entity.Page;
import com.jeesite.common.service.CrudService;
import com.jeesite.modules.app.entity.AppTest;
import com.jeesite.modules.app.dao.AppTestDao;

/**
 * app_testService
 * @author v
 * @version 2018-05-14
 */
@Service
@Transactional(readOnly=true)
public class AppTestService extends CrudService<AppTestDao, AppTest> {
	
	/**
	 * 获取单条数据
	 * @param appTest
	 * @return
	 */
	@Override
	public AppTest get(AppTest appTest) {
		return super.get(appTest);
	}
	
	/**
	 * 查询分页数据
	 * @param page 分页对象
	 * @param appTest
	 * @return
	 */
	@Override
	public Page<AppTest> findPage(Page<AppTest> page, AppTest appTest) {
		return super.findPage(page, appTest);
	}
	
	/**
	 * 保存数据（插入或更新）
	 * @param appTest
	 */
	@Override
	@Transactional(readOnly=false)
	public void save(AppTest appTest) {
		super.save(appTest);
	}
	
	/**
	 * 更新状态
	 * @param appTest
	 */
	@Override
	@Transactional(readOnly=false)
	public void updateStatus(AppTest appTest) {
		super.updateStatus(appTest);
	}
	
	/**
	 * 删除数据
	 * @param appTest
	 */
	@Override
	@Transactional(readOnly=false)
	public void delete(AppTest appTest) {
		super.delete(appTest);
	}
	
}
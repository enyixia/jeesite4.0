/**
 * Copyright (c) 2013-Now http://jeesite.com All rights reserved.
 */
package com.jeesite.modules.app.web;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.jeesite.common.config.Global;
import com.jeesite.common.entity.Page;
import com.jeesite.common.web.BaseController;
import com.jeesite.modules.app.entity.AppTest;
import com.jeesite.modules.app.service.AppTestService;

/**
 * app_testController
 * @author v
 * @version 2018-05-14
 */
@Controller
@RequestMapping(value = "${adminPath}/app/appTest")
public class AppTestController extends BaseController {

	@Autowired
	private AppTestService appTestService;
	
	/**
	 * 获取数据
	 */
	@ModelAttribute
	public AppTest get(String id, boolean isNewRecord) {
		return appTestService.get(id, isNewRecord);
	}
	
	/**
	 * 查询列表
	 */
	@RequiresPermissions("app:appTest:view")
	@RequestMapping(value = {"list", ""})
	public String list(AppTest appTest, Model model) {
		model.addAttribute("appTest", appTest);
		return "modules/app/appTestList";
	}
	
	/**
	 * 查询列表数据
	 */
	@RequiresPermissions("app:appTest:view")
	@RequestMapping(value = "listData")
	@ResponseBody
	public Page<AppTest> listData(AppTest appTest, HttpServletRequest request, HttpServletResponse response) {
		Page<AppTest> page = appTestService.findPage(new Page<AppTest>(request, response), appTest); 
		return page;
	}

	/**
	 * 查看编辑表单
	 */
	@RequiresPermissions("app:appTest:view")
	@RequestMapping(value = "form")
	public String form(AppTest appTest, Model model) {
		model.addAttribute("appTest", appTest);
		return "modules/app/appTestForm";
	}

	/**
	 * 保存app_test
	 */
	@RequiresPermissions("app:appTest:edit")
	@PostMapping(value = "save")
	@ResponseBody
	public String save(@Validated AppTest appTest) {
		appTestService.save(appTest);
		return renderResult(Global.TRUE, "保存app_test成功！");
	}
	
	/**
	 * 删除app_test
	 */
	@RequiresPermissions("app:appTest:edit")
	@RequestMapping(value = "delete")
	@ResponseBody
	public String delete(AppTest appTest) {
		appTestService.delete(appTest);
		return renderResult(Global.TRUE, "删除app_test成功！");
	}
	
}
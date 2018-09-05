package com.shipc.test.mybatis.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.alibaba.fastjson.JSONObject;
import com.shipc.test.mybatis.service.TestInfoService;

/**
 * @author ShiPC
 * @date 2018年9月5日
 * 
 * 控制器
 */
@Controller
@RequestMapping("/mybatis")
public class MybatisController {
	
	@Autowired
	private TestInfoService testInfoService;
	
	@RequestMapping(value = "data", method = RequestMethod.GET)
	public JSONObject getData() {
		List<Object> data = this.testInfoService.getData();
		JSONObject result = new JSONObject();
		result.put("data", data);
		return result;
	}
}

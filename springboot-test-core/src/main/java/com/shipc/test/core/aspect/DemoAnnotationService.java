package com.shipc.test.core.aspect;

import org.springframework.stereotype.Service;

/**
 * @author ShiPC
 *
 * 2018年8月20日
 * 
 * 使用注解的被拦截类
 */
@Service
public class DemoAnnotationService {
	@Action(name = "注解式拦截的add操作")
	public void add() {};
}

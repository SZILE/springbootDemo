package com.shipc.test.core.annotation;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author ShiPC
 *
 * 2018年8月21日
 * 
 * 组合注解与元注解
 */
/*
 * 所谓元注解其实就是可以注解到别的注解上的注解，被注解的注解称之为组合注解，组合注解具备注解的功能。
 */
public class Main {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(DemoConfig.class);
		DemoService demoService = context.getBean(DemoService.class);
		demoService.outputResult();
		context.close();
	}
}

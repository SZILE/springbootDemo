package com.shipc.test.core.el;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author ShiPC
 *
 * 2018年8月20日
 */
/*
 * Spring EL-Spring表达式语言，支持在xml和注解中使用表达式，类似于JSP的EL表达式语言。
 * Spring开发中经常涉及调用各种资源的情况，包含普通文件、网址、配置文件、系统环境变量等，
 * 可以使用Spring的表达式语言实现资源的注入。
 * 
 * Spring主要在注解@Value的参数中使用表达式。
 * 
 * 增加commons-io可简化文件相关操作。
 * 		<dependency>
			<groupId>commons-io</groupId>
			<artifactId>commons-io</artifactId>
			<version>2.4</version>
		</dependency>
 */
public class Main {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ElConfig.class);
		DemoService demoService = context.getBean(DemoService.class);
		demoService.outputResource();
		context.close();
	}
}

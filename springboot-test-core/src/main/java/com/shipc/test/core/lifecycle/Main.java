package com.shipc.test.core.lifecycle;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author ShiPC
 *
 * 2018年8月20日
 */
/*
 * 开发的时候，经常会遇到在Bean的使用之前或者之后做些必要的操作，Spring对Bean的生命周期
 * 的操作提供了支持
 * 在使用Java配置和注解配置下提供如下两种方式：
 * （1）Java配置方式：使用@Bean的initMethod和destroyMethod（相当于xml配置的init-method和destory-method）。
 * （2）注解方式：利用JSR-250的@PostContruct和@PreDestroy。
 * 
 *  要添加JSR250支持
 *  
<dependency>
    <groupId>javax.annotation</groupId>
    <artifactId>jsr250-api</artifactId>
    <version>1.0</version>
</dependency>

 */
public class Main {
	
	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(PrePostConfig.class);
		
		BeanWayService beanWaySevice = context.getBean(BeanWayService.class);
		JSR250WayService jsr250WayService = context.getBean(JSR250WayService.class);
		context.close();
	}
}

package com.shipc.test.core.profile;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;


/**
 * @author ShiPC
 *
 * 2018年8月20日
 */
/*
 * Profile为在不同环境下使用不同的配置提供了支持
 * （1）通过设定Environment的ActiveProfiles来设定当前context需要使用的配置环境。
 *     在开发中使用@Profile注解类或者方法，达到在不同情况下选择实例化不同的Bean。
 * （2）通过设定jvm的spring.profiles.active参数来设置配置环境。
 * （3）Web项目设置在Servlet的传context parameter中。
 */
public class Main {
	
	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
		context.getEnvironment().setActiveProfiles("prod");
		context.register(ProfileConfig.class);
		context.refresh();
		
		DemoBean demoBean = context.getBean(DemoBean.class);
		
		System.out.println(demoBean.getContent());
		context.close();
	}
}

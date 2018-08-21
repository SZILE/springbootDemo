package com.shipc.test.core.lifecycle;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.shipc.test.core.lifecycle")
public class PrePostConfig {
	
	// initMehtod和destoryMethod指定BeanWayService类的init和destory方法在构造之后、Bean销毁之前执行
	@Bean(initMethod = "init", destroyMethod = "destroy")
	BeanWayService beanWayService() {
		return new BeanWayService();
	}

	@Bean
	JSR250WayService jsr250WayService() {
		return new JSR250WayService();
	}
}

package com.shipc.test.core.event;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author ShiPC
 *
 * 2018年8月20日
 */
/*
 * Spring的事件（Application Event）为Bean与Bean之间的消息通信提供支持
 * 
 * Spring的事件需要遵循如下流程：
 * （1）自定义事件，集成ApplicationEvent
 * （2）定义事件监听器，实现ApplicationListenner
 * （3）使用容器发布事件
 */
public class Main {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(EventConfig.class);
		DemoPublisher demoPublisher = context.getBean(DemoPublisher.class);
		demoPublisher.publish("hello application event");
		context.close();
	}
}

package com.shipc.test.core.scope;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author ShiPC
 *
 * 2018年8月21日
 */
/*
 * Scope描述的是Spring容器如何新建Bean的实例。
 * 
 * Spring的Scope有以下几种，通过@Scope注解来实现。
 * （1）Singleton:一个Spring容器中只有一个Bean的实例，此为Spring的默认配置，全容器共享一个实例。
 * （2）Prototype:每次调用新建一个Bean的实例。
 * （3）Request：Web项目中，给每一个http request新建一个Bean实例。
 * （4）Session:Web项目中，给每一个http session新建一个Bean实例。
 * （5）GlobalSession：这个只在portal应用中用，给每一个global http session新建一个Bean实例。
 * 
 * 另外，在SpringBatch中还有一个Scope是使用@StepScope。
 */
public class Main {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ScopeConfig.class);
		
		DemoSingletonService s1 = context.getBean(DemoSingletonService.class);
		DemoSingletonService s2 = context.getBean(DemoSingletonService.class);
		
		DemoPrototypeService p1 = context.getBean(DemoPrototypeService.class);
		DemoPrototypeService p2 = context.getBean(DemoPrototypeService.class);
		
		System.out.println("s1与s2是否相等：" + s1.equals(s2));
		System.out.println("p1与p2是否相等：" + p1.equals(p2));
		
		context.close();
	}
}

package com.shipc.test.boot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.EnableAspectJAutoProxy;


/**
 * @author ShiPC
 *
 * 2018年8月3日
 * 
 * 应用入口
 */
@EnableAspectJAutoProxy(proxyTargetClass = true)
@ComponentScan(basePackages = "com.shipc.test")
@SpringBootApplication
public class App {
	
	public static void main(String[] args) {
		SpringApplication.run(App.class, args);
	}
}

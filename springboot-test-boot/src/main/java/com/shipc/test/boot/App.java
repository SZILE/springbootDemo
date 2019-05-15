package com.shipc.test.boot;

import com.shipc.test.springboot_starter_demo.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


/**
 * @author ShiPC
 *
 * 2018年8月3日
 * 
 * 应用入口
 */
@EnableAspectJAutoProxy(proxyTargetClass = true)
@ComponentScan(basePackages = "com.shipc.test")
@RestController
@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})
public class App {
	@Autowired
	HelloService helloService;

	@RequestMapping("/")
	public String index() {
		return helloService.sayHello();
	}

	public static void main(String[] args) {
		SpringApplication.run(App.class, args);
	}
}

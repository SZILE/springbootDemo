package com.shipc.test.core.el;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;

/**
 * @author ShiPC
 *
 * 2018年8月20日
 */
/*
 * 注入配置配件需使用@PropertySource指定文件地址，若使用@Value注入，则要配置一个
 * PropertySourcesPlaseHolderConfigurer的Bean.
 */
@Configuration
@ComponentScan("com.shipc.test.core.el")
@PropertySource("classpath:com/shipc/test/core/el/test.properties")
public class ElConfig {
	
	public static PropertySourcesPlaceholderConfigurer propertyConfigure() {
		return new PropertySourcesPlaceholderConfigurer();
	}
}

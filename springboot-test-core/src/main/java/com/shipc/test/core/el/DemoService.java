package com.shipc.test.core.el;

import java.io.IOException;

import org.apache.commons.io.IOUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.env.Environment;
import org.springframework.core.io.Resource;
import org.springframework.stereotype.Service;

@Service
public class DemoService {
	
	@Value("其他类的属性")  //注入普通字符串
	private String another;
	
	@Value("I Love You!")  // 注入普通字符串
	private String normal;
	
	@Value("#{systemProperties['os.name']}")  // 注入操作系统属性
	private String osName;
	
	@Value("#{ T(java.lang.Math).random() * 100.0 }")  // 注入表达式结果
	private double randomNumber;
	
	@Value("#{demoService.another}")  // 注入其他Bean属性
	private String fromAnother;
	
	@Value("classpath:test.txt")  // 注入文件资源
	private Resource testFile;
	
	@Value("http://www.baidu.com")  // 注入网址资源
	private Resource testUrl;
	
	@Value("${book.name}")  //  注入配置文件
	private String bookName;
	
	@Autowired
	private Environment environment;
	
	public void outputResource() {
		System.out.println(normal);
		System.out.println(osName);
		System.out.println(randomNumber);
		System.out.println(fromAnother);
		
		try {
			System.out.println(IOUtils.toString(testFile.getInputStream()));
			System.out.println(IOUtils.toString(testUrl.getInputStream()));
			System.out.println(bookName);
			System.out.println(environment.getProperty("book.author"));
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
	
	public String getAnother() {
		return another;
	}
	
	public void setAnother(String another) {
		this.another = another;
	}
}

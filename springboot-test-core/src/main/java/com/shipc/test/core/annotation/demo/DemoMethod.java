package com.shipc.test.core.annotation.demo;

import java.util.Map;

public class DemoMethod {
	
	@CheckParams(notNull="name", description = "姓名不能为空")
	public void method1(Map<String, String> map) {
		System.out.println("name = "+map.get("name"));
	}
	
	public void method2() {
		System.out.println("method2 running... \nend");
	}
}

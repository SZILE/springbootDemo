package com.shipc.test.core.annotation.demo;

import java.lang.reflect.Method;
import java.lang.reflect.Parameter;
import java.util.HashMap;
import java.util.Map;

public class Main {
	
	public static void main(String[] args) {
		DemoMethod demoMethod = new DemoMethod();
		Map<String, String> map = new HashMap<>();
		map.put("name", "testName");
		demoMethod.method1(map);
		interceptor(DemoMethod.class);
	}
	
	
	public static void interceptor(Class<?> cl) {
		for(Method method: cl.getMethods()) {
			CheckParams annotation = method.getAnnotation(CheckParams.class);
			if(annotation != null) {
				String notNull = annotation.notNull();
				System.out.println(notNull);
				int parameterCount = method.getParameterCount();
				Parameter[] parameters = method.getParameters();
				for(int i=0;i<parameterCount;i++) {
					if(parameters[i].getType().equals(Map.class)) {
						System.out.println(parameters[i].getType());
					}
				}
			}
		}
	}
}

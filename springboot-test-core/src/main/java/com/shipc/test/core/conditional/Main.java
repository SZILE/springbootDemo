package com.shipc.test.core.conditional;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
/*
 * @Conditional根据满足某一个特定条件创建一个特定的Bean.
 * 
 * 这个示例以不同的操作系统作为条件，通过实现Condition接口，并重写其matches方法来构造判断条件。
 * 若在Windows系统下运行程序，则输出列表命令为dir；若在Linux操作系统下运行程序，则输出列表命令为ls。
 */

public class Main {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ConditionConfig.class);
		
		ListService listService = context.getBean(ListService.class);
		System.out.println(context.getEnvironment().getProperty("os.name")
				+ "系统下的列表命令为："
				+ listService.showListCmd());
		context.close();
	}
}

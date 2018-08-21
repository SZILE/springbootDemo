package com.shipc.test.core.scheduled;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/*
 * @EnableScheduling 来开启计划任务的支持，然后在要执行计划任务的方法上注释@Scheduled,声明这是一个计划任务
 * 
 * Spring 通过@Scheduled支持多种类型的计划任务，包含cron\fixDelay\fixRate等。
 */
public class Main {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(TaskSchedulerConfig.class);
		context.close();
	}
}

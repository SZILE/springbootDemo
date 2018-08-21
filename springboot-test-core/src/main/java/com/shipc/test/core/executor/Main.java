package com.shipc.test.core.executor;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author ShiPC
 *
 * 2018年8月21日
 * 
 * 多线程
 */
/*
 * Spring通过任务执行器（TaskExecutor）来实现多线程和并发编程。使用ThreadPoolTaskExecutor
 * 可实现一个基于线程池的TaskExecutor。而实际开发中任务一般是非阻碍的，即异步的，所以要在配置类中通过
 * @EnableAsync开启对异步任务的支持，并通过在实际执行的Bean的方法中使用@Async注解来声明其是一个异步任务。
 */
public class Main {
	
	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(TaskExecutorConfig.class);
		AsyncTaskService asyncTaskService = context.getBean(AsyncTaskService.class);
		
		for(int i = 0; i<10; i++) {
			asyncTaskService.executeAsyncTask(i);
			asyncTaskService.executeAsyncTaskPlus(i);
		}
		context.close();
	}
}

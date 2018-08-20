package com.shipc.test.core.scheduled;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

/**
 * @author ShiPC
 *
 * 2018年8月17日
 * 
 * 计划任务执行类
 */
@Service
public class ScheduledTaskService {
	private static final SimpleDateFormat dataFormat = new SimpleDateFormat();
	/*
	 * 通过@Scheduled声明方法是计划任务，使用fixedRate属性每隔固定时间执行。
	 * 使用cron属性可按照指定时间执行
	 */
	
	@Scheduled(fixedRate = 5000)
	public void reportCurrentTime() {
		System.out.println("每隔五秒执行一次" + dataFormat.format(new Date()));
	}
	
	@Scheduled(cron = "0 28 11 ? * *")
	public void fixTimeExecution() {
		System.out.println("在指定时间 " + dataFormat.format(new Date()) + "执行");
	}
}

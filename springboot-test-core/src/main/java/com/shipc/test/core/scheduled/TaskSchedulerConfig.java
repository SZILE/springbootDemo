package com.shipc.test.core.scheduled;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableScheduling;

@Configuration
@EnableScheduling   //通过@EnableScheduling注释开启对计划任务的支持
@ComponentScan("com.shipc.test.core.scheduled")
public class TaskSchedulerConfig {

}

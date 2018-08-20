package com.shipc.test.core.aspect;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@ComponentScan("com.shipc.test.core.aspect")
@EnableAspectJAutoProxy  //使用@EableAspectJAutoProxy注解开启Spring对AspectJ代理的支持
public class AopConfig {

}

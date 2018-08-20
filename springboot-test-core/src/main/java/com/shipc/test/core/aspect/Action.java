package com.shipc.test.core.aspect;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;


/**
 * @author ShiPC
 *
 * 2018年8月20日
 * 
 * 拦截规则的注解
 * 
 *//*
 * 这里讲下注解：注解本身是没有功能的，和xml一样。注解和XML都是一种元数据，
 * 元数据即解释数据的数据，这就是所谓的配置
 */
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface Action {
	String name();
}

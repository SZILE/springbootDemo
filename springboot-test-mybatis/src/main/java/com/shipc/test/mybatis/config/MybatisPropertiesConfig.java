package com.shipc.test.mybatis.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

/**
 * @author ShiPC
 * @date 2018年9月5日
 */
@Configuration
@PropertySource(value = "classpath:mybatis-${spring.profiles.active}.properties", encoding = "UTF-8")
public class MybatisPropertiesConfig {

}

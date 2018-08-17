package com.shipc.test.core.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

/**
 * @author ShiPC
 *
 * 2018年8月3日
 */
@Configuration
@PropertySource(value="classpath:appliction-${spring.profile.active}.properties",encoding="UTF-8")
public class BaseConfig {

}

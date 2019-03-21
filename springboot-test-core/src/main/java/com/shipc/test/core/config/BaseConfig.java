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
/**
 * 日志配置
 * Spring Boot默认使用的Logback日志框架
 *
 * 配置日志级别 logging.file=D:/mylog/log.log
 * 配置日志文件，格式为logging.level.包名=级别:logging.level.org.springframework.web=DEBUG
 */
}

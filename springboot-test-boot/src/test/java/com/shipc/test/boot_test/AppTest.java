package com.shipc.test.boot_test;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.WebApplicationType;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ComponentScan;

/**
 * @ClassName AppTest
 * @Description 测试启动类
 * @Author shipc
 * @Date 2019/5/9 15:58
 * @Version 1.0
 */
@ComponentScan(basePackages = {"com.shipc.test"})  //扫描包内及子包的类
@SpringBootApplication
public class AppTest {
     private static Logger log = LoggerFactory.getLogger(AppTest.class);

    public static void main(String[] args) {
        try {
            SpringApplicationBuilder builder = new SpringApplicationBuilder(AppTest.class);
            builder.web(WebApplicationType.SERVLET).run(args);
//            ConfigurableApplicationContext context = builder.web(WebApplicationType.SERVLET).run(args);
//            String[] profiles = context.getEnvironment().getActiveProfiles();
            log.info("---------Start Application---------");
        } catch (Exception e) {
            log.error("启动异常", e);
        }
    }
}

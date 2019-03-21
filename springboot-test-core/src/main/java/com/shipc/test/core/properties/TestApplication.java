package com.shipc.test.core.properties;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ClassName TestApplication
 * @Description
 * @Author shipc
 * @Date 2019/3/19 15:34
 * @Version 1.0
 */

/**
 * 类型安全的配置（基于properties）
 * 使用@Value注入每个配置在实际项目中会显示得格外麻烦，Spring Boot提供了基于类型安全的配置方式，
 * 通过@ConfigurationProperties将properties属性和一个Bean及其属性关联，从而实现类型安全的配置。
 */
@RestController
@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})
public class TestApplication{
    @Autowired
    private AuthorSettings authorSettings;

    @RequestMapping("/")
    public String index() {
        return "author name is " + authorSettings.getName() + " and author age is " + authorSettings.getAge();
    }

    public static void main(String[] args) {
        SpringApplication.run(TestApplication.class, args);
    }
}

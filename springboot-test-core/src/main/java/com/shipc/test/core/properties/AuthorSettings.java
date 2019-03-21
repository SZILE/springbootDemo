package com.shipc.test.core.properties;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * @ClassName AuthorSettings
 * @Description
 * @Author shipc
 * @Date 2019/3/19 15:25
 * @Version 1.0
 */

/**
 * @ConfigurationProperties 加载properties文件内的配置，公国prefix属性指定properties的配置的前缀，通过locations指定properties文件的位置。
 * @ConfigurationProperties(prefix = "author", locatinos = {"calsspath:config/author.properties"})
 */
@Component
@ConfigurationProperties(prefix = "author")
public class AuthorSettings {
    private String name;
    private Long age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getAge() {
        return age;
    }

    public void setAge(Long age) {
        this.age = age;
    }
}

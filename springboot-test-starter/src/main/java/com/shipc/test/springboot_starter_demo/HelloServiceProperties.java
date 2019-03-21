package com.shipc.test.springboot_starter_demo;

import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * @ClassName com.shipc.test.springboot_starter_demo.HelloServiceProperties
 * @Description
 * @Author shipc
 * @Date 2019/3/19 19:32
 * @Version 1.0
 */
//类型安全的属性获取，字application.properties中通过hello.msg= 来设置，若不设置，默认为hello.msg=world
@ConfigurationProperties(prefix = "hello")
public class HelloServiceProperties {
    private static  final String MSG = "world";

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    private String msg = MSG;
}

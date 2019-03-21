package com.shipc.test.springboot_starter_demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @ClassName com.shipc.test.springboot_starter_demo.HelloServiceAutoConfiguration
 * @Description  自动配置类
 * @Author shipc
 * @Date 2019/3/19 19:38
 * @Version 1.0
 */
@Configuration
@EnableConfigurationProperties(HelloServiceProperties.class) //开启属性注入，通过@EnableConfigurationProperties声明，使用@Autowired注入
@ConditionalOnClass(HelloService.class) //当HelloService在类路径的条件下
@ConditionalOnProperty(prefix = "hello", value = "enabled", matchIfMissing = true) //当设置hello=enabled的情况下，如果没有设置则默认为true,即条件符合
public class HelloServiceAutoConfiguration {
    @Autowired
    private HelloServiceProperties helloServiceProperties;

    @Bean
    @ConditionalOnMissingBean(HelloService.class)  //当容器中没有这个Bean的时候创建Bean
    public HelloService helloService(){
        HelloService helloService = new HelloService();
        helloService.setMsg(helloServiceProperties.getMsg());
        return helloService;
    }
}

package com.shipc.test.core.junit;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

/**
 * @ClassName JunitConfig
 * @Description
 * @Author sxt
 * @Date 2019/3/19 13:43
 * @Version 1.0
 */
@Configuration
public class JunitConfig {

    @Bean
    @Profile("dev")
    public TestBean devTestBean() {
        return new TestBean("from development profile");
    }

    @Bean
    @Profile("prod")
    public TestBean prodTestBean() {
        return new TestBean("from production profile");
    }
}

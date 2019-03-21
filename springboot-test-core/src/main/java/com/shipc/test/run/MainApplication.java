package com.shipc.test.run;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

/**
 * @ClassName Main
 * @Description
 * @Author shipc
 * @Date 2019/3/19 14:14
 * @Version 1.0
 */
@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class}) //关闭特定的自动配置
public class MainApplication {
}

/**
 * 默认自动扫描@SpringBootApplication所在类的同级包以及下级包里的Bean.
 * @SpringBootApplication是Spring Boot的核心注解，它是一个组合注解。源代码如下：
 */
//@Target(ElementType.TYPE)
//@Retention(RetentionPolicy.RUNTIME)
//@Documented
//@Inherited
//@Configuration
//@EnableAutoConfiguration
//@ComponentScan
//public @interface SpringBootApplication {
//    @AliasFor(
//            annotation = EnableAutoConfiguration.class
//    )
//    Class<?>[] exclude() default {};
//}

/**
 * 其中，@EnableAutoConfiguration让SpringBoot根据类路径中的jar包依赖为当前项目进行自动配置。
 * */
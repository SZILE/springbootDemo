package com.shipc.test.util.bean;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

/**
 * @ClassName BeanUtils
 * @Description
 * @Author shipc
 * @Date 2019/3/19 10:16
 * @Version 1.0
 */
public class BeanUtils implements ApplicationContextAware {

    private static ApplicationContext context;

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        context = applicationContext;
    }

    public static Object getBean(String beanName) {
        return context != null ? context.getBean(beanName) : null;
    }
}

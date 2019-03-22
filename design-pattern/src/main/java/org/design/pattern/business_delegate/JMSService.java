package org.design.pattern.business_delegate;

/**
 * @ClassName JMSService
 * @Description 实体服务类
 * @Author shipc
 * @Date 2019/3/22 10:57
 * @Version 1.0
 */
public class JMSService implements BusinessService {
    @Override
    public void doProcessing() {
        System.out.println("Processing task by invoking JMS Service");
    }
}

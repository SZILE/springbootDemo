package org.design.pattern.business_delegate;

/**
 * @ClassName Client
 * @Description 客户端
 * @Author shipc
 * @Date 2019/3/22 11:18
 * @Version 1.0
 */
public class Client {
    BusinessDelegate businessDelegate;

    public Client(BusinessDelegate businessDelegate) {
        this.businessDelegate = businessDelegate;
    }

    public void doTask() {
        businessDelegate.doTask();
    }
}

package org.design.pattern.business_delegate;

/**
 * @ClassName BusinessDelegatePatternDemo
 * @Description 业务代表模式
 * @Author shipc
 * @Date 2019/3/22 11:19
 * @Version 1.0
 */
public class BusinessDelegatePatternDemo {
    public static void main(String[] args) {
        BusinessDelegate businessDelegate = new BusinessDelegate();
        businessDelegate.setServiceType("EJB");

        Client client = new Client(businessDelegate);
        client.doTask();

        businessDelegate.setServiceType("JMS");
        client.doTask();
    }
}

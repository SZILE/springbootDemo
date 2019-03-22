package org.design.pattern.business_delegate;

/**
 * @ClassName EJBService
 * @Description 实体服务类
 * @Author shipc
 * @Date 2019/3/22 10:56
 * @Version 1.0
 */
public class EJBService implements BusinessService {
    @Override
    public void doProcessing() {
        System.out.println("Processing task by invoking EJB Service");
    }
}

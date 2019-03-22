package org.design.pattern.business_delegate;

/**
 * @ClassName BusinessLookUp
 * @Description 业务查询服务
 * @Author shipc
 * @Date 2019/3/22 11:00
 * @Version 1.0
 */
public class BusinessLookUp {
    public BusinessService getBusinessService(String serviceType){
        if(serviceType.equalsIgnoreCase("EJB")){
            return new EJBService();
        }else {
            return new JMSService();
        }
    }
}

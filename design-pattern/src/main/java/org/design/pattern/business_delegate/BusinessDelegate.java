package org.design.pattern.business_delegate;

/**
 * @ClassName BusinessDelegate
 * @Description 业务代表
 * @Author shipc
 * @Date 2019/3/22 10:59
 * @Version 1.0
 */
public class BusinessDelegate {
    private BusinessLookUp lookupService = new BusinessLookUp();
    private BusinessService businessService;
    private String serviceType;

    public void setServiceType(String serviceType){
        this.serviceType = serviceType;
    }

    public void doTask() {
        businessService = lookupService.getBusinessService(serviceType);
        businessService.doProcessing();
    }
}

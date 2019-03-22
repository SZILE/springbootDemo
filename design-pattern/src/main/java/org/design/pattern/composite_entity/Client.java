package org.design.pattern.composite_entity;

/**
 * @ClassName Client
 * @Description 组合实体的客户端
 * @Author shipc
 * @Date 2019/3/22 14:26
 * @Version 1.0
 */
public class Client {

    private CompositeEntity compositeEntity = new CompositeEntity();

    public void printData() {
        for(int i =0; i < compositeEntity.getData().length; i++) {
            System.out.println("Data:" + compositeEntity.getData()[i]);
        }
    }

    public void setData(String data1, String data2) {
        compositeEntity.setData(data1, data2);
    }
}

package org.design.pattern.composite_entity;

/**
 * @ClassName CompositeEntity
 * @Description 组合实体
 * @Author shipc
 * @Date 2019/3/22 14:22
 * @Version 1.0
 */
public class CompositeEntity {
    private CoarseGrainedObject cgo = new CoarseGrainedObject();

    public void setData(String data1, String data2){
        cgo.setData(data1,data2);
    }

    public String[] getData() {
        return cgo.getData();
    }
}

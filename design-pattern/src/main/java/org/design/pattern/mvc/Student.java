package org.design.pattern.mvc;

/**
 * @ClassName Student
 * @Description  数据模型
 * @Author shipc
 * @Date 2019/3/22 10:06
 * @Version 1.0
 */
public class Student {
    private String rollNo;
    private String name;

    public String getRollNo() {
        return rollNo;
    }

    public void setRollNo(String rollNo) {
        this.rollNo = rollNo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

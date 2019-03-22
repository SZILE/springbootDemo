package org.design.pattern.data_access_object;

/**
 * @ClassName Student
 * @Description 数值对象
 * @Author shipc
 * @Date 2019/3/22 14:57
 * @Version 1.0
 */
public class Student {
    private String name;
    private int rollNo;

    public Student(String name, int rollNo) {
        this.name = name;
        this.rollNo = rollNo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRollNo() {
        return rollNo;
    }

    public void setRollNo(int rollNo) {
        this.rollNo = rollNo;
    }
}

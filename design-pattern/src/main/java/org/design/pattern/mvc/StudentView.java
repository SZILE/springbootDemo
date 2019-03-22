package org.design.pattern.mvc;

/**
 * @ClassName StudentView
 * @Description 视图
 * @Author shipc
 * @Date 2019/3/22 10:08
 * @Version 1.0
 */
public class StudentView {
    public void printStudentDetails(String studentName, String studentRollNo) {
        System.out.println("Student:");
        System.out.println("Name:" + studentName);
        System.out.println("Roll No:" + studentRollNo);
    }
}

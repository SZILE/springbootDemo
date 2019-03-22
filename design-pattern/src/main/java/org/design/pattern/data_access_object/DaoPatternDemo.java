package org.design.pattern.data_access_object;

/**
 * @ClassName DaoPatternDemo
 * @Description
 * @Author shipc
 * @Date 2019/3/22 15:13
 * @Version 1.0
 */
public class DaoPatternDemo {

    public static void main(String[] args) {
        StudentDao studentDao = new StudentDaoImpl();

        for (Student student: studentDao.getAllStudents()) {
            System.out.println("Student: [RollNo : " + student.getRollNo() + ", Name : " + student.getName() + "]");
        }

        Student student = studentDao.getAllStudents().get(0);
        student.setName("Michael");
        studentDao.updateStudent(student);

        studentDao.getStudent(0);
        System.out.println("Student : [RollNo : " + student.getRollNo() + ", Name : " + student.getName() + "]");
    }
}

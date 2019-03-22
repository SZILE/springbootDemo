package org.design.pattern.data_access_object;

import java.util.ArrayList;
import java.util.List;

/**
 * @ClassName StudentDaoImpl
 * @Description
 * @Author shipc
 * @Date 2019/3/22 15:01
 * @Version 1.0
 */
public class StudentDaoImpl implements StudentDao {
    /**
     * 列表是当做一个数据库
     * */
    private List<Student> students;

    public StudentDaoImpl() {
        students = new ArrayList<Student>();
        Student student1 = new Student("Robert",0);
        Student student2 = new Student("John", 1);
        students.add(student1);
        students.add(student2);
    }

    /**
     * 从数据库中检索学生名单
     * @return
     */
    @Override
    public List<Student> getAllStudents() {
        return students;
    }

    @Override
    public Student getStudent(int rollNo) {
        return students.get(rollNo);
    }

    @Override
    public void updateStudent(Student student) {
        students.get(student.getRollNo()).setName(student.getName());
        System.out.println("Studnet: Roll No " + student.getRollNo() + ", updated in the database.");
    }

    @Override
    public void deleteStudent(Student student) {
        students.remove(student.getRollNo());
        System.out.println("Student: Roll No "+ student.getRollNo() + ", delete from database.");
    }
}

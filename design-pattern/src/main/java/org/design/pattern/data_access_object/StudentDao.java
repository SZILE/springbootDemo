package org.design.pattern.data_access_object;

import java.util.List;

/**
 * @ClassName StudentDao
 * @Description 数据访问对象接口
 * @Author sxt
 * @Date 2019/3/22 14:58
 * @Version 1.0
 */
public interface StudentDao {
    List<Student> getAllStudents();
    Student getStudent(int rollNo);
    void updateStudent(Student student);
    void deleteStudent(Student student);
}

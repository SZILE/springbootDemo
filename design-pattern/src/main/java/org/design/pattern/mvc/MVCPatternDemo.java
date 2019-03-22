package org.design.pattern.mvc;

/**
 * @ClassName MVCPatternDemo
 * @Description
 * @Author shipc
 * @Date 2019/3/22 10:30
 * @Version 1.0
 */
public class MVCPatternDemo {

    public static void main(String[] args) {
        /*从数据库获取学生记录*/
        Student model = retriveStudentFromDtabase();

        StudentView view = new StudentView();

        StudentController controller = new StudentController(model, view);
        controller.updateView();

        controller.setStudentName("John");
        controller.updateView();
    }

    private static Student retriveStudentFromDtabase() {
        Student student = new Student();
        student.setRollNo("10");
        student.setName("Robert");
        return student;
    }
}

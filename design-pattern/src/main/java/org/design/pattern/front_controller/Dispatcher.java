package org.design.pattern.front_controller;

/**
 * @ClassName Dispatcher
 * @Description 调度器
 * @Author shipc
 * @Date 2019/3/22 15:37
 * @Version 1.0
 */
public class Dispatcher {
    private StudentView studentView;
    private HomeView homeView;

    public Dispatcher() {
        studentView = new StudentView();
        homeView = new HomeView();
    }

    public void dispatch(String request) {
        if(request.equalsIgnoreCase("STUDENT")) {
            studentView.show();
        }else {
            homeView.show();
        }
    }
}

package org.design.pattern.front_controller;

/**
 * @ClassName FrontControllerPatternDemo
 * @Description
 * @Author shipc
 * @Date 2019/3/22 15:45
 * @Version 1.0
 */
public class FrontControllerPatternDemo {
    public static void main(String[] args) {
        FrontController frontController = new FrontController();
        frontController.dispatchRequest("HOME");
        frontController.dispatchRequest("STUDENT");
    }
}

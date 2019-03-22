package org.design.pattern.front_controller;

/**
 * @ClassName FrontController
 * @Description 前端控制器
 * @Author shipc
 * @Date 2019/3/22 15:40
 * @Version 1.0
 */
public class FrontController {
    private Dispatcher dispatcher;

    public FrontController() {
        dispatcher = new Dispatcher();
    }

    private boolean isAuthenticUser() {
        System.out.println("User is authenticated successfully");
        return true;
    }

    private void trackRequest(String request) {
        System.out.println("Page requested: " + request);
    }

    public void dispatchRequest(String request) {
        //记录每一个请求
        trackRequest(request);
        //对用户进行身份验证
        if(isAuthenticUser()) {
            dispatcher.dispatch(request);
        }
    }
}

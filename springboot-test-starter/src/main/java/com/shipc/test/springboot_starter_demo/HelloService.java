package com.shipc.test.springboot_starter_demo;

/**
 * @ClassName com.shipc.test.springboot_starter_demo.HelloService
 * @Description
 * @Author shipc
 * @Date 2019/3/19 19:36
 * @Version 1.0
 */
public class HelloService {  //依据此类的存在与否来创建这个类的Bean，这个类可以是第三方类库的类。
    private String msg;

    public String sayHello() {
        return "Hello " + msg;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }
}

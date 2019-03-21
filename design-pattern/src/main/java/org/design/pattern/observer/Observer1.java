package org.design.pattern.observer;

/**
 * @ClassName Observer1
 * @Description
 * @Author shipc
 * @Date 2019/3/21 14:49
 * @Version 1.0
 */
public class Observer1 implements Observer{
    @Override
    public void update() {
        System.out.println("observer1 has received!");
    }
}

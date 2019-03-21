package org.design.pattern.observer;

/**
 * @ClassName Observer2
 * @Description
 * @Author shipc
 * @Date 2019/3/21 14:50
 * @Version 1.0
 */
public class Observer2 implements Observer{
    @Override
    public void update() {
        System.out.println("observer2 has received!");
    }
}

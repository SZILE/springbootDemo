package org.design.pattern.observer;

/**
 * @ClassName MySubject
 * @Description
 * @Author shipc
 * @Date 2019/3/21 15:17
 * @Version 1.0
 */
public class MySubject extends AbstractSubject {

    @Override
    public void operation() {
        System.out.println("update self!");
        notifyObservers();
    }
}

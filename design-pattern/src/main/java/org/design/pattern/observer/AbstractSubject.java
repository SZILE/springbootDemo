package org.design.pattern.observer;

import java.util.Enumeration;
import java.util.Vector;

/**
 * @ClassName AbstractSubject
 * @Description
 * @Author shipc
 * @Date 2019/3/21 14:58
 * @Version 1.0
 */
public abstract class AbstractSubject implements Subject{

    private Vector<Observer> vector = new Vector<>();

    @Override
    public void add(Observer observer) {
        vector.add(observer);
    }

    @Override
    public void del(Observer observer) {
        vector.remove(observer);
    }

    @Override
    public void notifyObservers() {
        Enumeration<Observer> enumo = vector.elements();
        while (enumo.hasMoreElements()){
            enumo.nextElement().update();
        }
    }

}

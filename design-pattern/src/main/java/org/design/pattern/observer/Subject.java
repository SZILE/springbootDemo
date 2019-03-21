package org.design.pattern.observer;

/**
 * @ClassName Subject
 * @Description
 * @Author sxt
 * @Date 2019/3/21 14:51
 * @Version 1.0
 */
public interface Subject {

    /*增加观察者*/
    public void add(Observer observer);

    /*删除观察者*/
    public void del(Observer observer);

    /*通知所有的观察者*/
    public void notifyObservers();

    /*自身的操作*/
    public void operation();
}

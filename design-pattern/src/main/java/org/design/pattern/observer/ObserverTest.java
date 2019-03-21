package org.design.pattern.observer;

/**
 * @ClassName ObserverTest
 * @Description
 * @Author shipc
 * @Date 2019/3/21 15:18
 * @Version 1.0
 */
public class ObserverTest {
    public static void main(String[] args) {
        Subject sub = new MySubject();
        sub.add(new Observer1());
        sub.add(new Observer2());

        sub.operation();
    }
}

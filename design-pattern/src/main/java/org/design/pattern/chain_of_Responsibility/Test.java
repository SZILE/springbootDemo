package org.design.pattern.chain_of_Responsibility;

/**
 * @ClassName Test
 * @Description
 * @Author shipc
 * @Date 2019/3/21 17:56
 * @Version 1.0
 */
public class Test {
    public static void main(String[] args) {
        MyHandler h1 = new MyHandler("h1");
        MyHandler h2 = new MyHandler("h2");
        MyHandler h3 = new MyHandler("h3");

        h1.setHandler(h2);
        h2.setHandler(h3);

        h1.operator();
    }
}

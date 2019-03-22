package org.design.pattern.composite_entity;

/**
 * @ClassName CompositeEntityPatternDemo
 * @Description
 * @Author shipc
 * @Date 2019/3/22 14:29
 * @Version 1.0
 */
public class CompositeEntityPatternDemo {
    public static void main(String[] args) {
        Client client = new Client();
        client.setData("Test","Data");
        client.printData();
        client.setData("Second Test","Data1");
        client.printData();
    }
}

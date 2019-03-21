package org.design.pattern.interpreter;

/**
 * @ClassName Test
 * @Description 解释器模式
 * @Author shipc
 * @Date 2019/3/21 19:44
 * @Version 1.0
 */
public class Test {
    public static void main(String[] args) {
        int result = new Minus().interpret((new Context(new Plus().interpret(new Context(9,2)),8)));
        System.out.println(result);
    }
}

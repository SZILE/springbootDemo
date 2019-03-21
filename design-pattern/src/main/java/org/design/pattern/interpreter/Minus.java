package org.design.pattern.interpreter;

/**
 * @ClassName Minus
 * @Description
 * @Author shipc
 * @Date 2019/3/21 19:43
 * @Version 1.0
 */
public class Minus implements Expression {
    @Override
    public int interpret(Context context) {
        return context.getNum1() - context.getNum2();
    }
}

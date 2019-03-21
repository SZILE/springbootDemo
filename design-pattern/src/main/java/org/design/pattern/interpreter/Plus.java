package org.design.pattern.interpreter;

/**
 * @ClassName Plus
 * @Description
 * @Author shipc
 * @Date 2019/3/21 19:42
 * @Version 1.0
 */
public class Plus implements Expression{
    @Override
    public int interpret(Context context) {
        return context.getNum1() + context.getNum2();
    }
}

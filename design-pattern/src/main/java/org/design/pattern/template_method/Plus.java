package org.design.pattern.template_method;

/**
 * @ClassName Plus
 * @Description
 * @Author shipc
 * @Date 2019/3/21 14:20
 * @Version 1.0
 */
public class Plus extends AbstractCalculator {
    @Override
    public int calculate(int num1, int num2) {
        return num1 + num2;
    }
}

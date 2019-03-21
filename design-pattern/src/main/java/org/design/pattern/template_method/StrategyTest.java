package org.design.pattern.template_method;

/**
 * @ClassName StrategyTest
 * @Description
 * @Author shipc
 * @Date 2019/3/21 14:22
 * @Version 1.0
 */
public class StrategyTest {

    public static void main(String[] args) {
        String exp = "8+8";
        AbstractCalculator cal = new Plus();
        int result = cal.calculate(exp, "\\+");
        System.out.println(result);
    }
}

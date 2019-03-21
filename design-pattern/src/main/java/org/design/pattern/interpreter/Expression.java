package org.design.pattern.interpreter;

/**
 * @ClassName Expression
 * @Description
 * @Author sxt
 * @Date 2019/3/21 19:39
 * @Version 1.0
 */

public interface Expression {
    /**
     *
     * @param context
     * @return
     */
    int interpret(Context context);
}

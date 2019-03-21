package org.design.pattern.chain_of_Responsibility;

/**
 * @ClassName AbstractHandler
 * @Description
 * @Author shipc
 * @Date 2019/3/21 17:52
 * @Version 1.0
 */
public abstract class AbstractHandler {
    private Handler handler;

    public Handler getHandler(){
        return handler;
    }

    public void setHandler(Handler handler) {
        this.handler = handler;
    }
}

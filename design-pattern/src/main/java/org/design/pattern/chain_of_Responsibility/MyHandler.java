package org.design.pattern.chain_of_Responsibility;

/**
 * @ClassName MyHandler
 * @Description
 * @Author shipc
 * @Date 2019/3/21 17:53
 * @Version 1.0
 */
public class MyHandler extends AbstractHandler implements Handler {

    private String name;

    public MyHandler(String name) {
        this.name = name;
    }

    @Override
    public void operator() {
        System.out.println(name + "deal!");
        if(getHandler() != null) {
            getHandler().operator();
        }
    }
}

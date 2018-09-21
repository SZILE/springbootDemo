package org.design.pattern.adapter;

/**
 * 类的适配器
 * 
 * @author ShiPC
 *
 * @date 2018年9月20日
 *
 */
public class Adapter extends Source implements Targetable {

	@Override
	public void method2() {
		System.out.println("this is the targetable method!");
	}

}

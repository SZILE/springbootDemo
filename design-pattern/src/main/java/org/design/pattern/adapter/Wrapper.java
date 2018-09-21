package org.design.pattern.adapter;

/**
 * 对象的适配器
 * 
 * @author ShiPC
 *
 * @date 2018年9月20日
 *
 */
public class Wrapper implements Targetable {
	
	private Source source;
	
	public Wrapper(Source source) {
		super();
		this.source = source;
	}

	@Override
	public void method1() {
		source.method1();
	}

	@Override
	public void method2() {
		System.out.println("this is the targetable method!");
	}

}

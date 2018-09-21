package org.design.pattern.singleton;

public class Singleton01 {
	
	/* 持有私有静态实例，防止被引用，此处 赋值为null，目的是实现延迟加载*/
	private static Singleton01 instance = null;
	
	/* 私有构造方法，防止被实例化 */
	private Singleton01() {
	}
	
	/*静态工程方法，创建实例*/
	/**
	 * 这个方法虽然满足了基本需求，但是毫无线程安全保护
	 */
	public static Singleton01 getInstance() {
		if(instance == null) {
			instance = new Singleton01();
		}
		return instance;
	}
	
	/**
	 * synchronized关键字锁住的是这个对象，这样的用法，在性能上会有所下降，因为每次调用getInstance()，
	 * 都要对对象上锁，事实上，只有在第一次创建对象的时候需要加锁，之后就不需要了，所以，这个地方需要改进。
	 */
	public static synchronized Singleton01 getInstance01() {
		if(instance == null) {
			instance = new Singleton01();
		}
		return instance;
	}
	
	/**
	 * 似乎解决了之前提到的问题，将synchronized关键字加在了内部，也就是说当调用的时候是不需要加锁的，
	 * 只有在instance为null，并创建对象的时候才需要加锁，性能有一定的提升
	 */
	public static Singleton01 getInstance02() {
		if(instance == null) {
			synchronized (instance) {
				instance = new Singleton01();
			}
		}
		return instance;
	}
	
	/*如果该对象被用于序列化，可以保证对象在序列化前后保持一致*/
	public Object readResolve() {
		return instance;
	}
	
//----------进一步优化
	/**
	 * JVM内部的机制能保证当一个类被加载时，这个类的加载时线程互斥的。
	 */
	private static class SingletonFactory {
		private static Singleton01 instance = new Singleton01();
	}
	
	public static Singleton01 getInstance03() {
		return SingletonFactory.instance;
	}
	
}

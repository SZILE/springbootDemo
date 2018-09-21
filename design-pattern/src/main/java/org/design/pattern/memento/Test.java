package org.design.pattern.memento;

public class Test {
	public static void main(String[] args) {
		//创建原始类
		Original original = new Original("egg");
		//创建备忘录
		Storage storage = new Storage(original.createMenmento());
		
		System.out.println("初始化状态为：" + original.getValue());
		original.setValue("niu");
		System.out.println("修改后的状态为：" + original.getValue());
		
		original.restoreMemento(storage.getMemento());
		System.out.println("恢复后的状态为：" + original.getValue());
	}
}

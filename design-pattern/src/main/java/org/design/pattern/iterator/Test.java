package org.design.pattern.iterator;

public class Test {
	public static void main(String[] args) {
		Collection collection = new MyCollection();
		Iterator iterator = collection.iterator();
		
		while(iterator.hashNext()) {
			System.out.println(iterator.next());
		}
	}
}

package org.design.pattern.iterator;

public interface Collection {
	
	public Iterator iterator();
	//取得集合元素
	public Object get(int i);
	//获取集合大小
	public int size();
}

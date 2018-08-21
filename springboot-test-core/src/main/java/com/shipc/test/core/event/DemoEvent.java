package com.shipc.test.core.event;

import org.springframework.context.ApplicationEvent;

/**
 * @author ShiPC
 *
 * 2018年8月21日
 * 
 * 自定义事件
 */
public class DemoEvent extends ApplicationEvent {

	public DemoEvent(Object source, String msg) {
		super(source);
		this.msg = msg;
	}

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String msg;
	
	public String getMsg() {
		return msg;
	}
	
	public void setMsg(String msg) {
		this.msg = msg;
	}
}

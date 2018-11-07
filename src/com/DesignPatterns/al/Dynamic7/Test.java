package com.DesignPatterns.al.Dynamic7;

import java.lang.reflect.Method;

/**
 
 * @author qingruihappy
 * @data   2018年11月1日 上午12:39:35
 * @说明:获取一个接口里面的所有的方法
 */
public class Test {
	public static void main(String[] args) {
		Method[] methods = Moveable.class.getMethods();
		for(Method m : methods) {
			System.out.println(m.getName());
		}
	}
}

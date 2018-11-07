package com.DesignPatterns.al.Dynamic9;

import java.lang.reflect.Method;

public class TimeHandler implements InvocationHandler{
	//这个target在test类中传参的时候就已经传入进来了
	private Object target;



	public TimeHandler(Object target) {
		super();
		this.target = target;
	}



	@Override
	public void invoke(Object o, Method m) {
		//Object o这里的o是代理对象的实例，这里我们没用，并不代表以后我们不用
		System.out.println("代理类是谁呢？"+o.getClass().getName());
		long start = System.currentTimeMillis();
		System.out.println("starttime:" + start);
		try {
			//target是目标类不是代理类。目标类的方法，而不是代理类的方法。这里invoke是反射特有的方法，就是类（target）.方法(m)
			m.invoke(target);
		} catch (Exception e) {
			e.printStackTrace();
		}
		long end = System.currentTimeMillis();
		System.out.println("time:" + (end-start));
	}

}

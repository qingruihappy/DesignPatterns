package com.DesignPatterns.al.Dynamic92;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * @Author: feiweiwei
 * @Description:
 * @Created Date: 09:50 17/9/22.
 * @Modify by:
 */
public class DynamicProxyAOP implements InvocationHandler {
	private Object subject;

	public DynamicProxyAOP(Object subject) {
		this.subject = subject;
	}

	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		//在执行真实subject执行的方法
		System.out.println("before do something");
		//执行真实subject方法    //方法，对象，参数都有了就可以执行了。
		Object rtn = method.invoke(subject, args);
		//在执行结束后再执行的方法
		System.out.println("after do something");

		return rtn;
	}
}

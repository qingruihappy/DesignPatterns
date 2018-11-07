package com.DesignPatterns.al.Dynamic91;

import java.lang.reflect.Method;

public interface InvocationHandler {
	public void invoke(Object o, Method m);
}

package com.DesignPatterns.al.Dynamic92;

/**
 * @Author: feiweiwei
 * @Description:
 * @Created Date: 09:49 17/9/22.
 * @Modify by:
 */
public class RealSubject implements Subject {
	@Override
	public String doSomething(String name) {
		System.out.println(name + " do something!");
		return name + " do something!";
	}
}

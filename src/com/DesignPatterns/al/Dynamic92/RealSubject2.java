package com.DesignPatterns.al.Dynamic92;

/**
 * @Author: feiweiwei
 * @Description:
 * @Created Date: 09:56 17/9/22.
 * @Modify by:
 */
public class RealSubject2 implements Subject {
	@Override
	public String doSomething(String name) {
		System.out.println(name + " do something2!");
		return name + "do something2!";
	}
}

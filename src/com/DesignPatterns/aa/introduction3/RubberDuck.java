package com.DesignPatterns.aa.introduction3;

/**
 * 
 * @author qingruihappy
 * @data 2018年9月18日 下午11:40:07
 * @说明: 我是唐老鸭，我不会飞的。
 */
public class RubberDuck extends Duck {
	public void display() {
		System.out.println("我是唐老鸭，我的颜色是黄色的。");
	}

	public void fly() {
    System.out.println("我是唐老鸭，我是一个空方法。");
	}
}

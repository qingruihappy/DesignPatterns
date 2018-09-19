package com.DesignPatterns.aa.introduction5;

/**
 * 
 * @author qingruihappy
 * @data 2018年9月18日 下午11:40:07
 * @说明: 我是唐老鸭，我不会飞的。
 */
public class RubberDuck extends Duck implements Flyable,Quackable{
	public void display() {
		System.out.println("我是唐老鸭，我的颜色是黄色的。");
	}

	@Override
	public void quack() {
		System.out.println("我是唐老鸭，我会戚戚的叫。");
	}

	@Override
	public void fly() {
		System.out.println("我是唐老鸭，我不会飞");
	}

}

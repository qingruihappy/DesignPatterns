package com.DesignPatterns.aa.introduction5;

/**
 * 
 * @author qingruihappy
 * @data 2018年9月18日 下午11:26:12
 * @说明: 红头发的鸭继承父类
 */
public class RedheadDuck extends Duck implements Flyable,Quackable {

	public void display() {
		System.out.println("我是红头鸭，我的颜色是红色的。");
	}

	@Override
	public void quack() {
		System.out.println("我是红头鸭，我的会咕咕的叫。");
		
	}

	@Override
	public void fly() {
		System.out.println("我是红头鸭，我会飞");
		
	}
}

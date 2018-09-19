package com.DesignPatterns.aa.introduction5;

public class DecoyDuck extends Duck implements Flyable,Quackable{
	public void display() {
		System.out.println("我是诱饵鸭，我的颜色是白色的。");
	}

	@Override
	public void quack() {
		System.out.println("我是诱饵鸭，我会哇哇的叫。");
	}

	@Override
	public void fly() {
		System.out.println("我是诱饵鸭，我会飞");
	}

}

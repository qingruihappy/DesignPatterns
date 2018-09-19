package com.DesignPatterns.aa.introduction4;

public class DecoyDuck extends Duck{
	public void display() {
		System.out.println("我是诱饵鸭，我的颜色是白色的。");
	}

	public void fly() {
    System.out.println("我是诱饵鸭，我是一个空方法。");
	}
	
	public void quack() {
		System.out.println("我是诱饵鸭，我是另一个空方法。");
	}

}

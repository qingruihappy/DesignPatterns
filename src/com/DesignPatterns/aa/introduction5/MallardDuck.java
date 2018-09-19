package com.DesignPatterns.aa.introduction5;

/**
 * 
 * @author qingruihappy
 * @data 2018年9月18日 下午11:25:18
 * @说明: 野鸡鸭继承父类Duck
 */
public class MallardDuck extends Duck implements Flyable,Quackable {


	public void display() {
		System.out.println("我是野鸡鸭，我的颜色是绿色的。");
	}

	@Override
	public void quack() {
		System.out.println("我是野鸡鸭，我会呱呱的叫。");
	}

	@Override
	public void fly() {
		System.out.println("我是野鸡鸭，我会飞。");
	}
}

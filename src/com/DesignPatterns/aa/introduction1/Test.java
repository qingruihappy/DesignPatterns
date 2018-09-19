package com.DesignPatterns.aa.introduction1;

/**
 * 
 * @author qingruihappy
 * @data 2018年9月18日 下午11:29:22
 * @说明: 测试类
 */
public class Test {
	public static void main(String[] args) {
		// 野鸡鸭
		MallardDuck mallardDuck = new MallardDuck();
		// 红头鸭
		RedheadDuck redheadDuck = new RedheadDuck();
		mallardDuck.quack();
		mallardDuck.swim();
		mallardDuck.display();
		System.out.println("----------------------------------------------");
		redheadDuck.quack();
		redheadDuck.swim();
		redheadDuck.display();
	}
}

package com.DesignPatterns.aa.introduction4;

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
		// 唐老鸭
		RubberDuck rubberDuck = new RubberDuck();
		// 诱饵鸭
		DecoyDuck DecoyDuck = new DecoyDuck();
		mallardDuck.quack();
		mallardDuck.swim();
		mallardDuck.display();
		mallardDuck.fly();
		System.out.println("----------------------------------------------");
		redheadDuck.quack();
		redheadDuck.swim();
		redheadDuck.fly();
		System.out.println("----------------------------------------------");
		rubberDuck.quack();
		rubberDuck.swim();
		rubberDuck.fly();
		rubberDuck.display();
		System.out.println("----------------------------------------------");
		DecoyDuck.quack();
		DecoyDuck.swim();
		DecoyDuck.fly();
		DecoyDuck.display();
	}
}

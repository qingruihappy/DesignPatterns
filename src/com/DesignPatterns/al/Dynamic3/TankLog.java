package com.DesignPatterns.al.Dynamic3;

/**
 * 现在我们来说一下为什么用实现（聚合），不用继承。
 * 最概要的说法就是实现解耦，因为设计模式的要义是面向抽象编程而不是实现编程
 * 设计模式还有一个要义就是：少用继承，多用组合。
 * 下面我们举例来说明。
 * 
 * @author qingruihappy
 * @data 2018年10月31日 下午11:26:45
 * @说明:
 */
public class TankLog implements Moveable {
	Moveable t;

	public TankLog(Moveable t) {
		super();
		this.t = t;
	}

	@Override
	public void move() {
		System.out.println("tank开始打印日志");
		t.move();
		System.out.println("tank开始打印结束");
	}

}

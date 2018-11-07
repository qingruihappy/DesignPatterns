package com.DesignPatterns.al.Dynamic2;

/**
 * 聚合实现： 聚合：在一个类中有另一个类的实现，站在代理的角度来说就是当前类是代理类，里面的另一个类就是目标类，调用代理类的时候就是调用目标类的方法。
 * Tank2中有Tank的类，操作的就是Tank相关的方法。
 * 
 * @author qingruihappy
 * @data 2018年10月31日 下午11:26:45
 * @说明:
 */
public class Tank2 implements Moveable {
	Tank t;

	public Tank2(Tank t) {
		super();
		this.t = t;
	}

	@Override
	public void move() {
		long startTime = System.currentTimeMillis();
		t.move();
		long endTime = System.currentTimeMillis();
		System.out.println("tank总共花费时间是" + (endTime - startTime));
	}

}

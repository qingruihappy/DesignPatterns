package com.DesignPatterns.al.Dynamic6;
public class TankTime implements com.DesignPatterns.al.Dynamic6.Moveable{
	Moveable t;
	public TankTime(Moveable t) {
		super();
		this.t = t;
	}
	@Override
	public void move() {
		long startTime = System.currentTimeMillis();
		System.out.println("tank开始打印开始时间"+startTime);
		t.move();
		long endTime = System.currentTimeMillis();
		System.out.println("tank总共花费时间是" + (endTime - startTime));
	}
}
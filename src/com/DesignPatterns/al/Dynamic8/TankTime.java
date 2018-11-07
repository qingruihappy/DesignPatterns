package com.DesignPatterns.al.Dynamic8;
public class TankTime implements com.DesignPatterns.al.Dynamic8.Moveable{
	Moveable t;
	public TankTime(Moveable t) {
		super();
		this.t = t;
	}
@Override
public void move() {
   long start = System.currentTimeMillis();
   System.out.println("starttime:" + start);
   t.move();
   long end = System.currentTimeMillis();
   System.out.println("time:" + (end-start));
}
}
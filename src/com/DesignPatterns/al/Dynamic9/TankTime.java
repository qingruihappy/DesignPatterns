package com.DesignPatterns.al.Dynamic9;
import java.lang.reflect.Method;
public class TankTime implements com.DesignPatterns.al.Dynamic9.Moveable{
	public TankTime(InvocationHandler h) {
		super();
		this.h = h;
	}
    com.DesignPatterns.al.Dynamic9.InvocationHandler h;
@Override
public void move() {
    try {
    Method md = com.DesignPatterns.al.Dynamic9.Moveable.class.getMethod("move");
    h.invoke(this, md);
    }catch(Exception e) {e.printStackTrace();}
}
}
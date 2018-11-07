package com.DesignPatterns.al.Dynamic91;
import java.lang.reflect.Method;
public class TankTime implements com.DesignPatterns.al.Dynamic91.UserMgr{
	public TankTime(InvocationHandler h) {
		super();
		this.h = h;
	}
    com.DesignPatterns.al.Dynamic91.InvocationHandler h;
@Override
public void addUser() {
    try {
    Method md = com.DesignPatterns.al.Dynamic91.UserMgr.class.getMethod("addUser");
    h.invoke(this, md);
    }catch(Exception e) {e.printStackTrace();}
}
}
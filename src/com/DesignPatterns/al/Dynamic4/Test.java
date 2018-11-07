package com.DesignPatterns.al.Dynamic4;
/**
 
 * @author qingruihappy
 * @data   2018年11月1日 上午12:39:35
 * @说明:
 */
public class Test {
	public static void main(String[] args) {
		Moveable newProxyInstance = (Moveable) Proxy.newProxyInstance();
		newProxyInstance.move();
	}

}

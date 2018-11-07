package com.DesignPatterns.al.Dynamic6;
/**
 
 * @author qingruihappy
 * @data   2018年11月1日 上午12:39:35
 * @说明:现在要生成任意接口的代理
 */
public class Test {
	public static void main(String[] args) throws Exception {
		Moveable newProxyInstance = (Moveable) Proxy.newProxyInstance(Moveable.class);
		//newProxyInstance.move();
	}

}

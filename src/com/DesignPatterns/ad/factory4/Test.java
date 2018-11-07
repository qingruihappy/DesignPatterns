package com.DesignPatterns.ad.factory4;

/**
 * 
 * @author qingruihappy
 * @data   2018年11月5日 上午12:43:24
 * @说明:工厂设计模式就是一个产品对应着一个产品工厂。
 * 它有一个缺点就是，假如我不断的增加产品就会不断的要求增加产品工厂，就会出现工厂泛滥的情况
 */
public class Test {
	public static void main(String[] args) {
		VehicleFactory factory = new BroomFactory();
		Moveable m = factory.create();
		m.run();
	}
}

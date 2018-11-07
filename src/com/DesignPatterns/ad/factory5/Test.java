package com.DesignPatterns.ad.factory5;
/**
 * 
 * @author qingruihappy
 * @data   2018年11月5日 上午12:50:24
 * @说明:假如说工厂模式是一个产品对应着一个产品工厂的话，那么抽象工厂模式就是一组产品对应着一个产品工厂。
 * 抽象工厂模式也有缺点，就是假如要产生新的产品品种的时候改动的地方也比较大。
 * 比如该例子中的工厂中要加一个带着头盔的方法，那么以前的只要实现了AbstractFactory的工厂都要进行变更，严重违反了
 * 设计模式的对修改关闭，对新增开放的原则。
 * 有什么好的方法吗？
 * 我们来看一下spring提供的创建bean的原理及实现。
 */
public class Test {
	public static void main(String[] args) {
		//DefaultFactory f = new DefaultFactory();
		AbstractFactory f = new DefaultFactory();
		Vehicle v = f.createVehicle();
		v.run();
		Weapon w = f.createWeapon();
		w.shoot();
		Food a = f.createFood();
		a.printName();
	}
}

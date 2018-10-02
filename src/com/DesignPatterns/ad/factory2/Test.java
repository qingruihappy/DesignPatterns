package com.DesignPatterns.ad.factory2;

/**
 * 
 * @author qingruihappy
 * @data 2018年9月24日 下午5:37:16
 * @说明: 为了解决factory1抛出的问题，我们很容易的想到了多态，在PizzaStore定义一个抽象的方法，
 *      然后让两个不同的NYPizzaStore，NYPizzaStore去实现就可以了，里面声明一个定义规范的方法，是抽象的，
 *      这个时候两个实例去实现这个接口就行了。其中Pizza还是不变的。
 * 
 *      工厂方法模式定义一个创建对象的接口，但是由子类决定要实例化的类是哪一个。工厂方法让类把实例化推迟到子类。
 * 
 *      抽象的父类提供了一个创建对象的方法的接口，也成为“工厂方法”。在抽象的父类中，任何其他事项的方法，都可以使用到
 *      这个工厂方法建造出来的产品，但之后子类真正实现这个工厂方法并创建产品。
 * 
 *      工厂模式不是说允许子类本省运行时做决定，而是指在编写创建者类是，不需要知道实际创建产品是哪一个。选择了使用哪个子类
 *      ，自然就决定了实际创建的产品是什么。
 */
public class Test {

	public static void main(String[] args) {
		PizzaStore nyStore = new NYPizzaStore();
		PizzaStore chicagoStore = new ChicagoPizzaStore();

		Pizza pizza = nyStore.orderPizza("cheese");
		System.out.println("Ethan ordered a " + pizza.getName() + "\n");

		pizza = chicagoStore.orderPizza("cheese");
		System.out.println("Joel ordered a " + pizza.getName() + "\n");

		pizza = nyStore.orderPizza("clam");
		System.out.println("Ethan ordered a " + pizza.getName() + "\n");

		pizza = chicagoStore.orderPizza("clam");
		System.out.println("Joel ordered a " + pizza.getName() + "\n");

		pizza = nyStore.orderPizza("pepperoni");
		System.out.println("Ethan ordered a " + pizza.getName() + "\n");

		pizza = chicagoStore.orderPizza("pepperoni");
		System.out.println("Joel ordered a " + pizza.getName() + "\n");

		pizza = nyStore.orderPizza("veggie");
		System.out.println("Ethan ordered a " + pizza.getName() + "\n");

		pizza = chicagoStore.orderPizza("veggie");
		System.out.println("Joel ordered a " + pizza.getName() + "\n");
	}
}

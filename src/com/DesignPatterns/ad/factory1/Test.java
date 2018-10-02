package com.DesignPatterns.ad.factory1;
/**
 * 
 * @author qingruihappy
 * @data   2018年9月24日 下午4:42:54
 * @说明:其实这个最简单了。
 * 思路：
 * 1：我们定义一个工厂类，主要存储变化的东西，在这里也就是SimplePizzaFactory这个类了，这里面存储的是运行时才决定的东西.
 * 其实里面的，最开始的模式就是在PizzaStore里面放着的。只不过由于这部分内容都是变化的，所以单独把它抽出来放到了工厂里面去了。
 * 
 * 2:PizzaStore这里面主要都要SimplePizzaFactory的引用，根据传进来的参数来决定是调用那个pizza的实例，
 * 并且还有pizza的一些方法（注意这个时候就已经确定了是那个pizza的实例了）。让后确定了的pizza的实例在调用pizza相对应的方法。
 * 
 * 3，pizza类中主要就是pizza实例的一些方法。
 * 
 * 4，总结一句话总结上面的就是，当程序运行的时候会根据传入的PizzaStore会根据传入的参数去SimplePizzaFactory
 * （因为PizzaStore有SimplePizzaFactory的实例）里面确定Pizza究竟是谁的实例，让后返回，再在PizzaStore里面接着执行
 * 这个就是就会调用Pizza里面的方法，因为CheesePizza等子类都继承了Pizza，所以这个时候CheesePizza没有的方法，都会去父类里面找的。
 * 只需要把参数的值告诉Pizza就行了。
 * 
 * 补充：其实就相当于抽出来放到了另一个类中的道理是一样的。
 * 
 * 5，那问题来了，假如现在是两个工厂怎么办呢。就是说SimplePizzaFactory有两个，每个输出都不一样的呀。
 * 
 */
public class Test {
	public static void main(String[] args) {
		SimplePizzaFactory factory = new SimplePizzaFactory();
		PizzaStore store = new PizzaStore(factory);
		Pizza pizza = store.orderPizza("cheese");
		System.out.println("We ordered a " + pizza.getName() + "\n");
		System.out.println(pizza);
		pizza = store.orderPizza("veggie");
		System.out.println("We ordered a " + pizza.getName() + "\n");
		System.out.println(pizza);
	}
}

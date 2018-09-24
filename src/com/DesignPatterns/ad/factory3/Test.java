package com.DesignPatterns.ad.factory3;

/**
 * 
 * @author qingruihappy
 * @data 2018年9月25日 上午12:32:52
 * @说明: 其实简单的一句话来概括的话就是，我是纽约人，我爱吃纽约的披萨，哪首选我要选择纽约的披萨店，
 *      那我现在到了纽约披萨店了之后，我要的肯定是纽约的原料配方，当我选择到披萨的时候， 
 *      我的披萨prepare的肯定是从 纽约的原料配方中给我取的。
 */
public class Test {

	public static void main(String[] args) {
		PizzaStore nyStore = new NYPizzaStore();
		PizzaStore chicagoStore = new ChicagoPizzaStore();

		Pizza pizza = nyStore.orderPizza("cheese");
		// 1,找到PizzaStore抽象类中来,因为这个时候nyStore是NYPizzaStore
		// 2,调用了NYPizzaStore的createPizza方法
		// 3,在NYPizzaStore的方法中有NYPizzaIngredientFactory实例，所以这个时候调用了
		System.out.println("伊桑下令 " + pizza + "=======");

		pizza = chicagoStore.orderPizza("cheese");
		System.out.println("乔尔下令 " + pizza + "=======");

		pizza = nyStore.orderPizza("clam");
		System.out.println("伊桑下令 " + pizza + "=======");

		pizza = chicagoStore.orderPizza("clam");
		System.out.println("乔尔下令 " + pizza + "=======");

		pizza = nyStore.orderPizza("pepperoni");
		System.out.println("伊桑下令" + pizza + "=======");

		pizza = chicagoStore.orderPizza("pepperoni");
		System.out.println("乔尔下令" + pizza + "=======");

		pizza = nyStore.orderPizza("veggie");
		System.out.println("伊桑下令" + pizza + "=======");

		pizza = chicagoStore.orderPizza("veggie");
		System.out.println("乔尔下令" + pizza + "=======");
	}
}

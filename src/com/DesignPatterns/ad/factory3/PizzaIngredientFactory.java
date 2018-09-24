package com.DesignPatterns.ad.factory3;

/**
 * 
 * @author qingruihappy
 * @data 2018年9月24日 下午11:46:44
 * @说明:原料工厂
 */
public interface PizzaIngredientFactory {

	public Dough createDough();// 创建面团

	public Sauce createSauce();// 创建酱汁

	public Cheese createCheese();// 创建奶酪

	public Veggies[] createVeggies();// 创建蔬菜

	public Pepperoni createPepperoni();// 创建意大利香肠

	public Clams createClam();// 创建蛤

}

package com.DesignPatterns.ah.templatemethod2;

public class Test {
	public static void main(String[] args) {

 
		TeaWithHook teaHook = new TeaWithHook();
		CoffeeWithHook coffeeHook = new CoffeeWithHook();
 
		System.out.println("\n第二次制作茶叶中。。。。。。");
		teaHook.prepareRecipe();
 
		System.out.println("\n第二次制作咖啡中。。。。。。");
		coffeeHook.prepareRecipe();
	}
}

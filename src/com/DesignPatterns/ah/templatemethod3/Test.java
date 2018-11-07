package com.DesignPatterns.ah.templatemethod3;

import com.DesignPatterns.ah.templatemethod3.Coffee;
import com.DesignPatterns.ah.templatemethod3.Tea;

public class Test {
	public static void main(String[] args) {
 
		Tea tea = new Tea();
		Coffee coffee = new Coffee();
 
		System.out.println("\n制作茶叶中。。。。。。");
		tea.prepareRecipe();
 
		System.out.println("\n制作咖啡中。。。。。。");
		coffee.prepareRecipe();

	}
}

package com.DesignPatterns.ac.decorator_starbuzz;

public class Test {

	public static void main(String args[]) {
		Beverage beverage2 = new Whip(new Mocha(new Mocha(new DarkRoast())));
		System.out.println(beverage2.getDescription() + " $" + beverage2.cost());
	}
}

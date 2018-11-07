package com.DesignPatterns.ah.templatemethod2;

public abstract class CaffeineBeverageWithHook {
 
	void prepareRecipe() {
		boilWater();
		brew();
		pourInCup();
		if (customerWantsCondiments()) {//钩子
			addCondiments();
		}
	}
 
	abstract void brew();
 
	abstract void addCondiments();
 
	void boilWater() {
		System.out.println("烧水");
	}
 
	void pourInCup() {
		System.out.println("把材料倒入杯子");
	}
 
	boolean customerWantsCondiments() {
		return true;
	}
}

package com.DesignPatterns.ah.templatemethod3;

public abstract class CaffeineBeverage {
  
	final void prepareRecipe() {
		boilWater();
		brew();
		pourInCup();
		addCondiments();
	}
 
	abstract void brew();
  
	abstract void addCondiments();
 
	void boilWater() {
		System.out.println("烧水");
	}
  
	void pourInCup() {
		System.out.println("把材料倒入杯子");
	}
}

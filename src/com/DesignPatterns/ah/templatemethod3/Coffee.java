package com.DesignPatterns.ah.templatemethod3;

public class Coffee extends CaffeineBeverage {
	public void brew() {
		System.out.println("用开水煮咖啡");
	}
	public void addCondiments() {
		System.out.println("加入咖啡的配料");
	}
}

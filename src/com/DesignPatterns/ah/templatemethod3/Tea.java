package com.DesignPatterns.ah.templatemethod3;

public class Tea extends CaffeineBeverage {
	public void brew() {
		System.out.println("用开水煮茶叶");
	}
	public void addCondiments() {
		System.out.println("加入茶叶的配料");
	}
}

package com.DesignPatterns.aa.introduction4;

public class Duck {
	public void quack() {
		System.out.println("所有的鸭子都会呱呱叫quack()");
	}

	public void swim() {
		System.out.println("所有的鸭子都会游泳swim()");
	}

	public void display() {
		System.out.println("每个鸭子子类型（subtype）负责实现自己的display() 行为在屏幕上显示其外观。");
	}
	
	
	public void fly() {
		System.out.println("所有的鸭子都会飞fly()");
	}
}

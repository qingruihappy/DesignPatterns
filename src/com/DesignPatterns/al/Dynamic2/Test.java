package com.DesignPatterns.al.Dynamic2;

public class Test {
	public static void main(String[] args) {
		Moveable m=new Tank2(new Tank());
		m.move();
	}

}

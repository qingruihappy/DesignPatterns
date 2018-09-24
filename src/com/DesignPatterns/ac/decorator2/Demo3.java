package com.DesignPatterns.ac.decorator2;

public class Demo3 {
	public static void main(String[] args) {
		Son s = new Son();
		Mather m = new Mather(s);
		Father f = new Father(m);
		f.work();

}
}
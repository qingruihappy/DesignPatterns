package com.DesignPatterns.am.state;

public class MainStateB {
	 public static void main(String[] args) {
	        PersonB personB = new PersonB();

	        personB.setHour(7);
	        personB.doSth();

	        personB.setHour(11);
	        personB.doSth();

	        personB.setHour(19);
	        personB.doSth();

	        personB.setHour(22);
	        personB.doSth();

	        personB.setHour(10);
	        personB.doSth();
	        
	        personB.setHour(7);
	        personB.doSth();// ”–Œ Ã‚
	    }
}

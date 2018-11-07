package com.DesignPatterns.am.state;

public class HaveLunch extends State{
	 @Override
	    public void doSth(PersonB personB) {
	        if (personB.getHour() == 11) {
	            System.out.println("≥‘÷–ŒÁ∑π¡À£°");
	        } else {
	            personB.setState(new HaveDinner());
	            personB.doSth();
	        }
	    }
}

package com.DesignPatterns.al.Dynamic6;

import java.util.Random;

public class Tank implements Moveable {

	@Override
	public void move() {
		
		System.out.println("Ì¹¿ËÔÚÒÆ¶¯");
		try {
			Thread.sleep(new Random().nextInt(1000));
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
	}
}

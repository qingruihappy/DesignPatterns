package com.DesignPatterns.ad.factory4;

public class BroomFactory extends VehicleFactory{
	public Moveable create() {
		return new Broom();
	}
}

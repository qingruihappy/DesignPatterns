package com.DesignPatterns.ad.factory4;

public class CarFactory extends VehicleFactory{
	public Moveable create() {
		return new Car();
	}
}

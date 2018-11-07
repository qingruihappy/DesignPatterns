package com.DesignPatterns.ad.factory4;

public class PlaneFactory extends VehicleFactory{
	public Moveable create() {
		return new Plane();
	}
}

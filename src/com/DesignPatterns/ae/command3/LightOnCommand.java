package com.DesignPatterns.ae.command3;

public class LightOnCommand implements Command {
	Light light;
 
	public LightOnCommand(Light light) {
		this.light = light;
	}
 
	public void execute() {
		light.on();
	}
 
	public void undo() {
		light.off();
	}
}

package com.DesignPatterns.ae.command1;

//
// This is the invoker
//
public class SimpleRemoteControl {
	Command slot;// 有一个插槽持有命令，而这个命令控制着设备

	public SimpleRemoteControl() {
	}

	public void setCommand(Command command) {
		slot = command;
	}

	public void buttonWasPressed() {
		slot.execute();
	}
}

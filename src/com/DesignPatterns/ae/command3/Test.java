package com.DesignPatterns.ae.command3;

/**
 * 
 * @author qingruihappy
 * @data   2018年9月28日 下午11:53:23
 * @说明:
 *这里说白了就是在
 *步骤1：定义的接口的规范中又多加了一个撤销的抽象的方法
 *步骤2：在开关中一旦调用完命令指令的对象后，就会把这个命令指令的对象赋值给接口是定义的全局变量。来做记录。
 *步骤3：一旦调用撤销的命令就会拿到做记录的命令指令对象发出相应的指令，从而实现上一次的命令。
 *步骤4：这个时候也需要在命令指令的对象中记录上一次的调用的实例方法（也可以不用的）。
 *为什么要是不用呢，因为假如我们上一次是风扇是中风，现在调成高风了，我们现在假如撤销，我们知道现在调用的是
 *中风的命令对象，那也就是中风的方法了，所以没有必要记录的。所以说这个代码可以优化的。
 */
public class Test {

	public static void main(String[] args) {
		RemoteControlWithUndo remoteControl = new RemoteControlWithUndo();

		Light livingRoomLight = new Light("Living Room");

		LightOnCommand livingRoomLightOn = new LightOnCommand(livingRoomLight);
		LightOffCommand livingRoomLightOff = new LightOffCommand(livingRoomLight);

		remoteControl.setCommand(0, livingRoomLightOn, livingRoomLightOff);

		remoteControl.onButtonWasPushed(0);
		remoteControl.offButtonWasPushed(0);
		System.out.println(remoteControl);
		remoteControl.undoButtonWasPushed();
		remoteControl.offButtonWasPushed(0);
		remoteControl.onButtonWasPushed(0);
		System.out.println(remoteControl);
		remoteControl.undoButtonWasPushed();

		CeilingFan ceilingFan = new CeilingFan("Living Room");

		CeilingFanMediumCommand ceilingFanMedium = new CeilingFanMediumCommand(ceilingFan);
		CeilingFanHighCommand ceilingFanHigh = new CeilingFanHighCommand(ceilingFan);
		CeilingFanOffCommand ceilingFanOff = new CeilingFanOffCommand(ceilingFan);

		remoteControl.setCommand(0, ceilingFanMedium, ceilingFanOff);
		remoteControl.setCommand(1, ceilingFanHigh, ceilingFanOff);

		remoteControl.onButtonWasPushed(0);
		remoteControl.offButtonWasPushed(0);
		System.out.println(remoteControl);
		remoteControl.undoButtonWasPushed();

		remoteControl.onButtonWasPushed(1);
		System.out.println(remoteControl);
		remoteControl.undoButtonWasPushed();
	}
}

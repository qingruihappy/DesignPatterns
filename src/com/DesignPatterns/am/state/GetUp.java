package com.DesignPatterns.am.state;

public class GetUp extends State{
	/**
	 * 各个具体的状态角色，实现状态类，
	 */
	@Override
	public void doSth(PersonB personB) {
		if (personB.getHour() == 7) {
			System.out.println("起床啦！");
		} else {
			// 转移状态
			personB.setState(new HaveLunch());
			// 必须要调用行为
			personB.doSth();
		}
	}
}

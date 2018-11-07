package com.DesignPatterns.al.Dynamic1;

/**
 * 用继承计算tank中move的运行时间
 * 
 * @author qingruihappy
 * @data 2018年10月31日 下午11:19:43
 * @说明:
 */
public class Tank1 extends Tank {

	@Override
	public void move() {
		long startTime = System.currentTimeMillis();
		super.move();
		long endTime = System.currentTimeMillis();
		System.out.println("tank总共花费时间是" + (endTime - startTime));
	}

}

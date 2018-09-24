package com.DesignPatterns.ac.decorator2;

public class Father implements Work {
	Work worker;

	public Father(Work worker) {
		this.worker = worker;
	}

	@Override
	public void work() {
		worker.work();
		System.out.println("ÉÏ»­¿ò...");

	}

}

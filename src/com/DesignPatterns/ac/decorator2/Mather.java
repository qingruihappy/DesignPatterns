package com.DesignPatterns.ac.decorator2;

public class Mather implements Work {
	Work worker;

	public Mather(Work worker) {
		this.worker = worker;
	}

	public void work() {
		worker.work();
		System.out.println("¸ø»­ÉÏÑÕÉ«..");
	}

}

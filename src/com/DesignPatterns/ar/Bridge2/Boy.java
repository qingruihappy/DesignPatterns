package com.DesignPatterns.ar.Bridge2;

public class Boy {
	private String name;
	

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	

	
	public void give(Gift g, MM mm) {
		g.woshi(mm);
		System.out.println("==================");
	}
}

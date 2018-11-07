package com.DesignPatterns.al.Dynamic4;

public class Proxy {
public static Object newProxyInstance() {
	String src=
	"package com.DesignPatterns.al.Dynamic4;"+

	"public class TankTime implements Moveable {"+
		"Moveable t;"+

		"public TankTime(Moveable t) {"+
			"super();"+
			"this.t = t;"+
		"}"+

		"@Override"+
		"public void move() {"+

			"long startTime = System.currentTimeMillis();"+
			"System.out.println(\"tank开始打印开始时间\"+startTime);"+
			"t.move();"+
			"long endTime = System.currentTimeMillis();"+
			"System.out.println(\"tank总共花费时间是\"" + "(endTime - startTime));"+
		"}"+

	"}";

	return null;
	
}
}

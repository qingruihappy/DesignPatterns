package com.DesignPatterns.ad.factory6;

import java.io.IOException;
import java.util.Properties;

public class Test {

	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws Exception {
		BeanFactory f = new ClassPathXmlApplicationContext("com/DesignPatterns/ad/factory6/applicationContext.xml");
		//这里就和我们平常用的set注入进来的目的是一样的。
		Object o1 = f.getBean("v");
		Moveable m = (Moveable)o1;
		m.run();
		Object o2 = f.getBean("n");
		Moveable n = (Moveable)o2;
		n.run();
	}

}

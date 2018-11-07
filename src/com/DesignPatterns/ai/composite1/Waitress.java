package com.DesignPatterns.ai.composite1;

import java.util.Iterator;
  
public class Waitress {
	MenuComponent allMenus;
 
	public Waitress(MenuComponent allMenus) {
		this.allMenus = allMenus;
	}
 
	public void printMenu() {
		allMenus.print();
	}
  
	public void printVegetarianMenu() {
		Iterator iterator = allMenus.createIterator();//把菜单封装到一个迭代器中，让子类继承迭代器，最后通过子类来迭代

		System.out.println("3.0"+iterator);
		while (iterator.hasNext()) {
			System.out.println("3.1");
			MenuComponent menuComponent = (MenuComponent)iterator.next();
			try {
				if (menuComponent.isVegetarian()) {
					System.out.println("3.2");
					menuComponent.print();
				}
			} catch (UnsupportedOperationException e) {
				System.out.println("3.3");
			}
		}
	}
}

package com.DesignPatterns.aj.iterator2;

import java.util.*;

public class CafeMenu implements Menu {
	Hashtable menuItems = new Hashtable();
  
	public CafeMenu() {
		addItem("map3.1午饭",
			"鸡肉",
			true, 3.99);
		addItem("map3.2午饭",
			"鸭肉",
			false, 3.69);
		addItem("map3.3午饭",
			"鱼肉",
			true, 4.29);
	}
 
	public void addItem(String name, String description, 
	                     boolean vegetarian, double price) 
	{
		MenuItem menuItem = new MenuItem(name, description, vegetarian, price);
		menuItems.put(menuItem.getName(), menuItem);
	}
 
	public Hashtable getItems() {
		return menuItems;
	}
  
	public Iterator createIterator() {
		return menuItems.values().iterator();//这里用的是map中jdk自带的迭代器
	}
}

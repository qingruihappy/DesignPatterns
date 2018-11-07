package com.DesignPatterns.aj.iterator3;

import java.util.ArrayList;
import java.util.Iterator;

public class PancakeHouseMenu implements Menu {
	ArrayList menuItems;
 
	public PancakeHouseMenu() {
		menuItems = new ArrayList();
    
		addItem("集合2.1，早餐", 
				"玉米粥", 
				true,
				2.99);
	 
			addItem("集合2.2，早餐", 
				"大米粥", 
				true,
				2.99);
	 
			addItem("集合2.3，早餐",
				"小米粥",
				true,
				3.49);
	 
	}

	public void addItem(String name, String description,
	                    boolean vegetarian, double price)
	{
		MenuItem menuItem = new MenuItem(name, description, vegetarian, price);
		menuItems.add(menuItem);
	}
 
	public ArrayList getMenuItems() {
		return menuItems;
	}
  
	public Iterator createIterator() {
		return menuItems.iterator();//这里用的是jdk的list的迭代器
	}
  
}

package com.DesignPatterns.ai.composite1;

import java.util.Iterator;
import java.util.ArrayList;

public class Menu extends MenuComponent {
 
	ArrayList menuComponents = new ArrayList();
	String name;
	String description;
  
	public Menu(String name, String description) {
		this.name = name;
		this.description = description;
	}
 
	public void add(MenuComponent menuComponent) {
		menuComponents.add(menuComponent);
	}
 
	public void remove(MenuComponent menuComponent) {
		menuComponents.remove(menuComponent);
	}
 
	public MenuComponent getChild(int i) {
		return (MenuComponent)menuComponents.get(i);
	}
 
	public String getName() {
		return name;
	}
 
	public String getDescription() {
		return description;
	}

  
	public Iterator createIterator() {
		return new CompositeIterator(menuComponents.iterator());
	}
 
 
	public void print() {
		System.out.print("\n我是Menu的print()方法");
		System.out.print("\n" + getName());
		System.out.println(", " + getDescription());
		System.out.println("---------------------");
  
		Iterator iterator = menuComponents.iterator();
		while (iterator.hasNext()) {
			System.out.print("我是Menu的iterator.hasNext()");
			MenuComponent menuComponent = 
				(MenuComponent)iterator.next();
			menuComponent.print();
		}
	}
}

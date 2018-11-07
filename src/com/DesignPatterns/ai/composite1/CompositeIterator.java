package com.DesignPatterns.ai.composite1;

 
import java.util.*;
  
public class CompositeIterator implements Iterator {
	Stack<Iterator<?>> stack = new Stack<Iterator<?>>();
	public static int i=0;
	public static int j=0;
	public static int m=0;
	public static int n=0;
	public static int h=0;
	public static int u=0;
   
	public CompositeIterator(Iterator<?> iterator) {
		stack.push(iterator);
		System.out.println(h+++"CompositeIterator初始化方法"+stack.toString());
	}
   
	public Object next() {
		System.out.println("1.1");
		if (hasNext()) {
			System.out.println("1.2");
			Iterator<?> iterator = (Iterator<?>) stack.peek();
			System.out.println("1.3"+iterator);
			MenuComponent component = (MenuComponent) iterator.next();//这个next是jdk自带的不是上面的next方法，就是便利MenuComponent的
			if (component instanceof Menu) {
				stack.push(component.createIterator());//这里相当于假如组合中还有子菜单的话把菜单在假如到栈中，紧接着就会去便利这个刚假如栈中的菜单
				System.out.println("1.4"+stack.toString());
			} 
			System.out.println("1.5");
			return component;
		} else {
			System.out.println("1.6");
			return null;
		}
	}
  
	public boolean hasNext() {
		System.out.println("2.1"+stack.toString());
		if (stack.empty()) {
			System.out.println("2.2");
			return false;
		} else {
			Iterator<?> iterator = (Iterator<?>) stack.peek();
			System.out.println("2.3"+iterator);
			if (!iterator.hasNext()) {
				System.out.println("2.4");
				stack.pop();
				return hasNext();
			} else {
				System.out.println("2.5");
				return true;
			}
		}
	}
   
	public void remove() {
		throw new UnsupportedOperationException();
	}
}



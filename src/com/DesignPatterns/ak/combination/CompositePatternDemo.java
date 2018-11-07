package com.DesignPatterns.ak.combination;

public class CompositePatternDemo {
	public static void main(String[] args) {
	      Employee CEO = new Employee("John","1", 30000);
	 
	      Employee headSales = new Employee("Robert","1.1", 20000);
	 
	      Employee headMarketing = new Employee("Michel","1.2", 20000);
	 
	      Employee clerk1 = new Employee("Laura","1.2.1", 10000);
	      Employee clerk2 = new Employee("Bob","1.2.2", 10000);
	 
	      Employee salesExecutive1 = new Employee("Richard","1.1.1", 10000);
	      Employee salesExecutive2 = new Employee("Rob","1.1.2", 10000);
	 
	      CEO.add(headSales);
	      CEO.add(headMarketing);
	 
	      headSales.add(salesExecutive1);
	      headSales.add(salesExecutive2);
	 
	      headMarketing.add(clerk1);
	      headMarketing.add(clerk2);
	 
	      //打印该组织的所有员工
	      System.out.println(CEO); 
	      for (Employee headEmployee : CEO.getSubordinates()) {
	         System.out.println(headEmployee);
	         for (Employee employee : headEmployee.getSubordinates()) {
	            System.out.println(employee);
	         }
	      }        
	   }
}

package com.DesignPatterns.ap.NullObject1;

public class NullPatternDemo {
    public static void main(String[] args) {
  
       AbstractCustomer customer1 = CustomerFactory.getCustomer("Rob");
       AbstractCustomer customer2 = CustomerFactory.getCustomer("Bob");
       AbstractCustomer customer3 = CustomerFactory.getCustomer("Julie");
       AbstractCustomer customer4 = CustomerFactory.getCustomer("Laura");
  
       System.out.println("Customers");
       System.out.println("name:"+customer1.getName()+"。======isNil:"+customer1.isNil());
       System.out.println("name:"+customer2.getName()+"。======isNil:"+customer2.isNil());
       System.out.println("name:"+customer3.getName()+"。======isNil:"+customer3.isNil());
       System.out.println("name:"+customer4.getName()+"。======isNil:"+customer4.isNil());
    }
 }

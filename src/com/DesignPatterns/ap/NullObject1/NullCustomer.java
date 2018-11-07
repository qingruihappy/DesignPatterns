package com.DesignPatterns.ap.NullObject1;


public class NullCustomer extends AbstractCustomer {
    
    @Override
    public String getName() {
       return "没有发现该名字的人";
    }
  
    @Override
    public boolean isNil() {
       return true;
    }
 }


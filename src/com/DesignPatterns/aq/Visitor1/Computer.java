package com.DesignPatterns.aq.Visitor1;

public class Computer implements ComputerPart {
    
    ComputerPart[] parts;
  
    public Computer(){
       parts = new ComputerPart[] {new Mouse(), new Keyboard(), new Monitor()};      
    } 
  
  
    @Override
    public void accept(ComputerPartVisitor computerPartVisitor) {
       for (int i = 0; i < parts.length; i++) {
           System.out.println(parts[i]);
          parts[i].accept(computerPartVisitor);
       }
       //this就是computer
       computerPartVisitor.visit(this);
    }
 }

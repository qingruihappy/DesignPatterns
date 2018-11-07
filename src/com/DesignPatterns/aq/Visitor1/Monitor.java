package com.DesignPatterns.aq.Visitor1;

public class Monitor  implements ComputerPart {
    
    @Override
    public void accept(ComputerPartVisitor computerPartVisitor) {
       computerPartVisitor.visit(this);
    }
 }

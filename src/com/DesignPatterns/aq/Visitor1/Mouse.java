package com.DesignPatterns.aq.Visitor1;

public class Mouse  implements ComputerPart {
    
    @Override
    public void accept(ComputerPartVisitor computerPartVisitor) {
       computerPartVisitor.visit(this);
    }
 }

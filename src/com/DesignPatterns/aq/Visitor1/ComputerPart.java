package com.DesignPatterns.aq.Visitor1;

public interface ComputerPart {
    public void accept(ComputerPartVisitor computerPartVisitor);
}

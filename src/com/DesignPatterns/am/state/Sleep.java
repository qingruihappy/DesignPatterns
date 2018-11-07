package com.DesignPatterns.am.state;

public class Sleep extends State {
    @Override
    public void doSth(PersonB personB) {
        if (personB.getHour() == 22) {
            System.out.println("Ë¯¾õ¿©£¡");
        } else {
            personB.setState(new Study());
            personB.doSth();
        }
    }
}
package com.DesignPatterns.ar.Bridge2;

public class Test {
public static void main(String[] args) {
	Boy Boy=new Boy();
	MM mm=new MM();
	mm.setName("ÀöÀö");
	Gift g = new WarmGift(new Flower());
	MM mm1=new MM();
	mm1.setName("»¨»¨");
	Gift g1 = new WarmGift(new Ring());
	MM mm2=new MM();
	mm2.setName("ÌðÌð");
	Gift g2 = new WildGift(new Ring());
	MM mm3=new MM();
	mm3.setName("¾²¾²");
	Gift g3 = new WildGift(new Flower());
	Boy.give(g,mm);
	Boy.give(g1,mm);
	Boy.give(g2,mm);
	Boy.give(g3,mm);
}
}

package com.DesignPatterns.aj.iterator1;

import java.util.*;

public class MenuTestDrive {
	public static void main(String args[]) {
		//集合
        PancakeHouseMenu pancakeHouseMenu = new PancakeHouseMenu();
        //数组
        DinerMenu dinerMenu = new DinerMenu();
 
		Waitress waitress = new Waitress(pancakeHouseMenu, dinerMenu);
 
		waitress.printMenu();
	}

}

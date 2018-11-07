package com.DesignPatterns.ai.composite1;

public class MenuTestDrive {
	public static void main(String args[]) {

		MenuComponent pancakeHouseMenu = 
			new Menu("菜单1", "早餐");
		MenuComponent dinerMenu = 
			new Menu("菜单2", "午餐");
		MenuComponent cafeMenu = 
			new Menu("菜单3", "晚餐");
		MenuComponent dessertMenu = 
			new Menu("菜单2.4", "午餐-----午后茶");
  
		MenuComponent allMenus = new Menu("所有的菜单", "所有的餐点");
  
		allMenus.add(pancakeHouseMenu);
		allMenus.add(dinerMenu);
		allMenus.add(cafeMenu);
  
		pancakeHouseMenu.add(new MenuItem(
			"1.1：早餐", 
			"煎饼配炒蛋和吐司", 
			true,
			2.99));
		pancakeHouseMenu.add(new MenuItem(
			"1.2：早餐", 
			"煎饼加煎蛋，香肠", 
			true,
			2.99));
		pancakeHouseMenu.add(new MenuItem(
			"1.3：早餐",
			"用新鲜的蓝莓和蓝莓糖浆做的煎饼",
			true,
			3.49));

		dinerMenu.add(new MenuItem(
			"2.1：午餐",
			"全麦培根配生菜和西红柿", 
			true, 
			2.99));
		dinerMenu.add(new MenuItem(
			"2.2：午餐",
			"全麦面包配生菜和西红柿培根", 
			true, 
			2.99));
		dinerMenu.add(new MenuItem(
			"2.3：午餐",
			"每天一碗汤，外加一份土豆沙拉", 
			true, 
			3.29));

   
		dinerMenu.add(dessertMenu);
  
		dessertMenu.add(new MenuItem(
			"2.4.1:午餐-----午后茶",
			"苹果派，脆皮，上面有香草冰淇淋",
			true,
			1.59));
		dessertMenu.add(new MenuItem(
			"2.4.2:午餐-----午后茶",
			"纽约奶油芝士蛋糕，巧克力全麦面包",
			true,
			1.99));
		dessertMenu.add(new MenuItem(
			"2.4.3:午餐-----午后茶",
			"一勺覆盆子和一勺酸橙",
			true,
			1.89));

		cafeMenu.add(new MenuItem(
			"3.1:晚餐",
			"素食汉堡配全麦面包、生菜、西红柿和薯条",
			true, 
			3.99));
		cafeMenu.add(new MenuItem(
			"3.2:晚餐",
			"一杯当天的汤，外加一份沙拉",
			true, 
			3.69));
		cafeMenu.add(new MenuItem(
			"3.3:晚餐",
			"一份大份的墨西哥卷饼，配上整颗平托豆、莎莎酱和鳄梨酱",
			true, 
			4.29));
 
		Waitress waitress = new Waitress(allMenus);
   
		waitress.printVegetarianMenu();
 
	}
}

/**
 * Composite - allows composing objects in tree structure to represent
 * part-whole hierarchies Lets clients treat individual objects and composition
 * of objects uniformly
 * */
public class MenuTestDrive {

	public static void main(String[] args) {
		MenuComponent pancakes = new Menu("PANCAKE HOUSE", "Breakfast");
		MenuComponent dinnerMenu = new Menu("dine Tonight".toUpperCase(),
				"Dinner");
		MenuComponent desserts = new Menu("DESSERTS",
				"Something sweet for your soul!");
		MenuComponent allMenus = new Menu("All Menus".toUpperCase(),
				"All menus combined");
		allMenus.add(pancakes);
		allMenus.add(dinnerMenu);
		MenuComponent pasta = new MenuItem("Pasta", "Carbonara", 3.49, false);
		dinnerMenu.add(pasta);
		dinnerMenu.add(desserts);
		Waitress waitress = new Waitress(allMenus);
		waitress.printMenus();
		waitress.printVegetarianMenu();
	}
}

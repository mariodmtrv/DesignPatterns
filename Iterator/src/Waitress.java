public class Waitress {
	Menu dinerMenu;
	Menu pancakeHouseMenu;

	public Waitress(DinerMenu dinerMenu, PancakeHouseMenu pancakeHouseMenu) {
		this.dinerMenu = dinerMenu;
		this.pancakeHouseMenu = pancakeHouseMenu;
	}

	public void printMenu() {
		Iterator dinerIterator = dinerMenu.getIterator();
		printMenu(dinerIterator);
		// the same for panckake house
	}

	private void printMenu(Iterator menuIterator) {
		while (menuIterator.hasNext()) {
			System.out.println(menuIterator.next());
		}
	}

}

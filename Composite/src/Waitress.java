import java.util.Iterator;

/**
 * <b>Client</b>
 * <p>
 * Uses the component interface to manipulate the objects
 * </p>
 * */
public class Waitress {
	private MenuComponent allMenus;

	public Waitress(MenuComponent allMenus) {
		this.allMenus = allMenus;
	}

	public void printMenus() {
		System.out.println(allMenus.toString());
	}

	public void printVegetarianMenu() {
		Iterator iterator = (Iterator) allMenus.createIterator();
		while (iterator.hasNext()) {
			MenuComponent component = (MenuComponent) iterator.next();
			try {
				if (component.isVegetarian()) {
					System.out.println(component.toString());
				}
			} catch (UnsupportedOperationException ex) {

			}
		}
	}
}

import java.util.ArrayList;
import java.util.Iterator;

/**
 * <b>Composite</b>
 * <p>
 * Defines the behavior of elements that have children and stores children
 * components
 * </p>
 * */
public class Menu extends MenuComponent {
	private ArrayList<MenuComponent> menuComponents = new ArrayList<>();
	private String name;
	private String description;

	public Iterator createIterator() {
		return new CompositeIterator(menuComponents.iterator());

	}

	public Menu(String name, String description) {
		this.name = name;
		this.description = description;
	}

	public String getName() {
		return name;

	}

	public String getDescription() {
		return description;
	}

	public void add(MenuComponent component) {
		menuComponents.add(component);
	}

	public void remove(MenuComponent component) {
		menuComponents.remove(component);
	}

	public MenuComponent getChild(int index) {
		return menuComponents.get(index);
	}

	public String toString() {
		StringBuilder result = new StringBuilder();
		result.append("-----Menu----\n");
		result.append(getDescription());
		result.append("\n------------------\n");
		Iterator it = menuComponents.iterator();
		while (it.hasNext()) {
			MenuComponent component = (MenuComponent) it.next();
			result.append(component.toString());
		}
		return result.toString();
	}
}

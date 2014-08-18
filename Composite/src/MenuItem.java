import java.math.BigDecimal;
import java.util.Iterator;

/**
 * <b>Leaf</b>
 * <p>
 * Defines the behavior of the elements in the composition Implements the
 * operations the composite supports
 * </p>
 * */
public class MenuItem extends MenuComponent {
	private String name;
	private String description;
	private Double price;
	private boolean isVegetarian;

	public MenuItem(String name, String description, Double price,
			boolean isVegetarian) {
		this.name = name;
		this.description = description;
		this.price = price;
		this.isVegetarian = isVegetarian;
	}

	public boolean isVegetarian() {
		return this.isVegetarian;
	}

	public Iterator createIterator() {
		return new NullIterator();
	}

	public String getName() {

		return name;
	}

	public String getDescription() {

		return description;
	}

	public Double getPrice() {

		return price;
	}

	public String toString() {
		return "Item: " + getName() + '\n' + getDescription() + "\n $ "
				+ getPrice() + '\n';
	}
}

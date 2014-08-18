import java.math.BigDecimal;

/**
 * Defines interface for all objects in the composition Both the composite and
 * the leaf node
 * */
public abstract class MenuComponent {
	public String getName() {
		throw new UnsupportedOperationException();
	}

	public String getDescription() {
		throw new UnsupportedOperationException();
	}

	public boolean isVegetarian() {
		throw new UnsupportedOperationException();
	}

	public Double getPrice() {
		throw new UnsupportedOperationException();
	}

	public void add(MenuComponent component) {
		throw new UnsupportedOperationException();
	}

	public void remove(MenuComponent component) {
		throw new UnsupportedOperationException();
	}

	public MenuComponent getChild(int index) {
		throw new UnsupportedOperationException();
	}

	public String toString() {
		throw new UnsupportedOperationException();
	}

	public Object createIterator() {
		// TODO Auto-generated method stub
		return null;
	}

}

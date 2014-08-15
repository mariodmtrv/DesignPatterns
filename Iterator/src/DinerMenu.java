/*
 * Diner is not a typo :)
 * */
public class DinerMenu implements Menu {
	static final int MAX_ITEMS = 6;
	private MenuItem[] items;
	private int itemsCount;

	public DinerMenu() {
		items = new MenuItem[MAX_ITEMS];
	}

	public void addItem(MenuItem item) {
		items[itemsCount] = item;
		itemsCount++;

	}

	public Iterator getIterator() {
		return new DinerMenuIterator(items);
	}
}

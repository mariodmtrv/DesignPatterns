/**
 * Iterator provides a way to access the objects of an aggregate object
 * sequentially without exposing the underlying implementation
 * */
public class RestaurantTestDrive {

	public static void main(String[] args) {
		DinerMenu dinerMenu = new DinerMenu();
		PancakeHouseMenu pancakeHouseMenu = new PancakeHouseMenu();
		Waitress waitress = new Waitress(dinerMenu, pancakeHouseMenu);
		waitress.printMenu();
	}
}

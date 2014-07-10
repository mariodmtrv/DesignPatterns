/**
 * Created with IntelliJ IDEA.
 * User: Mario
 * Date: 7/10/14
 * Time: 8:25 PM
 * To change this template use File | Settings | File Templates.
 */

/**
 * Factory defines an interface for creating an object, but lets the subclasses decide which class to instantiate.
 * Lets a class defer instantiation to subclasses
 */
public class Franchise {
    public static void main(String[] args) {
        PizzaStore store = new NYPizzaStore();
        Pizza pizza = store.orderPizza(PizzaType.CHEESE);

        pizza.display();
    }
}

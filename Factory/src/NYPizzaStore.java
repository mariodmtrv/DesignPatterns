/**
 * Created with IntelliJ IDEA.
 * User: Mario
 * Date: 7/10/14
 * Time: 8:20 PM
 * To change this template use File | Settings | File Templates.
 */
public class NYPizzaStore extends PizzaStore {
    @Override
    Pizza createPizza(PizzaType type) {
        if (type == PizzaType.CHEESE) {
            return new NYStyleCheese();
        } else if (type == PizzaType.PEPPERONI) {
            return new Pepperoni();
        }
        return null;
    }
}

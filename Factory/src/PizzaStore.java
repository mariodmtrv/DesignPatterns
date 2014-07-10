/**
 * Created with IntelliJ IDEA.
 * User: Mario
 * Date: 7/10/14
 * Time: 8:14 PM
 * To change this template use File | Settings | File Templates.
 */
public abstract class PizzaStore {
 abstract Pizza createPizza(PizzaType type);
    public final Pizza orderPizza(PizzaType type){
        Pizza pizza = createPizza(type);
        pizza.prepare();
        pizza.bake();
        pizza.box();
        return pizza;
    }
}

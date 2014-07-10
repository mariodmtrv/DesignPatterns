/**
 * Created with IntelliJ IDEA.
 * User: Mario
 * Date: 7/10/14
 * Time: 6:51 PM
 * To change this template use File | Settings | File Templates.
 */
public class Espresso extends Beverage {
    public Espresso() {
        this.description = "Espresso";
    }

    @Override
    public double getCost() {
        return 1.99;
    }
}

/**
 * Created with IntelliJ IDEA.
 * User: Mario
 * Date: 7/10/14
 * Time: 6:43 PM
 * To change this template use File | Settings | File Templates.
 */

/**
 * A decorator assigns additional responsibility to objects dynamically.
 * A flexible alternative to subclassing for extending functionality
 */
public class RockostaCoffee {

    public static void main(String[] args) {
        Beverage beverage = new Espresso();
        System.out.println(beverage.getDescription() + " $ " + beverage.getCost());
        Beverage fancy = new Mocha(beverage);
        System.out.println(fancy.getDescription() + " $ " + fancy.getCost());
    }
}

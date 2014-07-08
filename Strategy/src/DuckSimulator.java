/**
 * Created with IntelliJ IDEA.
 * User: Mario
 * Date: 7/7/14
 * Time: 11:23 PM
 * To change this template use File | Settings | File Templates.
 */
/***
The Strategy Pattern defines a family of algorithms,
encapsulates each one, and makes them interchangeable.
Strategy lets the algorithm vary independently from clients that use it
***/
public class DuckSimulator {
    public static void main(String[] args) {
        Duck mallardDuck = new MallardDuck();
        mallardDuck.performFlight();
        mallardDuck.performQuack();
        Duck modelDuck = new ModelDuck();
        modelDuck.performFlight();
        modelDuck.setFlyBehaviour(new FlyRocketPowered());
        modelDuck.performFlight();
    }
}

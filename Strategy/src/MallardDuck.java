/**
 * Created with IntelliJ IDEA.
 * User: Mario
 * Date: 7/7/14
 * Time: 11:20 PM
 * To change this template use File | Settings | File Templates.
 */
public class MallardDuck extends Duck {
    public MallardDuck() {
        quackBehaviour = new Quack();
        flyBehaviour = new FlyWithWings();
    }

    public void display() {
        System.out.println("I'm a real Mallard duck");
    }
}


/**
 * Created with IntelliJ IDEA.
 * User: Mario
 * Date: 7/7/14
 * Time: 11:28 PM
 * To change this template use File | Settings | File Templates.
 */
public class ModelDuck extends Duck {
    public ModelDuck() {
        flyBehaviour = new FlyNoWay();
        quackBehaviour = new Quack();
    }

    public void display() {
        System.out.println("I am a model duck");
    }
}

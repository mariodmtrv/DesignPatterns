
/**
 * Created with IntelliJ IDEA.
 * User: Mario
 * Date: 7/7/14
 * Time: 11:11 PM
 * To change this template use File | Settings | File Templates.
 */
public abstract class Duck {
    FlyBehaviour flyBehaviour;
    QuackBehaviour quackBehaviour;

    public void performFlight() {
        flyBehaviour.fly();
    }

    public void setQuackBehaviour(QuackBehaviour quackBehaviour) {
        this.quackBehaviour = quackBehaviour;
    }

    public void setFlyBehaviour(FlyBehaviour flyBehaviour) {
        this.flyBehaviour = flyBehaviour;
    }

    public abstract void display();

    public void performQuack() {
        quackBehaviour.quack();
    }

    public void swim() {
        System.out.println("All ducks float, even decoys.");
    }

}

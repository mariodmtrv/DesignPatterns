/**
 * Created with IntelliJ IDEA.
 * User: Mario
 * Date: 7/10/14
 * Time: 8:16 PM
 * To change this template use File | Settings | File Templates.
 */

import java.util.ArrayList;

public abstract class Pizza {
    String name;
    private ArrayList<String> toppings;

    public Pizza() {
        this.toppings = new ArrayList<String>();
    }

    public void display() {
        System.out.println(this.name);
    }

    public abstract String prepare();

    public abstract String bake();

    public abstract String box();
}

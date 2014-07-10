/**
 * Created with IntelliJ IDEA.
 * User: Mario
 * Date: 7/10/14
 * Time: 8:22 PM
 * To change this template use File | Settings | File Templates.
 */
public class Pepperoni extends Pizza {
    public Pepperoni(){
        this.name = "Classic Pepperoni";
    }
    @Override
    public String prepare() {
        return "Prepared classic pepperoni";
    }

    @Override
    public String bake() {
        return "220C for 10 minutes";
    }

    @Override
    public String box() {
     return "Standard red box";    }
}

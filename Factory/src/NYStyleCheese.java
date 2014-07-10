/**
 * Created with IntelliJ IDEA.
 * User: Mario
 * Date: 7/10/14
 * Time: 8:22 PM
 * To change this template use File | Settings | File Templates.
 */
public class NYStyleCheese extends Pizza {
    public NYStyleCheese(){
       this.name = "NY Style Cheese";
    }
    @Override
    public String prepare() {
        return "Prepared NY Cheese";
    }

    @Override
    public String bake() {
        return "280C for 3 minutes";
    }

    @Override
    public String box() {
     return "Statue of Liberty style box";    }
}

/**
 * Created with IntelliJ IDEA.
 * User: Mario
 * Date: 7/10/14
 * Time: 6:48 PM
 * To change this template use File | Settings | File Templates.
 */
public abstract class Beverage {
    String description = "Unknown beverage";
    public String getDescription(){
        return description;
    }
    public abstract double getCost();
}

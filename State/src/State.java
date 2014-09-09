/**
 * Common interface for all concrete states
 * */
public interface State {

	public void insertQuarter();

	public void ejectQuarter();

	public void turnCrank();

	public void dispense();
}

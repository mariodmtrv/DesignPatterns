/**
 * Allows an object to alter its behavior when its inner state has changed The
 * object will appear to change its class
 * */
public class GumballMachineTestDrive {

	public static void main(String[] args) {
		GumballMachine gumballMachine = new GumballMachine(5);
		gumballMachine.insertQuarter();
		gumballMachine.turnCrank();
	}
}

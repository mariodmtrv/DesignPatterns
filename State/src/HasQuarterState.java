public class HasQuarterState implements State {
	GumballMachine gumballMachine;

	public HasQuarterState(GumballMachine gumballMachine) {
		this.gumballMachine = gumballMachine;
	}

	@Override
	public void insertQuarter() {
		System.out.println("There's money already in :D");

	}

	@Override
	public void ejectQuarter() {
		System.out.println("There you go.");
		gumballMachine.setState(gumballMachine.getNoQuarterState());

	}

	@Override
	public void turnCrank() {
		System.out.println("You turned.");
		gumballMachine.setState(gumballMachine.getSoldState());

	}

	@Override
	public void dispense() {
		System.out.println("No gumball dispensed.");

	}

}

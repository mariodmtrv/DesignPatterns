public class SoldOutState implements State {
	GumballMachine gumballMachine;

	public SoldOutState(GumballMachine gumballMachine) {
		this.gumballMachine = gumballMachine;
	}

	@Override
	public void insertQuarter() {
		System.out.println("No need to do that");

	}

	@Override
	public void ejectQuarter() {
		System.out.println("No coin inside, no coin outside.");

	}

	@Override
	public void turnCrank() {
		System.out.println("Nothing will happen");

	}

	@Override
	public void dispense() {
		System.out.println("A bunch of nothing is being dispensed");

	}

}

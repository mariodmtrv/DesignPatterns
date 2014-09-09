/**
 * Context - can have a number of internal states
 * */
public class GumballMachine {
	State soldOutState;
	State noQuarterState;
	State hasQuarterState;
	State soldState;
	State state = soldOutState;
	int count = 0;

	public GumballMachine(int gumballsCount) {
		soldOutState = new SoldOutState(this);
		noQuarterState = new NoQuarterState(this);
		hasQuarterState = new HasQuarterState(this);
		soldState = new SoldState(this);
		this.count = gumballsCount;
		if (gumballsCount > 0) {
			state = noQuarterState;
		}
	}

	public void insertQuarter() {
		state.insertQuarter();
	}

	public void ejectQuarter() {
		state.ejectQuarter();
	}

	public void turnCrank() {
		state.turnCrank();
		state.dispense();
	}

	public void setState(State state) {
		this.state = state;

	}

	public State getHasQuarterState() {
		// TODO Auto-generated method stub
		return null;
	}

	void releaseBall() {
		System.out.println("A ball comes out.");
		if (count != 0) {
			count = count - 1;
		}
	}

	public State getSoldOutState() {
		return soldOutState;
	}

	public State getNoQuarterState() {
		return noQuarterState;
	}

	public State getSoldState() {
		return soldState;
	}

	public State getState() {
		return state;
	}

	public int getCount() {
		return count;
	}

}

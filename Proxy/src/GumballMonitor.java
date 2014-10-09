public class GumballMonitor {
	GumballMachine machine;

	public GumballMonitor(GumballMachine machine) {
		this.machine = machine;

	}

	public void report() {
		System.out.println("Machine location" + machine.getLocation());
		System.out.println("Inventory size:" + machine.getCount());
	}
}

/**
 * Proxy - provides a surrogate or placeholder for another object to control
 * access to it
 * */
public class GumballMachineTestDrive {

	public static void main(String[] args) {
		int count = 0;
		if (args.length < 2) {
			System.out.println("Gumball machine <location> <inventory>");
			System.exit(1);
		}
		count = Integer.parseInt(args[1]);
		GumballMachine machine = new GumballMachine(args[0], count);
		GumballMonitor monitor = new GumballMonitor(machine);

		monitor.report();
	}

}

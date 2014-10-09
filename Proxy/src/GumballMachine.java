public class GumballMachine {
	// other instance variables
	String location;
	Integer count;

	public GumballMachine(String location, int count) {
		// other constructor pieces
		this.location = location;
		this.count = count;
	}

	public Integer getCount() {
		return count;
	}

	public String getLocation() {
		return location;
	}

}

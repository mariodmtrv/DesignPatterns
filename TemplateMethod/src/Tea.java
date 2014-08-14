import java.util.Random;

public class Tea extends CaffeineBeverage {

	@Override
	void brew() {
		System.out.println("Steeping the tea");

	}

	@Override
	void addCondiments() {
		System.out.println("Adding lemon");

	}

	private String getUserInput() {
		Random rand = new Random();
		int answer = rand.nextInt(2);
		return (answer < 1) ? "yes" : "no";

	}

	@Override
	boolean customerWantsCondiments() {
		String answer = getUserInput();
		if (answer.toLowerCase().startsWith("yes")) {
			return true;
		}
		return false;
	}

}

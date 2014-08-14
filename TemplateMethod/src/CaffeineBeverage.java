public abstract class CaffeineBeverage {
	/**
	 * Common step
	 * */
	void boilWater() {
		System.out.println("Boiling water");
	}

	/**
	 * Specific step child will implement it accordingly
	 * */
	abstract void brew();

	void pourDrinkInCup() {
		System.out.println("Pouring your drink in the cup");
	}

	abstract void addCondiments();

	/**
	 * Does nothing too meaningful by default Subclasses can override it
	 * */
	boolean customerWantsCondiments() {
		return true;
	}

	/**
	 * Encapsulated algorithm sequence
	 * */
	public final void prepareRecipe() {
		boilWater();
		brew();
		pourDrinkInCup();
		if (customerWantsCondiments()) {
			addCondiments();
		}
		customerWantsCondiments();
	}

}

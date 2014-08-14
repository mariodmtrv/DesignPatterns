/**
 * Defines a skeleton of an algorithm in a method deferring some steps to
 * subclasses. Template method allows subclasses to redefine certain steps of an
 * algorithm without changing its structure
 * */
public class Main {
	public static void main(String args[]) {
		Tea myTea = new Tea();
		myTea.prepareRecipe();
	}

}

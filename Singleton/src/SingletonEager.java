public class SingletonEager {
	/**
	 * Appropriate when the singleton is always used
	 * */
	private static SingletonEager uniqueInstance = new SingletonEager();

	private SingletonEager() {

	}

	public static SingletonEager getInstance() {
		return uniqueInstance;
	}
}

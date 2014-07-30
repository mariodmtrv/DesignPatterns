public class SingletonSynchronized {
	/**
	 * Thread safe, however synchronised is expensive and after the first time
	 * useless, may damage performance
	 * */
	private static SingletonSynchronized uniqueInstance;

	private SingletonSynchronized() {

	}

	public static synchronized SingletonSynchronized getInstance() {
		if (uniqueInstance == null) {
			uniqueInstance = new SingletonSynchronized();
		}
		return uniqueInstance;
	}

}

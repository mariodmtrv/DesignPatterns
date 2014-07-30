public class SingletonDoubleChecked {
	/**
	 * Reduces overhead, however may not be thread safe in Java 1.4 or earlier due to
	 * implementation issues of volatile
	 * */
	private static volatile SingletonDoubleChecked uniqueInstance;

	private SingletonDoubleChecked() {

	}

	public static SingletonDoubleChecked getInstance() {
		if (uniqueInstance == null) {
			uniqueInstance = new SingletonDoubleChecked();
		}
		return uniqueInstance;

	}
}

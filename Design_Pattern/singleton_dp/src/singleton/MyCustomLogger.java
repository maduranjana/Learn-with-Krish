package singleton;

public class MyCustomLogger {

	private static volatile MyCustomLogger customLogger;

	private MyCustomLogger() {

		if (customLogger != null) {

			throw new IllegalStateException("custom logger instance already here ");
		}
	}

	public static MyCustomLogger getCustomLogger() {

		MyCustomLogger lastLogger = customLogger;

		if (lastLogger == null) {

			synchronized (MyCustomLogger.class) {

				lastLogger = customLogger;

				if (lastLogger == null) {

					customLogger = lastLogger = new MyCustomLogger();

				}

			}

		}

		return lastLogger;
	}

}
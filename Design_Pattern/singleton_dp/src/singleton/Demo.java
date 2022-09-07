package singleton;

public class Demo {

	public static void main(String args[]) {

		MyCustomLogger logger = MyCustomLogger.getCustomLogger();

		MyCustomLogger logger1 = MyCustomLogger.getCustomLogger();

		if (logger == logger1) {

			System.out.println(logger + " = " + logger1 + " Objects reference are same ");
		}

	}

}

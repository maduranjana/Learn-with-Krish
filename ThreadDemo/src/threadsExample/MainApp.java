package threadsExample;

public class MainApp {

	public static void main(String[] args) {

		PlayerThread player1 = new PlayerThread("Sanath");
		PlayerThread player2 = new PlayerThread("Maheela");
		
//		player1.setPriority(1);
//		player2.setPriority(10);
		
		player1.run();
		player2.run();

	}

}

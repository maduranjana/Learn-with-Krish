package threadsExample;

public class PlayerThread extends Thread {

	public PlayerThread(String name) {
		super(name);
	}

	@Override
	public void run() {

		for (int i = 0; i <= 50; i++) {

			System.out.println(getName() + " (" + i + ")");

			try {
				sleep((int) (Math.random() * 1000));
			} catch (Exception e) {
				e.printStackTrace();
			}
		}

		System.out.println(getName() + " got 50 cheer!");
	}

}

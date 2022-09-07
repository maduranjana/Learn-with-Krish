package memento;

public class Demo {
	public static void main(String[] args) {

		CareTaker caretaker = new CareTaker();

		TaskProgress taskProgress = new TaskProgress();

		taskProgress.addLevel(new TaskLevel("T-LEVEL-1"));
		caretaker.saveProgress(taskProgress);
		System.out.println(taskProgress);

		taskProgress.addLevel(new TaskLevel("T-LEVEL-2"));
		caretaker.saveProgress(taskProgress);
		System.out.println(taskProgress);

		caretaker.undoProgress(taskProgress);

		System.out.println(taskProgress);
	}
}

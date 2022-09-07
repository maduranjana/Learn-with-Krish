package memento;

import java.util.Stack;

public class CareTaker {

	Stack<TaskProgress.ProgressMemento> taskHistory = new Stack<>();

	// save stack
	public void saveProgress(TaskProgress gameProgress) {
		taskHistory.push(gameProgress.saveProgress());
	}

	// undo state
	public void undoProgress(TaskProgress taskProgress) {
		if (!taskHistory.isEmpty())
			taskProgress.undoProgress(taskHistory.pop());
		else
			System.out.println("Can not undo...!");
	}

}

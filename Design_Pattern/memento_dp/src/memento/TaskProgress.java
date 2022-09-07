package memento;

import java.util.ArrayList;

public class TaskProgress {
	
	ArrayList<TaskLevel> taskLevel = new ArrayList<>();

	public void addLevel(TaskLevel inputTexts){
		taskLevel.add(inputTexts);

	}

	@Override
	public String toString(){
		return "Task level:"+taskLevel;
	}

	public ArrayList<TaskLevel> getProgressClone(){
		return (ArrayList)taskLevel.clone();
	}


	//save
	public ProgressMemento saveProgress(){
		return new ProgressMemento( getProgressClone());
	}

	//undo
	public void undoProgress(ProgressMemento progressMemento){
		taskLevel = progressMemento.getProgress();
	}
	

	static class ProgressMemento{

		ArrayList<TaskLevel> taskLevel = new ArrayList<>();

		public ProgressMemento( ArrayList<TaskLevel> taskLevel){
			this.taskLevel = taskLevel;
		}

		private ArrayList<TaskLevel> getProgress(){
			return taskLevel;
		}
	}

}

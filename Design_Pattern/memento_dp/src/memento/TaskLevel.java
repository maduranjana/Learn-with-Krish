package memento;

public class TaskLevel {
	
	String levelNumber;

	public TaskLevel(String levelNumber){
		
		this.levelNumber = levelNumber;
	}

	@Override
	public String toString(){
		return "Level number :"+levelNumber;
	}
}

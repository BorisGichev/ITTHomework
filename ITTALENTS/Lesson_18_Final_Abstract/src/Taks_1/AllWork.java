package Taks_1;

public class AllWork {
	private static final int DEFOULD_NUMBER_OF_TASKS = 10;
	private Task[] tasks;
	private int freePlacesForTasks;
	private int currentUnassignedTaskIndex;
	private int indexForAdding;

	public AllWork() {
		this.tasks = new Task[DEFOULD_NUMBER_OF_TASKS];
		this.setFreePlacesForTasks(DEFOULD_NUMBER_OF_TASKS);
		this.indexForAdding = 0;
		this.currentUnassignedTaskIndex=-1;
	}

	private void addTask(Task task) {
		if (task == null) {
			return;
		}
		this.tasks[indexForAdding] = task;
		this.freePlacesForTasks-=1;
		indexForAdding = (indexForAdding + 1) % this.tasks.length;
		this.setCurrentUnassignedNotFinishedTaskIndex();

	}

	public Task getNextTask() {
		if (this.currentUnassignedTaskIndex == -1) {
			return null;
		}
		Task temp=this.tasks[currentUnassignedTaskIndex];
			return temp;
	}

	public boolean isAllWorkDone() {
		for (int i = 0; i < tasks.length; i++) {
			if (this.tasks[i] != null && this.tasks[i].getWorkingHours() > 0) {
				return false;
			}
		}
		return true;
	}

	public void setCurrentUnassignedNotFinishedTaskIndex() {
		for (int i = 0; i < this.tasks.length; i++) {
			if (this.tasks[i] != null && this.tasks[i].hasNoOwner()&&this.tasks[i].getWorkingHours()!=0) {
				this.currentUnassignedTaskIndex = i;
				return;
			}
		}
		this.currentUnassignedTaskIndex = -1;
	}

	
	public void genarateTasks(){
		for (int i = 1; i <= tasks.length; i++) {
			String name="Task "+String.valueOf(i);
			this.addTask(new Task(name, i*2+1));
			setFreePlacesForTasks(getFreePlacesForTasks() - 1);
		}
	}
	public void showAllTasks(){
		for (int i = 0; i < tasks.length; i++) {
			if (this.tasks[i]!=null){
				System.out.println(this.tasks[i].toString());
			}
			
		}
	}

	public int getFreePlacesForTasks() {
		return freePlacesForTasks;
	}

	private void setFreePlacesForTasks(int freePlacesForTasks) {
		this.freePlacesForTasks = freePlacesForTasks;
	}
	
	public int getMaxNumberOfPlacesForTasks() {
		return this.tasks.length;
	}

	public int getCurrentUnassignedTask() {
		return currentUnassignedTaskIndex;
	}
}

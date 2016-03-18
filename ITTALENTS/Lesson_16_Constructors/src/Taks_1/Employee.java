package Taks_1;

public class Employee {
	private String name;
	private double hoursLeft;
	private Task currentTask;

	
	public Employee() {

		this.setName("Undefined");
		this.setHoursLeft(8);
	}
	
	public Employee(String name) {

		this.setName(name);
		this.setHoursLeft(8);
	}

	public double getHoursLeft() {
		return hoursLeft;
	}

	public void setHoursLeft(double hoursLeft) {
		if (hoursLeft < 0) {
			return;
		}
		if (hoursLeft > 8) {
			System.out.println("This worker has 8 hour working day");
			this.hoursLeft = 8;
		}
		this.hoursLeft = hoursLeft;
	}

	public Task getCurrentTask() {

		return currentTask;
	}

	public void setCurrentTask(Task currentTask) {
		if (currentTask == null) {
			return;
		}
		if (this.getCurrentTask()!=null) {
			this.removeTask();
		}
		this.currentTask = currentTask;
		this.currentTask.setOwner(this);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		if (name == null || name.length() == 0) {
			return;
		}
		this.name = name;
	}
	
	public void work() {
		if (this.getCurrentTask()==null) {
			System.out.println("No task");
			return;
		}
		if (this.getHoursLeft()>=this.getCurrentTask().getWorkingHours()) {
			this.setHoursLeft(this.getHoursLeft()-this.getCurrentTask().getWorkingHours());
			this.getCurrentTask().setWorkingHours(0);
			this.showReport();
			return;
			
		}
		if (this.getHoursLeft()<this.getCurrentTask().getWorkingHours()) {
			this.getCurrentTask().setWorkingHours(this.getCurrentTask().getWorkingHours()-this.getHoursLeft());
			this.setHoursLeft(0);
			this.showReport();
			return;
		}
		
	}
	
	public void showReport() {
		System.out.println("Name of worker "+this.getName());
		System.out.println("Working hours left of the worker "+this.getHoursLeft());
		this.getCurrentTask().printInfo();
		
	}
	
	public void removeTask() {
		this.currentTask.setOwner(null);
		this.currentTask=null;
	}
}

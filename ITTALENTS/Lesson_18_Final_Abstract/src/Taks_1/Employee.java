package Taks_1;

public class Employee {
	private static final int WORKING_HOURS_PER_DAY = 8;
	private String name;
	private Task currentTask;
	private int hoursLeft;
	private static AllWork allWork;

	public Employee(String name) {

		this.setName(name);
		if (Employee.allWork != null) {
			this.setCurrentTask(Employee.allWork.getNextTask());
			Employee.allWork.setCurrentUnassignedNotFinishedTaskIndex();
		}
	}

	public void work() {

		for (int i = 0; i < Employee.allWork.getMaxNumberOfPlacesForTasks(); i++) {
			if (this.hoursLeft != 0) {
				if (this.currentTask == null) {
					return;
				}
				this.showReport();
				int hours = this.hoursLeft
						- this.currentTask.getWorkingHours();

				if (hours >= 0) {
					this.currentTask.toString();
					this.setHoursLeft(hours);
					this.currentTask.setWorkingHours(0);
					this.showReport();
					this.currentTask.removeOwner();
					this.currentTask=null;
					this.setCurrentTask(Employee.allWork.getNextTask());
					Employee.allWork.setCurrentUnassignedNotFinishedTaskIndex();
				
					

				} else {
					this.currentTask.toString();
					this.currentTask.setWorkingHours(hours * (-1));
					this.setHoursLeft(0);
					this.showReport();

				}

			}

		}

	}

	public void startWorkingDay() {
		this.setHoursLeft(WORKING_HOURS_PER_DAY);
	}


	private void setCurrentTask(Task currentTask) {
		if (currentTask == null) {
			return;
		}

		this.currentTask = currentTask;
		this.currentTask.setOwner(this);
	}


	private void setHoursLeft(int hoursLeft) {
		if (hoursLeft < 0) {
			return;
		}
		if (hoursLeft > WORKING_HOURS_PER_DAY) {
			System.out.println("This worker has 8 hour working day");
			this.hoursLeft = WORKING_HOURS_PER_DAY;
		}
		this.hoursLeft = hoursLeft;
	}


	private void setName(String name) {
		if (name == null || name.length() == 0) {
			return;
		}
		this.name = name;
	}


	public static void setAllWork(AllWork allwork) {
		if (allwork==null) {
			return;
		}
		Employee.allWork = allwork;
	}

	public void showReport() {
		System.out.print(this.name+" has "+this.hoursLeft+" to go and");
		if (this.currentTask!=null) {
			System.out.println( " his current task is "+this.currentTask.toString());
			return;
		}
		System.out.println("he has no current task");
		
		
	
	}
}

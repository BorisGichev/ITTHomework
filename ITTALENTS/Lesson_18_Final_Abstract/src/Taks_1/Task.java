package Taks_1;

public class Task {

	private String name;
	private int workingHours;
	private Employee owner;

	public Task(String name, int workingHours) {

		this.setName(name);
		this.setWorkingHours(workingHours);
	}

	public void setOwner(Employee owner) {
		if (owner==null) {
			return;
		}
		this.owner = owner;
	}
	public void removeOwner() {
		this.owner = null;
	}

	public String getName() {
		return name;
	}

	private void setName(String name) {
		if (name == null || name.length() == 0) {
			return;
		}
		this.name = name;
	}

	public int getWorkingHours() {
		return workingHours;
	}

	public void setWorkingHours(int workingHours) {
		if (workingHours < 0) {
			return;
		}
		this.workingHours = workingHours;
	}

	public String toString() {

		return this.getName() + " has " + this.getWorkingHours()
				+ " hours left.";

	}

	public boolean hasNoOwner() {
		if (this.owner == null) {
			return true;
		}
		return false;

	}

}

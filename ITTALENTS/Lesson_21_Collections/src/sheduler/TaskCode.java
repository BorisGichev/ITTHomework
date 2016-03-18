package sheduler;

public class TaskCode extends Task {

	
	public TaskCode() {
		super.setText("I wont get desperate I`ll just keep coding");
	}

	public void doWork() {
		System.out.println(super.getText());

	}

}

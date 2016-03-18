package sheduler;


public class TaskDoNotFallAsleep extends Task {

	
	public TaskDoNotFallAsleep() {
		super.setText("I`m doing 10 pushups not to fall asleep");
	}

	@Override
	public void doWork() {
		System.out.println(super.getText());
		
	}

}
package sheduler;


public class TaskMixConcreete extends Task {

	
	public TaskMixConcreete() {
		super.setText("Mixing Mixing");
	}

	@Override
	public void doWork() {
		System.out.println(super.getText());
		
	}

}

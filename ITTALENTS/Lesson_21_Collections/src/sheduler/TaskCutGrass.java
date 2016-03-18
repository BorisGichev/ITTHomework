package sheduler;

public class TaskCutGrass extends Task {

	
	public TaskCutGrass() {
		super.setText("I`m just cutting the green green grass");
	}

	@Override
	public void doWork() {
		System.out.println(super.getText());
		
	}

}

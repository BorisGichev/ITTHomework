package sheduler;

public class TaskWashBalls extends Task {

	public TaskWashBalls() {
		super.setText("I`m just washing balls my man");
	}

	@Override
	public void doWork() {
		System.out.println(super.getText());

	}

}

package sheduler;

public class Demo {

	public static void main(String[] args) {
		ITask grass=new TaskCutGrass();
		ITask concreet=new TaskMixConcreete();
		ITask balls=new TaskWashBalls();
		ITask sleep=new TaskDoNotFallAsleep();
		ITask code=new TaskCode();
		
		ISheduler taskManager=new Sheduler();
		
		try {
			taskManager.push(grass);
			taskManager.push(concreet);
			taskManager.push(balls);
			taskManager.push(sleep);
			taskManager.push(code);
			taskManager.push(null);
		} catch (EmptyTaskException e) {
			System.out.println(e.toString());;
		}
		
		taskManager.main();
		
	}

}

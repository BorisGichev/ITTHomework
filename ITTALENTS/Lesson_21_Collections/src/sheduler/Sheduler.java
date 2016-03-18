package sheduler;

import java.util.LinkedList;
import java.util.Queue;

public class Sheduler implements ISheduler {
	private Queue<ITask> tasks;

	public Sheduler() {
		this.tasks = new LinkedList<ITask>();
	}

	public void push(ITask task) throws EmptyTaskException {
		if (task == null) {
			throw new EmptyTaskException(
					"You have given me an empty task you Human!!!");
		}
		this.tasks.offer(task);

	}
	
	public void main(){
		while(tasks.peek()!=null){
			tasks.poll().doWork();
		}
		System.out.println("No more tasks to do bye bye!");
	}

}

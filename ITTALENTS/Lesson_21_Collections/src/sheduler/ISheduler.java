package sheduler;

public interface ISheduler {
	public void push(ITask task) throws EmptyTaskException;
	public void main();
	
	

}

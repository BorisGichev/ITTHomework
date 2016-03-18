package Taks_1;

public class TaskDemo {

	public static void main(String[] args) {
		Employee mark = new Employee("Mark");
		Employee anton = new Employee("Anton");
		Task code = new Task("Coding", 4);
		Task moveBoxes = new Task("Move boxes", 9);
		
//		code.printInfo();
//		moveBoxes.printInfo();
		
		mark.work();
		
		mark.setCurrentTask(code);
		anton.setCurrentTask(moveBoxes);
		
		
		mark.work();

		anton.work();
		
		mark.setCurrentTask(moveBoxes);
		
		mark.work();
		
		
		
	}

}

package Taks_1;

public class AllWorkDemo {

	public static void main(String[] args) {

		AllWork allWork = new AllWork();
		allWork.genarateTasks();
		Employee.setAllWork(allWork);
		Employee mark = new Employee("Mark");
		Employee anton = new Employee("Anton");
		Employee zoro = new Employee("zoro");
		int day = 1;

		do {
			System.out.println("Day " + day + ":");

			mark.startWorkingDay();
			anton.startWorkingDay();
			zoro.startWorkingDay();

			mark.work();
			anton.work();
			zoro.work();

			day++;
		} while (!allWork.isAllWorkDone());

	}

}

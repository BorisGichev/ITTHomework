package Task_3;

public class StudentDemo {

	public static void main(String[] args) {
		Student mark = new Student("Mark", "Medicine", 19);
		Student zork = new Student("Zork", "Transportation", 12);
		Student adam = new Student("Adam", "Medicine", 17);
		adam.setGrade(5);
		Student sandey = new Student("Sandey", "Medicine", 30);
		sandey.setGrade(6);
		
		mark.prinInfo();
		mark.upYear();
		mark.upYear();
		mark.upYear();
		mark.prinInfo();
		mark.receiveScholarship(4, 20);
		mark.receiveScholarship(4, 20);
		mark.receiveScholarship(5, 20);
		sandey.receiveScholarship(4, 15);
		
		
		StudentGroup medicineGroup=new StudentGroup("medicine");
		
		medicineGroup.addStudent(mark);
		medicineGroup.addStudent(zork);
		medicineGroup.addStudent(adam);
		medicineGroup.addStudent(sandey);
		
		medicineGroup.printInfoForTheGroup();
		
		System.out.println("The Best student is "+medicineGroup.theBestStudent());
		
		medicineGroup.emptyGroup();
		medicineGroup.printInfoForTheGroup();
		
	}

}

package Task_3;

public class StudentGroup {

	private String groupSubject;
	private Student[] students;
	private int freePlaces;

	public StudentGroup() {
		this.setStudents(new Student[5]);
		this.freePlaces = 5;
	}

	public StudentGroup(String groupSubject) {
		this();
		this.setGroupSubject(groupSubject);
	}

	public String getGroupSubject() {
		return groupSubject;
	}

	public void setGroupSubject(String groupSubject) {
		if (groupSubject == null || groupSubject.length() == 0) {
			return;
		}
		this.groupSubject = groupSubject;
	}

	public Student[] getStudents() {
		return students;
	}

	public void setStudents(Student[] students) {

		if (students == null || students.length == 0) {
			return;
		}
		this.students = students;

		int countFreePlaces = students.length;
		for (int i = 0; i < students.length; i++) {
			if (students[i] != null) {
				countFreePlaces--;
			}
		}
		this.freePlaces = countFreePlaces;
	}

	public int getFreePlaces() {
		return freePlaces;
	}

	void addStudent(Student student) {

		if (student == null) {
			return;
		}
		if (!(this.getGroupSubject().equalsIgnoreCase(student.getSubject()))) {
			System.out
					.println("The student has a different subject so it was no added to the group");
			return;
		}
		if (this.getFreePlaces() == 0) {
			System.out.println("No free palces in the group");
			return;

		}
		for (int i = 0; i < this.getStudents().length; i++) {
			if (this.getStudents()[i]==null) {
				this.students[i]=student;
				this.freePlaces--;
				return;
			}
		}
	}
	
	void emptyGroup(){
		this.setStudents(new Student[5]);
	}
	
	String theBestStudent(){
		if (this.getFreePlaces()==this.getStudents().length) {
			return "No students in the group";
		}
		double maxGrade=0;
		String name="";
		
		for (int i = 0; i < this.students.length; i++) {
			if (this.students[i]==null) {
				continue;
			}
			if (this.students[i].getGrade()>maxGrade) {
				maxGrade=this.students[i].getGrade();
				name=this.getStudents()[i].getName();
			}
		}
		return name;
	}
	
	void printInfoForTheGroup(){
		for (int i = 0; i < this.students.length; i++) {
			
			if (this.getStudents()[i]!=null) {
				this.getStudents()[i].prinInfo();
			}
			else{
				System.out.println("Empty place");
			}
		}
	}
	
	
}







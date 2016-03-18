package Task_3;

public class Student {

	private String name;
	private String subject;
	private double grade;
	private int yearInCollege;
	private int age;
	private boolean isDegree;
	private double money;

	public Student() {
		this.setGrade(4.0);
		;
		this.setYearInCollege(1);
		this.setDegree(false);
		this.setMoeny(0);
	}

	public Student(String name, String subject, int age) {
		this();
		this.setName(name);
		this.setSubject(subject);
		this.setAge(age);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		if (name == null || name.length() == 0) {
			return;
		}
		this.name = name;
	}

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		if (subject == null || subject.length() == 0) {
			return;
		}
		this.subject = subject;

	}

	public double getGrade() {
		return grade;
	}

	public void setGrade(double grade) {
		if (grade > 6 || grade < 2) {
			return;
		}
		this.grade = grade;
	}

	public int getYearInCollege() {
		return yearInCollege;
	}

	public void setYearInCollege(int yearInCollege) {
		if (yearInCollege < 0) {
			return;
		}
		this.yearInCollege = yearInCollege;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		if (age < 0) {
			return;
		}
		this.age = age;
	}

	public boolean isDegree() {
		return isDegree;
	}

	public void setDegree(boolean isDegree) {
		this.isDegree = isDegree;
	}

	public double getMoeny() {
		return money;
	}

	public void setMoeny(double moeny) {
		this.money = moeny;
	}

	void upYear() {
		if (isDegree) {
			System.out
					.println("This Student has graduated it`s time for his real life to begin");
			return;
		}
		this.setYearInCollege(++this.yearInCollege);

		if (this.getYearInCollege() > 3) {
			this.setDegree(true);
		}

	}
	
	double receiveScholarship(double min, double amount){
		if (amount<0) {
			System.out.println("Invalid input money");
			return this.getMoeny();
		}
		if (min>6||min<2) {
			System.out.println("Minimum grade out of range");
			return this.getMoeny();
		}
		
		if (this.getAge()>29) {
			System.out.println("Student is too old to receive a scholarship");
			return this.getMoeny();
		}
		if (min<=this.getGrade()) {
			this.setMoeny(this.getMoeny()+amount);
		}
		System.out.println(this.getName()+"`s new amount of money: "+this.getMoeny());
		return this.getMoeny();
		
	}
	
	void prinInfo(){
		System.out.println(this.getName());
		System.out.println("Age: "+this.getAge());
		System.out.println("Subject: "+this.getSubject());
		System.out.println("Money: "+this.getMoeny());
		System.out.println("Grade: "+this.getGrade());
		System.out.println("Year in college: "+this.getYearInCollege());
		System.out.println("YGradueated: "+this.isDegree);
		System.out.println();
	}
}

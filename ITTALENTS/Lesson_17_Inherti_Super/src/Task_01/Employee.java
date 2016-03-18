package Task_01;

public class Employee extends Person {

	private static final int AGE_OF_MATURITY = 18;
	private static final int HOURS_PER_DAY = 8;
	private static final double OVERTIME_COEF = 1.5;
	private double daySalary;

	public Employee(String name, int age, boolean isMale, double daySalary) {
		super(name, age, isMale);
		this.setDaySalary(daySalary);

	}

	public double getDaySalary() {
		return daySalary;
	}

	public void setDaySalary(double daySalary) {
		if (daySalary < 0) {
			return;
		}
		this.daySalary = daySalary;
	}

	public void showPersonInfo() {
		this.showEmployeeInfo();

	}

	public void showEmployeeInfo() {

		System.out.println(this.getName() + " has day salary of: "
				+ this.getDaySalary());
		System.out.println(this.getName() + " is " + this.getAge()
				+ " years old");
		System.out.println(this.getName() + " is male: " + this.isMale());
		System.out.println();

	}

	
	
	public double calclateOvertime(double hours) {
		if (this.getAge() < AGE_OF_MATURITY) {
			return 0;
		}
		
		return (this.getDaySalary() / HOURS_PER_DAY) * hours * OVERTIME_COEF;

	}

}

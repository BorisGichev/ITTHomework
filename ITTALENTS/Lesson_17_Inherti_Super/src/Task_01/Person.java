package Task_01;

public class Person {

	private String name;
	private int Age;
	private boolean isMale;
	
	public Person() {

		this.setName("Default");
		this.setAge(20);
		this.isMale = true;

	}

	public Person(String name, int age, boolean isMale) {

		this.setName(name);
		this.setAge(age);
		this.isMale = isMale;

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

	public int getAge() {
		return Age;
	}

	public void setAge(int age) {
		if (age < 0) {
			return;
		}
		Age = age;
	}

	public boolean isMale() {
		return isMale;
	}

	public void showPersonInfo() {
		System.out.println(this.getName() + " is " + this.getAge()
				+ " years old");
		System.out.println(this.getName() + " is male: " + this.isMale());
		System.out.println();

	}
	
	
}

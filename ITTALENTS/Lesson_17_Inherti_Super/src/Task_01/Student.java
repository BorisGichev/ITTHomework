package Task_01;

public class Student extends Person {

	private double score;
	
	/*Ako syzdadem kostruktor bez parametri v Student, eklipse ne ni pozwolqva, ponezhe Student nasledqwa Person, a nie 
	 *sme zatrili konstruktora po podrazbirane v Person i imame samo edin s tri parametyra. A za da se syzdade Student 
	 *se syzdawa i Person koeto zadylvitelno iziskwa parametri w edinstveniq si konstruktor.
	 *Reshavame problema kato si syzdadem konstruktor bez parametri v Person, kojto zadawa nqkakwi stoynosti po podrazbirane.
	 */
	public Student() {
		super();
		this.setScore(4);
	}

	public Student(String name, int age, boolean isMale, double score) {
		super(name, age, isMale);
		this.setScore(score);
	}

	public double getScore() {
		return score;
	}

	public void setScore(double score) {
		if (score < 2 || score > 6) {
			return;
		}
		this.score = score;
	}

	public void showPersonInfo() {
		this.showStudentInfo();

	}

	public void showStudentInfo() {
		System.out
				.println(this.getName() + " has score of: " + this.getScore());
		System.out.println(this.getName() + " is " + this.getAge()
				+ " years old");
		System.out.println(this.getName() + " is male: " + this.isMale());
		System.out.println();

	}

}

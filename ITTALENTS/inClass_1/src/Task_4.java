import java.util.Scanner;

public class Task_4 {

	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		System.out
				.println("Please enter a number and we will tell you if is prime or not");

		int A = read.nextInt();

		boolean Prime = true;

		for (int i = 2; i < A; i++) {
			if (A % i == 0) {
				Prime = false;
				break;
			}

		}

		if (Prime == true) {
			System.out.println("The number is prime");
		}

		if (Prime == false) {
			System.out.println("The number is NOT prime");
		}
		read.close();
	}

}

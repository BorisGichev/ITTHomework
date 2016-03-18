import java.util.Scanner;

public class ten {

	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		System.out
				.println("Please enter a number and we will tell you if is prime or not");

		int a = read.nextInt();

		boolean Prime = true;

		if (a < 0) {
			System.out.println("The numbers smaller than 0 are not prime");
			read.close();
			return;
		}
		if ((a == 0) || (a == 1)) {
			System.out.println("The numbers 0 and 1 are neither prime or not");
			read.close();
			return;
		}
		for (int i = 2; i < a; i++) {
			if (a % i == 0) {
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

import java.util.Scanner;

public class Sixteen {

	public static void main(String[] args) {
		System.out.println("Please enter a three digit positive number");
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();

		if ((a < 100) || (a > 999)) {
			System.out.println("Your number is not made of three digits!");
			sc.close();
			return;
		}

		int a1 = (a % 10);
		int a2 = (a / 10) % 10;
		int a3 = (a / 100) % 10;

		if ((a1 == a2) && (a2 == a3)) {
			System.out.println("The three digits of the number are equal.");
			sc.close();
			return;
		}

		if ((a1 > a2) && (a2 > a3)) {
			System.out.println("The three digits are in ascending order.");
			sc.close();
			return;
		}

		if ((a1 < a2) && (a2 < a3)) {
			System.out.println("The three digits are in descending order.");
			sc.close();
			return;
		} else {
			System.out
					.println("The three digits are neither ascending, descending or equal.");
			sc.close();
		}
	}
}

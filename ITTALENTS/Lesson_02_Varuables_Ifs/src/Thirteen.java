import java.util.Scanner;

public class Thirteen {

	public static void main(String[] args) {
		System.out
				.println("Please enter a whole number in the range [-100;100]");
		Scanner sc = new Scanner(System.in);
		int c = sc.nextInt();
		sc.close();
		if (!((c >= -100) && (c <= 100))) {

			System.out.println("Entered value not in range");
		}

		if ((c >= -100) && (c <= 100)) {
			if (c < -20) {
				System.out.println("Ice cold");
			}

			if ((c >= -20) && (c <= 0)) {
				System.out.println("Cold");
			}

			if ((c > 0) && (c <= 15)) {
				System.out.println("Chilly");
			}

			if ((c > 15) && (c <= 25)) {
				System.out.println("Warm");
			}

			if (c > 25) {
				System.out.println("Hot");
			}
		}
	}

}
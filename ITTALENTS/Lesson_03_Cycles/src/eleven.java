import java.util.Scanner;

public class eleven {

	public static void main(String[] args) {
		System.out
				.println("Please enter one number and we will print you some pattern with it.");
		Scanner test = new Scanner(System.in);
		System.out.println("Please enter number");
		int a1 = test.nextInt();

		// Full pyramid
		for (int h = 0; a1 > h; h++) {

			for (int l = 1; l <= ((a1 * 2) - 1); l++) {

				if ((l <= a1 + h) && (l >= a1 - h)) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}

			}

			System.out.println();

		}

		// Empty pyramid
		for (int h = 0; a1 > h; h++) {

			for (int l = 1; l <= ((a1 * 2) - 1); l++) {

				if (h == a1 - 1) {
					System.out.print("*");
					continue;

				}

				if ((l == a1 + h) || (l == a1 - h)) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}

			}

			System.out.println();

		}

		// Stem
		for (int h = 0; a1 > h; h++) {

			for (int l = 1; l <= ((a1 * 2) - 1); l++) {

				if (l == a1) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}

			}

			System.out.println();

		}
		test.close();

	}

}

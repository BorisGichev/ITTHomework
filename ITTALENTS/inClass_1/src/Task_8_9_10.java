import java.util.Scanner;

public class Task_8_9_10 {

	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		System.out
				.println("Please enter a number and we will print you triangle of stars ");
		int high = read.nextInt();

		for (int j = 0; j < high; j++) {
			for (int i = 1; i <= (high + j); i++) {
				if (i < high - j) {
					System.out.print(" ");

				} else {
					System.out.print("*");
				}

			}
			System.out.println();
		}

		for (int j = 0; j < high; j++) {
			for (int i = 1; i <= (high + j); i++) {
				if (j == high - 1) {
					System.out.print("*");
					continue;

				}
				if ((i == (high - j)) || (i == high + j)) {
					System.out.print("*");
					continue;

				} else {
					System.out.print(" ");
				}

			}
			System.out.println();
		}

		for (int j = 0; j < high; j++) {
			for (int i = 1; i <= (high + j); i++) {

				if (i == high) {
					System.out.print("*");
					continue;

				} else {
					System.out.print(" ");
				}

			}
			System.out.println();
		}
		read.close();
	}

}

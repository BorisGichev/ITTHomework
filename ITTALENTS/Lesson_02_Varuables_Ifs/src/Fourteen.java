import java.util.Scanner;

public class Fourteen {

	public static void main(String[] args) {
		System.out
				.println("Please enter a four numbers that represent coordinates on a chess board and we will tell you if their color is the same");
		Scanner sc = new Scanner(System.in);
		int a1 = sc.nextInt();
		int a2 = sc.nextInt();
		int b1 = sc.nextInt();
		int b2 = sc.nextInt();

		if ((a1 > 8) || (a1 < 1) || (a2 > 8) || (a2 < 1) || (b1 > 8)
				|| (b1 < 1) || (b2 > 8) || (b2 < 1)) {

			System.out.println("Input coordinates out of boundaries");
			sc.close();
			return;
		}

		if ((((a1 + a2) % 2) == 0) && (((b1 + b2) % 2) == 0)) {

			System.out.println("The fields have the same color");
			sc.close();
			return;

		}

		if ((((a1 + a2) % 2) != 0) && (((b1 + b2) % 2) != 0)) {

			System.out.println("The fields have the same color");
			sc.close();
			return;

		}

		else {

			System.out.println("The fields DON`T have the same color");

		}

		sc.close();
	}

}

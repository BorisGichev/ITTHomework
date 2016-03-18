import java.util.Scanner;

public class Eight {

	public static void main(String[] args) {
		boolean flag = true;

		while (flag == true) {
			Scanner input = new Scanner(System.in);
			System.out
					.println("Please enter a whole number in the range [1000;9999]");
			int num = input.nextInt();

			if ((num < 1000) || (num > 9999)) {
				System.out.println("Your number is out of range");
				System.out.println();
				continue;
			}
			int a4 = num % 10;
			int a3 = (num / 10) % 10;
			int a2 = (num / 100) % 10;
			int a1 = (num / 1000) % 10;

			int numA = a1 * 10 + a4;
			int numB = a2 * 10 + a3;

			if (numA > numB) {
				System.out.println("The first number " + numA + " is bigger than the second number " + numB);
			}
			if (numA < numB) {
				System.out.println("The first number " + numA + " is smaller than the second number " + numB);
			}
			if (numA == numB) {
				System.out.println("The first number " + numA
						+ " is equal to the second number " + numB + " .");
			}
			input.close();
			flag = false;
		}

	}

}

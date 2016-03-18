import java.util.Scanner;

public class One {

	public static void main(String[] args) {
		System.out
				.println("Please enter three numbers and we will tell you if the third one is between the first two numbers.");
		Scanner test = new Scanner(System.in);
		System.out.println("Please enter the first one:");
		double a = test.nextDouble();
		System.out.println("Please enter the second one:");
		double b = test.nextDouble();
		System.out.println("Please enter the third one:");
		double c = test.nextDouble();

		if (c == a && c == b) {
			System.out.println("The number " + c + " is equal to " + a + " and " + b + " and it is hard to tell if it is between them");
			test.close();
			return;
		}
		if (c > a && c < b) {
			System.out.println("The number " + c + " is between " + a + " and " + b);
			test.close();
			return;
		}

		if (c < a && c > b) {
			System.out.println("The number " + c + " is between " + a + " and " + b);
			test.close();
			return;
		} else {
			System.out.println("The number " + c + " is NOT between " + a + " and " + b);
			test.close();
			return;
		}

	}

}

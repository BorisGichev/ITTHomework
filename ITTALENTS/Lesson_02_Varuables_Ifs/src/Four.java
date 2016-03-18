import java.util.Scanner;

public class Four {

	public static void main(String[] args) {
		System.out
				.println("Please enter two numbers and we will print them in ascending order");
		Scanner test = new Scanner(System.in);

		System.out.println("Please enter the first one:");
		double a = test.nextDouble();
		System.out.println("Please enter the second one:");
		double b = test.nextDouble();

		if (a == b) {
			System.out.println(b + " is equal to " + a);
		}
		
		if (a > b) {
			System.out.println(b + " ; " + a);
		}

		if (a < b) {
			System.out.println(a + " ; " + b);
		}
		test.close();

	}

}

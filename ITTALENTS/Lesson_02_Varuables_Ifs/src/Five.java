import java.util.Scanner;

public class Five {

	public static void main(String[] args) {
		System.out
				.println("Please enter three numbers and we will print them in descending order.");
		Scanner test = new Scanner(System.in);

		System.out.println("Please enter the first one:");
		int a = test.nextInt();
		System.out.println("Please enter the second one:");
		int b = test.nextInt();
		System.out.println("Please enter the third one:");
		int c = test.nextInt();

		if ((a > b) && (b > c)) {
			System.out.println(a + ";" + b + ";" + c);
		}

		if ((a > c) && (c > b)) {
			System.out.println(a + ";" + c + ";" + b);
		}

		if ((b > a) && (a > c)) {
			System.out.println(b + ";" + a + ";" + c);
		}

		if ((b > c) && (c > a)) {
			System.out.println(b + ";" + c + ";" + a);
		}

		if ((c > a) && (a > b)) {
			System.out.println(c + ";" + a + ";" + b);
		}

		if ((c > b) && (b > a)) {
			System.out.println(c + ";" + b + ";" + a);
		}

		if ((c == b) && (b == a)) {
			System.out.println("The numbers: " + c + ";" + b + ";" + a + " are equal!");
		}

		test.close();

	}

}

import java.util.Scanner;

public class Three {

	public static void main(String[] args) {
		System.out
				.println("Please enter two numbers and we will switch their places in the memory of the computer");
		Scanner test = new Scanner(System.in);

		System.out.println("Please enter the first one:");
		int a = test.nextInt();
		System.out.println("Please enter the second one:");
		int b = test.nextInt();

		System.out.println("Now in the memory of the computer the first one is "+ a + " and the second one is " + b);

		a = a + b;
		b = a - b;
		a = a - b;

		System.out.println("Now in the memory of the computer the first one is "+ a + " and the second one is " + b);
		test.close();
	}

}

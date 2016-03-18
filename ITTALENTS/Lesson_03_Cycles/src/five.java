import java.util.Scanner;

public class five {

	public static void main(String[] args) {
		System.out.println("Please enter two numbers and we will print the numbers between them in ascending order.");
		Scanner test = new Scanner(System.in);
		System.out.println("Please enter the first one:");
		int a1 = test.nextInt();
		System.out.println("Please enter the second one:");
		int a2 = test.nextInt();

		if (a1 == a2) {
			System.out.println("The number " + a1 + " is equal to " + a2
					+ " and it is hard to tell if it is between them");
			test.close();
			return;
		}
		if (a1 > a2) {
			for (; a2 <= a1; a2++) {
				System.out.print(a2 + " ");
			}
			test.close();
			return;
		}

		if (a2 > a1) {
			for (; a1 <= a2; a1++) {
				System.out.print(a1 + " ");
			}
			test.close();
			return;
		}
		test.close();

	}

}

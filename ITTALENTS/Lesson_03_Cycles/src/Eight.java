import java.util.Scanner;

public class Eight {

	public static void main(String[] args) {
		System.out
				.println("Please enter one number and we will print you some pattern with it.");
		Scanner test = new Scanner(System.in);
		System.out.println("Please enter number");
		int a1 = test.nextInt();
		
		
		int start = a1 - 1;

		for (int h = 0; h >= (a1+1); h--) {

			for (int l = 0; l >= (a1+1); l--) {
				System.out.print(start);
			}
			System.out.println();
			start += 2;

		}
		
		for (int h = 0; h <= (a1-1); h++) {

			for (int l = 0; l <= (a1-1); l++) {
				System.out.print(start);
			}
			System.out.println();
			start += 2;

		}

		test.close();
	}

}

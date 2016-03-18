import java.util.Scanner;

public class seven {

	public static void main(String[] args) {
		System.out
				.println("Please enter one number and we will print the first n numbers that divide by three with no lefover.");
		Scanner test = new Scanner(System.in);
		System.out.println("Please enter n:( Positive number)");
		int a1 = test.nextInt();
		
		if (a1 < 0) {
			System.out.println("Invalid input");
		}
		
		if (a1 == 0) {
			System.out.println("You have asked to show you 0 numbers so ....");
		}
		for (int i = 1, j = 0; j < a1; i++) {

			if (i % 3 == 0) {

				System.out.print(i + " ");
				j++;
			}
		}
		test.close();
	}

}

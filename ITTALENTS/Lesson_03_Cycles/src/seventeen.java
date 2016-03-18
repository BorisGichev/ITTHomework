import java.util.Scanner;

public class seventeen {

	public static void main(String[] args) {
		System.out.println("Please enter one number and a sign we will print you some pattern with it.");
		Scanner test = new Scanner(System.in);
		System.out.println("Please enter number");
		int a1 = test.nextInt();
		
		System.out.println("Please enter a sign");
		char a2 = test.next().charAt(0);
		
		
		for (int h = 0; a1 > h; h++) {

			for (int l = 0; l <a1; l++) {

				if (h == 0) {
					System.out.print("*");
					continue;

				}
				
				if (h == a1-1) {
					System.out.print("*");
					continue;

				}
				if ((l ==0) || (l == a1-1)) {
					System.out.print("*");
				} else {
					System.out.print(a2);
				}

			}

			System.out.println();

		}
		test.close();

	}

}

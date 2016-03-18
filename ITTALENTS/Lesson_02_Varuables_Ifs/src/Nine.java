import java.util.Scanner;

public class Nine {

	public static void main(String[] args) {
		boolean flag = true;

		while (flag == true) {
			System.out.println("Please enter two, two digit whole natural numbers in the range of [10;99]");
			System.out.println("and we will multiply them and tell you if the result is even or odd.");
			Scanner test = new Scanner(System.in);

			System.out.println("Please enter the first one:");
			int A = test.nextInt();
			System.out.println("Please enter the second one:");
			int B = test.nextInt();

			if ((A < 10) || (A > 99) || (B < 10) || (B > 99)) {
				System.out
						.println("Your input is out of range, please try again");
				System.out.println();
				continue;
			}

			int C = A * B;
			if (((A * B) % 2) != 0) {
				System.out.println(C + ", " + (A * B) % 10 + " odd");
			}

			if (((A * B) % 2) == 0) {
				System.out.println(C + ", " + (A * B) % 10 + " even");
			}

			test.close();
			flag = false;
		}

	}

}

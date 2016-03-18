import java.util.Scanner;

public class twentyFour {

	public static void main(String[] args) {
		System.out
				.println("Please enter one number in the range[10;30000] and we will tell you if it is a palindrome ");
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter the number:");
		int a = sc.nextInt();

		if ((a > 30000) || (a < 10)) {
			System.out.print("Input out of range");
			sc.close();
			return;
		}

		int rev = 0;
		int temp = a;
		do {
			rev = rev * 10;
			rev = rev + a % 10;
			a = a / 10;
		} while (a > 0);

//		System.out.println(rev);

		if (temp == rev) {
			System.out.println("The number you have entered is a palindrome");
		}

		if (temp != rev) {
			System.out
					.println("The number you have entered is NOT a palindrome");
		}
sc.close();
	}

}

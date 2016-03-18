import java.util.Scanner;

public class Task_3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter number");
		long num = sc.nextLong();
		long numTemp = num;
		long numRev = 0;

		int digits = 0;
		long dec = 1;
		for (; numTemp > 0; digits++) {
			numTemp /= 10;
			dec *= 10;

		}
		numTemp = num;

		for (int i = 0; i < digits; i++) {

			long x = numTemp % 10;
			numTemp /= 10;
			dec /= 10;
			numRev += x * dec;

		}

		if (num == numRev) {
			System.out.println("PAlindrome");
		} else {
			System.out.println("NOT PALINDROME");
		}
		sc.close();

	}
}

import java.util.Scanner;

public class Task_2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter a number");
		int num = sc.nextInt();
		long binary = 0;
		int dec = 1;

		while (num > 0) {

			if (num % 2 == 1) {
				binary = binary + (1 * dec);

			}

			dec *= 10;
			num /= 2;

		}

		System.out.println(binary);
		sc.close();
	}

}

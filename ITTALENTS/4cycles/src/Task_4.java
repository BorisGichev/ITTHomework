import java.util.Scanner;

public class Task_4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter number");
		long num = sc.nextLong();

		for (int i = 1; i <= num; i++) {
			if (num % i == 0) {
				System.out.print(i + " ");

			}
		}
		sc.close();
	}

}

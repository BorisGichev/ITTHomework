import java.util.Scanner;

public class Task_8 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter number.");
		int num = sc.nextInt();

		System.out.println("Please enter symbol.");
		char symbol = sc.next().charAt(0);

		for (int i = 0; i < num; i++) {
			for (int j = 0; j < num; j++) {
				if ((i == 0 || i == num - 1) || (j == 0 || j == (num - 1))) {
					System.out.print("*");

				} else {
					System.out.print(symbol);
				}

			}
			System.out.println();
		}
		sc.close();
	}
}

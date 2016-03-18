import java.util.Scanner;

public class Task_1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter X");
		int x = sc.nextInt();
		System.out.println("Please enter Y");
		int y = sc.nextInt();

		if (x > y) {
			for (int i = y; i <= x; i++) {
				System.out.print(i + " ");

			}

		}

		if (x < y) {
			for (int i = x; i <= y; i++) {
				System.out.print(i + " ");

			}

		}
		sc.close();
	}

}

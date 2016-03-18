import java.util.Scanner;

public class sixteen {

	public static void main(String[] args) {
		System.out.println("Please enter two numbers in the range[10;5555] ");
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter the first one:");
		int a1 = sc.nextInt();
		System.out.println("Please enter the second one:");
		int a2 = sc.nextInt();

		if ((a1 > 5555) || (a1 < 10) || (a2 > 5555) || (a2 < 10)) {
			System.out.print("Input out of range");
			sc.close();
			return;
		}

		if (a1 >= a2) {
			for (; a1 >= a2; a1--) {
				if (a1 % 50 == 0) {
					System.out.print(a1 + ",");
				}
			}
		}

		if (a1 < a2) {
			for (; a2 >= a1; a2--) {
				if (a2 % 50 == 0) {
					System.out.print(a2 + ",");
				}
			}
		}

		sc.close();

	}

}

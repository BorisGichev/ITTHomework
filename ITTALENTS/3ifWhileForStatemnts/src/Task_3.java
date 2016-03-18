import java.util.Scanner;

public class Task_3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Please enter a temperature");
		int a = sc.nextInt();

		if (a < -20) {
			System.out.println("Icy Cold");

		}
		if (a >= -20 && a <= -1) {
			System.out.println("Cold");

		}

		if (a >= 0 && a <= 14) {
			System.out.println("Chilly");

		}
		if (a >= 15 && a <= 25) {
			System.out.println("warm");

		}

		if (a > 25) {
			System.out.println("hot");

		}
		
		sc.close();

	}

}

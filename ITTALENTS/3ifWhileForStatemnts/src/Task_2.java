import java.util.Scanner;

public class Task_2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Please enter a three digit number");
		int a = sc.nextInt();

		int b = sc.nextInt();

		int c = sc.nextInt();

		if (a > b && b > c) {
			System.out.println(a + " " + b + " " + c + " ");

		}
		if (a > c && c > b) {
			System.out.println(a + " " + c + " " + b + " ");

		}

		if (b > c && c > a) {
			System.out.println(b + " " + c + " " + a + " ");
		}
		if (b > a && a > c) {
			System.out.println(b + " " + a + " " + c + " ");

		}

		if (c > b && b > a) {
			System.out.println(c + " " + b + " " + a + " ");
		}
		if (c > a && a > b) {
			System.out.println(c + " " + a + " " + b + " ");

		}
sc.close();
	}

}

import java.util.Scanner;

public class Task_4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Please enter a  three digit number");
		int num = sc.nextInt();

		int c = num % 10;
		num /= 10;
		int b = num % 10;
		num /= 10;
		int a = num % 10;

		if (a == b && b == c) {
			System.out.println("a=b=c");
			sc.close();
			return;

		}

		if (a > b && b > c) {
			System.out.println("a>b>c");
			sc.close();
			return;
		}

		if (a < b && b < c) {
			System.out.println("a<b<c");
			sc.close();
			return;
		} else {
			System.out.println("nothing");
		}
		sc.close();
	}

}

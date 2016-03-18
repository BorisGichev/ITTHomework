import java.util.Scanner;

public class Task_6 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Please enter a four digit number");
		int num = sc.nextInt();

		System.out.println("Thousands " + (num % 10));
		num /= 10;
		System.out.println("Hundreds " + (num % 10));
		num /= 10;
		System.out.println("Tens " + (num % 10));
		num /= 10;
		System.out.println("Ones " + (num % 10));
		num /= 10;
		sc.close();
	}

}

import java.util.Scanner;

public class Task_1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter X");
		int x = sc.nextInt();
		System.out.println("Please enter Y");
		int y = sc.nextInt();

		System.out.println("X+Y = " + (x + y));
		System.out.println("X-Y = " + (x - y));
		System.out.println("X*Y = " + (x * y));
		System.out.println("X/Y = " + (x / y));
		System.out.println("X%Y = " + (x % y));

		sc.close();
	}

}

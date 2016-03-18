import java.util.Scanner;

public class Task_5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Please enter X1");
		int x = sc.nextInt();
		System.out.println("Please enter Y1");
		int y = sc.nextInt();

		System.out.println("Please enter X2");
		int x1 = sc.nextInt();
		System.out.println("Please enter Y2");
		int y1 = sc.nextInt();

		if ((x + y) % 2 == (x1 + y1) % 2) {
			System.out.println("the same");

		} else {
			System.out.println("different");
		}
		sc.close();
	}

}

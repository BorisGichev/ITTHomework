import java.util.Scanner;

public class Task_10 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter a boolean 1");
		boolean a = sc.nextBoolean();

		System.out.println("Enter a boolean 2");
		boolean b = sc.nextBoolean();

		System.out.println("Enter a boolean 3");
		boolean c = sc.nextBoolean();

		System.out.println("Enter a boolean 4");
		boolean d = sc.nextBoolean();

		System.out.println("Enter a boolean 5");
		boolean e = sc.nextBoolean();

		if (a & b & c & d & e) {

			System.out.println("all are TRUE");

		}
		
		else {
			System.out.println("there is NOT true");
		}
		sc.close();


	}

}

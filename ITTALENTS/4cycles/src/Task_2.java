import java.util.Scanner;

public class Task_2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter X");
		int x = sc.nextInt();
		int count = 1;

		for (int i = 1; count <= x; i++) {
			if (i % 3 == 0) {
				System.out.print(i + " ");
				count++;
			}
		}
		sc.close();
	}

}

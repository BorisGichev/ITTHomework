import java.util.Scanner;

public class Task_7 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter number.");
		long num = sc.nextLong();
		int count = 1;
		for (int i = 1; count <= 10; i++) {
			if ((i > num)
					&& ((i % 2 == 0) || (i % 3 == 0) || (i % 5 == 0))) {
				System.out.print(count+":"+i+", ");
				count++;
			}
		}
		sc.close();
	}

}

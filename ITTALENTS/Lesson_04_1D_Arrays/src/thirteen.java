
import java.util.Scanner;

public class thirteen {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out
				.println("Please enter a whole number and we will turn it it to binary?");
		int num = sc.nextInt();
		int temp = num;
		int count = 0;
		if (temp < 0) {
			System.out.print("Please enter a positive number!");
			sc.close();
			return;
		}

		if (num == 0) {
			System.out.println("0");
		}

		for (; temp != 0;) {
			temp = temp / 2;

			count++;

		}
		temp = num;

		int[] arr = new int[count];

		for (int q = 0; q < arr.length; q++) {
			if (num % 2 == 0) {
				arr[arr.length - 1 - q] = 0;
				num /= 2;
				continue;
			}

			if (num % 2 != 0) {
				arr[arr.length - 1 - q] = 1;
				num /= 2;
				continue;
			}

		}
		
		for (int r = 0; r < arr.length; r++) {
			System.out.print(arr[r]);
		}

		sc.close();

	}

}

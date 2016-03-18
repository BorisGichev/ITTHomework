import java.util.Arrays;
import java.util.Scanner;

public class nine {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out
				.println("Please enter an array of whole numbers, but for doing that first tell me how long do you want it to be?");
		int l = sc.nextInt();

		if (l <= 0) {
			System.out
					.println("Invalid input, please enter a whole positive number!!!");
			sc.close();
			return;
		}

		int[] arr = new int[l];
		System.out.println("Now let us start entering the array.");

		for (int q = 0; q < l; q++) {
			arr[q] = sc.nextInt();

		}

		// int[] arr = new int[] { 1, 2, 3, 4, 5 };

		// Using another array

		System.out.println("Using another array");
		int[] arrN = new int[arr.length];
		for (int i = 0; i < arr.length; i++) {
			arrN[arr.length - 1 - i] = arr[i];

		}

		System.out.println(Arrays.toString(arrN));

		// Using + and -
		System.out.println("Using + and -");
		for (int j = 0; j < arr.length / 2; j++) {
			arr[arr.length - 1 - j] = arr[arr.length - 1 - j] + arr[j];
			arr[j] = arr[arr.length - 1 - j] - arr[j];
			arr[arr.length - 1 - j] -= arr[j];
		}
		System.out.println(Arrays.toString(arr));
		sc.close();
	}

}

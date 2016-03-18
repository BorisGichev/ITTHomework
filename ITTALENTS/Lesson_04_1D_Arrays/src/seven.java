import java.util.Scanner;

public class seven {

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

		for (int u = 0; u < l; u++) {
			arr[u] = sc.nextInt();

		}

		int[] arrN = new int[arr.length];

		for (int u = 0; u < arr.length; u++) {
			if (u == 0) {
				arrN[u] = arr[u];
				continue;
			}
			if ((u + 1) == arr.length) {
				arrN[u] = arr[u];
				continue;
			}
			arrN[u] = arr[u - 1] + arr[u + 1];

		}

		for (int b = 0; b < arr.length; b++) {
			System.out.print(arrN[b] + ", ");

		}
		sc.close();
	}

}

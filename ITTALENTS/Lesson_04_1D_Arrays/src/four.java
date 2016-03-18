import java.util.Scanner;

public class four {

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

		int[] arrRev = new int[l];

		boolean isMir = true;
		for (int i = 0; i < l; i++) {
			arrRev[l - 1 - i] = arr[i];
			if (arrRev[l - 1 - i] != arr[l - 1 - i]) {
				isMir = false;
			}
		}

		if (isMir == true) {
			System.out.println("The array is the same when mirrored!");
		} else {
			System.out.println("The array is NOT the same when mirrored!");
		}
		sc.close();
	}

}

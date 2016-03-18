import java.util.Scanner;

public class eight {

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

		for (int j = 0; j < l; j++) {
			arr[j] = sc.nextInt();

		}

//		 int[] arr = new int[] { 1, 1, 1, 2, 2, 2, 2 };
		int length = 0;
		int lengthT = 0;
		int num = 0;

		for (int u = 0; u < arr.length; u++) {

			if (u == (arr.length - 1)) {
				if (lengthT > length) {
					length = lengthT;
					num = arr[u];
					break;
				} else {
					break;
				}

			}

			if (arr[u] == arr[u + 1]) {
				lengthT++;
			}
			if ((arr[u] != arr[u + 1]) && (lengthT > length)) {
				length = lengthT;
				num = arr[u];
				lengthT = 0;

			}

		}

		System.out.print("The longest sequence of equal numbers is ");
		for (int i = 0; i <= length; i++) {
			System.out.print(+num + " ");

		}
		sc.close();
	}

}

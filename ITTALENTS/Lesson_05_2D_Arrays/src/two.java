import java.util.Scanner;

public class two {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the dimension of a square 2d array.");
		int dim = sc.nextInt();

		if (dim <= 0) {
			System.out
					.println("Invalid input, please enter a whole positive number!!!");
			sc.close();
			return;
		}

		int[][] arr = new int[dim][dim];
		System.out.println("Now lets fill in the 1st row.");

		for (int w = 0; w < arr.length; w++) {
			for (int e = 0; e < arr[w].length; e++) {
				arr[w][e] = sc.nextInt();
			}

			System.out.println("fill in next " + (w + 2) + " row");
		}

		for (int o = 0; o < arr.length; o++) {
			for (int p = 0; p < arr[o].length; p++) {
				System.out.print(arr[o][p] + " ");

			}
			System.out.println();
		}

		// int[][] arr = new int[][] { { 48, 72, 13, 14, 15, 10 },
		// { 21, 22, 53, 24, 75, 89 }, { 31, 57, 33, 34, 35, 12 },
		// { 41, 95, 43, 44, 45, 11 }, { 59, 52, 53, 54, 55, 19 },
		// { 61, 69, 63, 64, -9, -30 } };
		System.out.println();
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {

				if (i == j) {
					System.out.print(arr[i][j] + " ");

				}

			}

		}
		System.out.println();
		System.out.println();

		for (int q = 0; q < arr.length; q++) {
			for (int m = 0; m < arr[q].length; m++) {

				if (q + m == arr[q].length - 1) {
					System.out.print(arr[q][m] + " ");

				}
			}

		}
		sc.close();
	}

}

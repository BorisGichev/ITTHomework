import java.util.Scanner;

public class Task_11_3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter rows");
		int rows = sc.nextInt();

		System.out.println("Enter columns");
		int cols = sc.nextInt();

		int[][] arrN = new int[rows][cols];

		int num = 1;

		for (int r1 = 0; r1 < rows; r1++) {

			int r = r1;
			int c = 0;

			while ((r >= 0) && (c < cols)) {
				arrN[r][c] = num++;
				r--;
				c++;

			}

		}

		for (int c2 = 1; c2 < cols; c2++) {

			int r = rows - 1;
			int c = c2;

			while ((r >= 0) && (c < cols)) {
				arrN[r][c] = num++;
				r--;
				c++;

			}

		}

		for (int m = 0; m < arrN.length; m++) {
			for (int n = 0; n < arrN[m].length; n++) {

				System.out.print(arrN[m][n] + " ");

			}
			System.out.println();
		}
		sc.close();

	}

}

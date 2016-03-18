import java.util.Scanner;

public class Task_11_4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter rows");
		int rows = sc.nextInt();

		System.out.println("Enter columns");
		int cols = sc.nextInt();

		int[][] arrN = new int[rows][cols];

		int num = 1;

		for (int c1 = 0; c1 < cols; c1++) {

			int r = 0;
			int c = c1;

			if (c % 2 == 0) {
				while ((r < rows) && (c < cols)) {
					arrN[r][c] = num++;
					r++;

				}

				continue;
			}

			if (c % 2 != 0) {

				int r3 = rows - 1;

				while ((r3 >= 0) && (c < cols)) {
					arrN[r3][c] = num++;
					r3--;
				}
				continue;

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

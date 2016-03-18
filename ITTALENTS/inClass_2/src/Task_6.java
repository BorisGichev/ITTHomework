public class Task_6 {

	public static void main(String[] args) {
		int[][] arrN = { { 4, 7, 3, 4, 0 }, { 3, 1, 3, 4, 10 },
				{ 4, 1, 6, 4, 7 }, { 9, 1, 3, 4, 0 } };

		for (int i = 0; i < arrN.length; i++) {

			for (int j = 0; j < arrN[i].length; j++) {

				System.out.print(arrN[i][j] + " ");
			}
			System.out.println();

		}

		for (int i = 0; i < arrN.length; i++) {

			for (int j = 0; j < arrN[i].length; j++) {
				if (i == j) {
					System.out.print(arrN[i][j] + " ");
				}

			}
			System.out.println();

		}
	}

}

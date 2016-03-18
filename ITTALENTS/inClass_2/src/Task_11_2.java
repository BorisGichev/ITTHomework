public class Task_11_2 {

	public static void main(String[] args) {

		int row = 4;

		int col = 5;

		int[][] arr = new int[row][col];

		int num = 1;

		for (int j = 0; j < col; j++) {

			int c = j;
			int r = 0;

			while (r < row) {
				arr[r][c] = num;
				num++;
				r++;
			}

		}

		for (int j = 0; j < row; j++) {
			for (int i = 0; i < col; i++) {

				System.out.print(arr[j][i] + " ");
			}
			System.out.println();

		}

	}

}

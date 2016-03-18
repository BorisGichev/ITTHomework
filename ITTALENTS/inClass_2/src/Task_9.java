public class Task_9 {

	public static void main(String[] args) {
		int[][] arr = { { 10, 1, 3, 4 }, { 4, 1, 3, 4 }, { 4, 1, 3, 4 },
				{ 4, 1, 3, 4 } };

		long sum = 0;
		long tempSum = 0;
int r=0;
int c=0;
		for (int i = 0; i < arr.length - 1; i++) {
			for (int j = 0; j < arr[i].length - 1; j++) {

				tempSum = arr[i][j] + arr[i + 1][j] + arr[i][j + 1]
						+ arr[i + 1][j + 1];

				if (tempSum > sum) {
					sum = tempSum;
					r=i;
					c=j;

				}
				tempSum = 0;

			}
			if (tempSum > sum) {
				sum = tempSum;

			}
			tempSum = 0;
		}

		System.out.println(sum);
		System.out.println("Row "+r+" Col "+ c);

		for (int m = 0; m < arr.length; m++) {
			for (int n = 0; n < arr[m].length; n++) {
				System.out.print(arr[m][n] + " ");

			}
			System.out.println();
		}

	}

}

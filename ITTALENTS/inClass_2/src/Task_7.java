
public class Task_7 {

	public static void main(String[] args) {
		int[][] arrN = { { 4, 1, 3, 4 }, { 4, 1, 3, 4 }, { 4, 1, 3, 4 }, { 4, 1, 3, 4 } };
		long sum = 1;
		for (int i = 0; i < arrN.length; i++) {
			for (int j = 0; j < arrN[i].length; j++) {
				if (j < i) {
					sum *= arrN[i][j];
				}

			}
			System.out.println();
		}
		System.out.println(sum);

		for (int m = 0; m < arrN.length; m++) {
			for (int n = 0; n < arrN[m].length; n++) {
				System.out.print(arrN[m][n]+" ");

			}
			System.out.println();
		}


	}

}

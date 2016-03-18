public class four {

	public static void main(String[] args) {
		int[][] arr = new int[][] { { 13, 14, 15, 10 }, { 21, 22, 53, 24 },
				{ 33, 34, 35, 12 }, { 41, 95, 43, 44 } };

		int[][] arrR = new int[arr.length][arr[1].length];
		
		for (int m = 0; m < arr.length; m++) {
			for (int q = 0; q < arr[m].length; q++) {
				System.out.print(arr[m][q] + " ");

			}
			System.out.println();

		}

		System.out.println();

		
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {

				arrR[i][j]=arr[arr.length-1-j][i];
				System.out.print(arrR[i][j] + " ");

			}
			System.out.println();

		}

	}

}

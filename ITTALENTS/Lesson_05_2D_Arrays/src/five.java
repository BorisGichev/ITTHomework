public class five {

	public static void main(String[] args) {
		int[][] arr = new int[][] { { 1, 2, 3, 50 }, { 5, 6, 7, 40 },
				{ 9, 10, 11, 12 }, { 13, 14, 15, 16 } };

		long sumRT = 0;
		long sumR = 0;

		long sumCT = 0;
		long sumC = 0;

		for (int m = 0; m < arr.length; m++) {
			for (int q = 0; q < arr[m].length; q++) {
				System.out.print(arr[m][q] + " ");
				sumRT += arr[m][q];
				sumCT += arr[arr.length - 1 - q][m];
			}
			if (sumRT > sumR) {
				sumR = sumRT;
				sumRT = 0;
			}

			if (sumCT > sumC) {
				sumC = sumCT;
				sumCT = 0;
			}
			System.out.println();

		}

		System.out.println("Max sum by rows " + sumR);
		System.out.println("Max sum by rows " + sumC);
		if (sumR > sumC) {
			System.out.println("Max sum by rows > than max sum by columns");

		}

		if (sumR < sumC) {
			System.out.println("Max sum by rows < than max sum by columns");

		}

		if (sumR == sumC) {
			System.out.println("Max sum by rows = than max sum by columns");

		}
	}

}

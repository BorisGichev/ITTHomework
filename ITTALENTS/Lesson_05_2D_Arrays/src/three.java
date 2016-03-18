public class three {

	public static void main(String[] args) {
		int[][] arr = new int[][] { { 48, 72, 13, 14, 15, 10 },
				{ 21, 22, 53, 24, 75, 89 }, { 31, 57, 33, 34, 35, 12 },
				{ 41, 95, 43, 44, 45, 11 }, { 59, 52, 53, 54, 55, 19 },
				{ 61, 69, 63, 64, -9, -30 } };

		double sum = 0;
		int count = 0;
		double av;
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				sum += arr[i][j];
				count++;

			}

		}
		av = sum / count;

		System.out.println("The array has " + count
				+ " numbers.\nThe sum of the array is " + sum
				+ "\nand the average is " + av+".");

	}

}

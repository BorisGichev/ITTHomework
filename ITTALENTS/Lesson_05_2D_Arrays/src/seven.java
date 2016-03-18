public class seven {

	public static void main(String[] args) {

		int[][] arr = new int[][] { 
				{ 11, 12, 13, 14, 15, 16 },
				{ 31, 32, 33, 34, 35, 36 }, 
				{ 41, 42, 43, 44, 45, 46 },
				{ 51, 52, 53, 54, 55, 56 }, 
				{ 61, 62, 63, 64, 65, 66 } };

		long sumTemp = 0;
		long sum = 0;
		
		// The ONE cycle
		for (int i = 0, j = 0; i < arr.length;) {

			if ((i + j + 2) % 2 == 0) {
				System.out.print(arr[i][j]);
				sumTemp += arr[i][j];

			}

			// I made this just to match the output of the task
			if ((i + j + 2) % 2 != 0) {
				System.out.print(" ");

			}

			if ((j + 1) != arr[i].length) {
				System.out.print(",");
			}

			// And this just to use one cycle
			if ((j + 1) != arr[i].length) {
				j++;
				continue;

			}

			if ((j + 1) == arr[i].length) {
				System.out.println(" The sum of all elements on this row ("
						+ (i + 1) + ") with i+j = even number is:" + sumTemp);
				sum += sumTemp;
				sumTemp = 0;
				j = 0;
				i++;
			}

		}

		System.out.println("And the total sum is:" + sum);
	}

}

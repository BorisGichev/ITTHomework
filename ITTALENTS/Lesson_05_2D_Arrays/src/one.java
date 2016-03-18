public class one {

	public static void main(String[] args) {
		int[][] arr = new int[][] { 
				{ 48, 72, 13, 14, 15 },
				{ 21, 22, 53, 24, 75 }, 
				{ 31, 57, 33, 34, 35 },
				{ 41, 95, 43, 44, 45 },
				{ 59, 52, 53, 54, 55 },
				{ 61, 69, 63, 64, -9 } };

		int max = arr[0][0];
		int min = arr[0][0];

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.print(arr[i][j] + " ");
				
				if (arr[i][j] > max) {
					max = arr[i][j];
				}
				if (arr[i][j] < min) {
					min = arr[i][j];
				}
			}
			System.out.println();
			
		}
		System.out.println();
		System.out.println("The maxim value of the array is "+max);
		System.out.println("The minimum value of the array is "+min);
	}

}

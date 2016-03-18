public class six {

	public static void main(String[] args) {
		int[][] arr = new int[6][6];
		long sumTemp = 0;
		long sum = 0;

		for (int w = 0; w < arr.length; w++) {
			for (int e = 0; e < arr[w].length; e++) {
				arr[w][e] = (w + 1) * 10 + e + 1;
				System.out.print(arr[w][e] + " ");

			}
			System.out.println();
		}
		System.out.println();
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {

				if ((i + 1) % 2 == 0) {
					System.out.print(arr[i][j]);
					sumTemp += arr[i][j];

				}
			
				//I made this just to match the output of the task
				if (((j + 1) != arr[i].length)&&((i + 1) % 2 == 0)) {
					System.out.print(",");
				}
				
			}
			if((i+1)%2==0){
				System.out.println(" The sum of this row (" + (i + 1) + ") is:"+ sumTemp);
				sum+=sumTemp;
				sumTemp=0;
			}
					

		}
		System.out.println("And the total sum is:"+sum);
	}

}

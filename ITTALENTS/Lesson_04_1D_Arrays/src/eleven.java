import java.util.Scanner;

public class eleven {

	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
		 System.out.println("Please enter an array of SEVEN whole numbers.");
		
		 int[] arr = new int[7];
		 System.out
		 .println("Now let us start entering 7 whole numbers in the array.");
		
		 for (int j = 0; j < 7; j++) {
		 arr[j] = sc.nextInt();
		
		 }

//		int[] arr = new int[] { 10, -10, 5, -20, 100, 2, 50 };

		int count = 0;
		for (int m = 0; m < arr.length; m++) {
			if ((arr[m] % 5 == 0) && (arr[m] > 5)) {
				System.out.print(arr[m] + ";");
				count++;
			}

		}
		System.out.print(" " + count + " numbers");
		sc.close();
	}

}

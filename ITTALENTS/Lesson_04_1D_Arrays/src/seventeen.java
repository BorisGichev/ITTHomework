import java.util.Scanner;

public class seventeen {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out
				.println("Please enter an array of whole numbers, but for doing that first tell me how long do you want it to be?");
		int l = sc.nextInt();

		if (l <= 2) {
			System.out
					.println("Invalid input, please enter a whole positive number and bigger than two so that we can check if it edgy!!!");
			sc.close();
			return;
		}

		int[] arr = new int[l];
		System.out.println("Now let us start entering the array.");

		for (int j = 0; j < l; j++) {
			arr[j] = sc.nextInt();

		}

//		 int[] arr = new int[] { 3,1, 3, 1, 10, 2, 4, };
		boolean isEdgy = true;

		for (int i = 1; i < arr.length - 1; i++) {
			if (!(((arr[i] > arr[i + 1]) && (arr[i] > arr[i - 1])) || ((arr[i] < arr[i + 1]) && (arr[i] < arr[i - 1])))) {
				isEdgy = false;
			}

		}

		if (isEdgy == true) {
			
			if(arr[0]<arr[1]){
				System.out.println("The arrays IS UP SIDE edgy ");
			}
			
			if(arr[0]>arr[1]){
				System.out.println("The arrays IS DOWN SIDE edgy");
			}
			
		}
		if (isEdgy == false) {
			System.out.println("The arrays is NOT edgy at all");
		}
		sc.close();
	}

}

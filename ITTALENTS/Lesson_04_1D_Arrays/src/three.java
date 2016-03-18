import java.util.Scanner;

public class three {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter a whole number.");
		int num = sc.nextInt();


		int[] arr = new int[10];
		

		for (int u = 0; u < arr.length; u++) {
			if (u < 2){
				arr[u]=num;
			}
			else{
				arr[u]=arr[u-1]+arr[u-2];
			}
				

		}
		for (int b = 0; b < 10; b++) {
			System.out.print(arr[b] + " ");

		}
		sc.close();

	}

}

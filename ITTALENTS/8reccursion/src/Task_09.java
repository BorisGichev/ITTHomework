import java.util.Arrays;

public class Task_09 {

	public static void main(String[] args) {
		int x = 10;

		int[] arr = new int[x];
		arr[0] = 0;
		arr[1] = 1;
		System.out.print("0 1 ");
		int sum=1;
		for (int i = 2; i < arr.length; i++) {
			arr[i] = arr[i - 1] + arr[i - 2];
			
			if (arr[i] > x) {
				System.out.println("\n"+sum);
				return;
			}
			sum+=arr[i];
			System.out.print(arr[i] + " ");
		}
		
	}

}

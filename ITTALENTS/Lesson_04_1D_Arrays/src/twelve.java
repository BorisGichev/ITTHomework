import java.util.Arrays;


public class twelve {

	public static void main(String[] args) {
		

		int[] arr = new int[] { 1, 2, 3, 4, 5, 6, 7 };
		
		int temp = 0;
		temp=arr[1];
		arr[1]=arr[0];
		arr[0]=temp;
		
		
		arr[2] = arr[2] + arr[3];
		arr[3] = arr[2]-arr[3];
		arr[2] = arr[2]-arr[3];
		
		arr[4] = arr[4] * arr[5];
		arr[5] = arr[4]/arr[5];
		arr[4] = arr[4]/arr[5];
	System.out.println(Arrays.toString(arr));
	
	}
}

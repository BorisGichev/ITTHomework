import java.util.Arrays;

public class Task_3 {

	public static void main(String[] args) {
		int[] arr = { 2, 5, 2, 6, 1, 4,1 };
		int[] arrNew = new int[arr.length];

		for (int i = 0; i < arrNew.length; i++) {
			if ((i == 0)||(i == arr.length - 1)) {
				arrNew[i] = arr[i];
				continue;
			}
			else{
				arrNew[i]=arr[i-1]+arr[i+1];
			}
		}
		System.out.println(Arrays.toString(arrNew));
	}

}

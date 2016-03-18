import java.util.Arrays;


public class Task_1 {

	public static void main(String[] args) {
		int[] arr={4,2,5,3,1,2};
		int[] arrRev=new int [arr.length];
		
		for (int i = 0; i < arrRev.length; i++) {
			if (i<arrRev.length/2) {
				arrRev[i]=arr[i];
			}
			else{
				arrRev[arr.length-1-(i-(arr.length/2))]=arr[i];
			}
		}
		System.out.println(Arrays.toString(arr));
		System.out.println(Arrays.toString(arrRev));
	}

}

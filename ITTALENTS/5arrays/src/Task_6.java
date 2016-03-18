
public class Task_6 {

	public static void main(String[] args) {
		int[] arr = { 9, 13, -10, 20, 3, 8, 12, 4, 5, 2, 16 };
		
		for (int i = 0; i < arr.length; i++) {
			if ((arr[i]%5==0)&&(arr[i]>5)) {
				System.out.println(arr[i]+" ");
				
			}
		}

	}

}

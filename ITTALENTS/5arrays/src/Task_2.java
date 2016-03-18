
public class Task_2 {

	public static void main(String[] args) {
		int[] arr={4,2,5,5,2,4};
		
		
		for (int i = 0; i < arr.length/2; i++) {
			if(arr[i]!=arr[arr.length-1-i]){
				System.out.println("It is not mirrored");
				return;
			}
		}
		
		System.out.println("It is equal to the mirrored");

	}

}

public class Task_02 {
	public static void main(String[] args) {
		int[] arr = { 9, 1, 2, 7, 3, 8, 12, 4, 5, 2, 16 };
		System.out.println(findSmall(arr, arr.length-1));
	}

	static int findSmall(int[] arr,int num) {
		
		if (num == 1) {
			int small=arr[0]>arr[1]? arr[1]:arr[0];
			return small;

		}
		
		int small=arr[num]>findSmall(arr, num-1)? findSmall(arr, num-1):arr[num];
		
		return small;
	}
}